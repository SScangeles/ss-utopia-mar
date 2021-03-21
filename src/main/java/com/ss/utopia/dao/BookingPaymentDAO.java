/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.BookingPayment;
import com.ss.utopia.entity.BookingPaymentBuilder;

/**
 * @author Christian Angeles
 *
 */
public class BookingPaymentDAO extends BaseDAO<BookingPayment> {

	public BookingPaymentDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BookingPayment> getList(ResultSet qresult) throws SQLException {
		List<BookingPayment> payments = new ArrayList<>();
		while(qresult.next()) {
			payments.add(new BookingPaymentBuilder(qresult).buildBookingPayment());
		}
		return payments;
	}

	@Override
	public void insert(BookingPayment payment) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into booking_payment(booking_id, stripe_id, refunded)\r\n"
				+ "values (?, ?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {payment.getBookingID().getBookingID(), payment.getStripeID(), payment.getRefunded()});
	}

	@Override
	public void delete(BookingPayment payment) throws SQLException {
		saveData("delete from booking_payment where booking_payment.booking_id = ?", 
				new Object[] {payment.getBookingID().getBookingID()});
	}

	@Override
	public void update(BookingPayment payment) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update booking_payment \r\n"
				+ "set \r\n"
				+ "booking_payment.stripe_id = ?,\r\n"
				+ "booking_payment.refunded = ?,\r\n"
				+ "where booking_payment.booking_id = ?;\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {payment.getStripeID(), payment.getRefunded(), payment.getBookingID().getBookingID()});
	}
	
	public List<BookingPayment> getAllBookingPayment() throws SQLException {
		return readData("select\r\n"
				+ "booking_payment.*,\r\n"
				+ "b.is_active,\r\n"
				+ "b.confirmation_code\r\n"
				+ "from booking_payment\r\n"
				+ "inner join\r\n"
				+ "(select * from booking) as b\r\n"
				+ "on booking_payment.booking_id = b.id", null);
	}
}

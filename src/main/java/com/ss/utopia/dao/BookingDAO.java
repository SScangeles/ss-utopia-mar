/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.Booking;

/**
 * @author Christian Angeles
 *
 */
public class BookingDAO extends BaseDAO<Booking> {

	public BookingDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Booking> getList(ResultSet qresult) throws SQLException {
		List<Booking> bookings = new ArrayList<>();
		while(qresult.next()) {
			Booking booking = new Booking();
			booking.setBookingID(qresult.getInt("booking_id"));
			booking.setIsActive(qresult.getInt("is_active"));
			booking.setConfirmCode(qresult.getString("confirmation_code"));
		}
		return bookings;
	}

	@Override
	public void insert(Booking booking) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into booking(id, is_active, confirmation_code)\r\n"
				+ "values (?, ?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {booking.getBookingID(), booking.getIsActive(), booking.getConfirmCode()});
	}

	@Override
	public void delete(Booking booking) throws SQLException {
		saveData("delete from booking where booking.id = ?", 
				new Object[] {booking.getBookingID()});
	}

	@Override
	public void update(Booking booking) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update booking \r\n"
				+ "set \r\n"
				+ "booking.is_active = ?,\r\n"
				+ "booking.confirmation_code = ?,\r\n"
				+ "where booking.id = ?;\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {booking.getIsActive(), booking.getConfirmCode(), booking.getBookingID()});
	}
	
	public List<Booking> getAllBooking() throws SQLException {
		return readData("select * from booking", null);
	}
}

/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.BookingGuest;
import com.ss.utopia.entity.BookingGuestBuilder;

/**
 * @author Christian Angeles
 *
 */
public class BookingGuestDAO extends BaseDAO<BookingGuest> {

	public BookingGuestDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BookingGuest> getList(ResultSet qresult) throws SQLException {
		List<BookingGuest> guests = new ArrayList<>();
		while(qresult.next()) {
			guests.add(new BookingGuestBuilder(qresult).buildBookingGuest());
		}
		return guests;
	}

	@Override
	public void insert(BookingGuest guest) throws SQLException {
		saveData("insert into booking_guest(booking_id, contact_email, contact_phone)\r\n"
				+ "values (?, ?, ?);", 
				new Object[] {guest.getBookingID().getBookingID(), guest.getContactEmail(), guest.getContactPhone()});
	}

	@Override
	public void delete(BookingGuest guest) throws SQLException {
		saveData("delete from booking_guest where booking_guest.booking_id = ?", 
				new Object[] {guest.getBookingID()});
	}

	@Override
	public void update(BookingGuest guest) throws SQLException {
		saveData("update booking_guest set \r\n"
				+ "booking_guest.contact_email = ?,\r\n"
				+ "booking_guest.contact_phone = ?\r\n"
				+ "where booking_guest.booking_id = ?;", 
				new Object[] {guest.getContactEmail(), guest.getContactPhone(), guest.getBookingID().getBookingID()});
	}
	
	public List<BookingGuest> getAllBookingGuest() throws SQLException {
		return readData("select\r\n"
				+ "booking_guest.*,\r\n"
				+ "b.is_active,\r\n"
				+ "b.confirmation_code\r\n"
				+ "from booking_guest\r\n"
				+ "inner join\r\n"
				+ "(select * from booking) as b\r\n"
				+ "on booking_guest.booking_id = b.id", null);
	}
}

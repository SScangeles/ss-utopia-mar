/**
 * 
 */
package com.ss.utopia.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Christian Angeles
 *
 */
public class BookingGuestBuilder {
	private ResultSet qresult;
	private BookingGuest guest;
	private Booking booking;
	
	public BookingGuestBuilder(ResultSet qresult) {
		this.qresult = qresult;
		guest = new BookingGuest();
		booking = new Booking();
	}
	
	public BookingGuest buildBookingGuest() throws SQLException {
		booking.setBookingID(qresult.getInt("booking_id"));
		booking.setIsActive(qresult.getInt("is_active"));
		booking.setConfirmCode(qresult.getString("confirmation_code"));
		
		guest.setBookingID(booking);
		guest.setContactEmail(qresult.getString("contact_email"));
		guest.setContactPhone(qresult.getString("contact_phone"));
		
		return guest;
	}
}

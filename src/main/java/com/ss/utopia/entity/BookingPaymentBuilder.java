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
public class BookingPaymentBuilder {
	private ResultSet qresult;
	private BookingPayment payment;
	private Booking booking;
	
	public BookingPaymentBuilder(ResultSet qresult) {
		this.qresult = qresult;
		payment = new BookingPayment();
		booking = new Booking();
	}
	
	public BookingPayment buildBookingPayment() throws SQLException {
		booking.setBookingID(qresult.getInt("booking_id"));
		booking.setIsActive(qresult.getInt("is_active"));
		booking.setConfirmCode(qresult.getString("confirmation_code"));
		
		payment.setBookingID(booking);
		payment.setStripeID(qresult.getString("stripe_id"));
		payment.setRefunded(qresult.getInt("refunded"));
		
		return payment;
	}
}

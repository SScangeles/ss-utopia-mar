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
public class PassengerBuilder {
	private ResultSet qresult;
	private Passenger passenger;
	private Booking booking;
	
	public PassengerBuilder(ResultSet qresult) {
		this.qresult = qresult;
		passenger = new Passenger();
		booking = new Booking();
	}
	
	public Passenger buildPassenger() throws SQLException {
		booking.setBookingID(qresult.getInt("booking_id"));
		booking.setIsActive(qresult.getInt("is_active"));
		booking.setConfirmCode(qresult.getString("confirmation_code"));
		
		passenger.setPassengerID(qresult.getInt("passenger_id"));
		passenger.setBookingID(booking);
		passenger.setGivenName(qresult.getString("given_name"));
		passenger.setFamilyName(qresult.getString("family_name"));
		passenger.setDob(qresult.getTimestamp("dob"));
		passenger.setGender(qresult.getString("gender"));
		passenger.setAddress(qresult.getString("address"));
		
		return passenger;
	}
}

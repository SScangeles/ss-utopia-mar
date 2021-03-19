/**
 * 
 */
package com.ss.utopia.entity;

/**
 * @author Christian Angeles
 *
 */
public class FlightBookings {
	private Flight flightID;
	private Booking bookingID;
	/**
	 * @return the flightID
	 */
	public Flight getFlightID() {
		return flightID;
	}
	/**
	 * @param flightID the flightID to set
	 */
	public void setFlightID(Flight flightID) {
		this.flightID = flightID;
	}
	/**
	 * @return the bookingID
	 */
	public Booking getBookingID() {
		return bookingID;
	}
	/**
	 * @param bookingID the bookingID to set
	 */
	public void setBookingID(Booking bookingID) {
		this.bookingID = bookingID;
	}
	
}

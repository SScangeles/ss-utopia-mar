/**
 * 
 */
package com.ss.utopia.entity;

/**
 * @author Christian Angeles
 *
 */
public class BookingUser {
	private Booking bookingID;
	private User userID;
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
	/**
	 * @return the userID
	 */
	public User getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(User userID) {
		this.userID = userID;
	}
	
}

/**
 * 
 */
package com.ss.utopia.entity;

/**
 * @author Christian Angeles
 *
 */
public class BookingGuest {
	private Booking bookingID;
	private String contactEmail;
	private String contactPhone;
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
	 * @return the contactEmail
	 */
	public String getContactEmail() {
		return contactEmail;
	}
	/**
	 * @param contactEmail the contactEmail to set
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	/**
	 * @return the contactPhone
	 */
	public String getContactPhone() {
		return contactPhone;
	}
	/**
	 * @param contactPhone the contactPhone to set
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
}

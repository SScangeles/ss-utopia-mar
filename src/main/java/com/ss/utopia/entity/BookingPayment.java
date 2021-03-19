/**
 * 
 */
package com.ss.utopia.entity;

/**
 * @author Christian Angeles
 *
 */
public class BookingPayment {
	private Booking bookingID;
	private String stripeID;
	private Integer refunded;
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
	 * @return the stripeID
	 */
	public String getStripeID() {
		return stripeID;
	}
	/**
	 * @param stripeID the stripeID to set
	 */
	public void setStripeID(String stripeID) {
		this.stripeID = stripeID;
	}
	/**
	 * @return the refunded
	 */
	public Integer getRefunded() {
		return refunded;
	}
	/**
	 * @param refunded the refunded to set
	 */
	public void setRefunded(Integer refunded) {
		this.refunded = refunded;
	}
	
}

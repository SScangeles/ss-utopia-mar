/**
 * 
 */
package com.ss.utopia.entity;

/**
 * @author Christian Angeles
 *
 */
public class Booking {
	private Integer bookingID;
	private Integer isActive;
	private String confirmCode;
	/**
	 * @return the bookingID
	 */
	public Integer getBookingID() {
		return bookingID;
	}
	/**
	 * @param bookingID the bookingID to set
	 */
	public void setBookingID(Integer bookingID) {
		this.bookingID = bookingID;
	}
	/**
	 * @return the isActive
	 */
	public Integer getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the confirmCode
	 */
	public String getConfirmCode() {
		return confirmCode;
	}
	/**
	 * @param confirmCode the confirmCode to set
	 */
	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
	}
}

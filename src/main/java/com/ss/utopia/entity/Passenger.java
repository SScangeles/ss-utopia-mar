/**
 * 
 */
package com.ss.utopia.entity;

import java.sql.Date;

/**
 * @author Christian Angeles
 *
 */
public class Passenger {
	private Integer passengerID;
	private Booking bookingID;
	private String givenName;
	private String familyName;
	private Date dob;
	private String gender;
	private String address;
	/**
	 * @return the passengerID
	 */
	public Integer getPassengerID() {
		return passengerID;
	}
	/**
	 * @param passengerID the passengerID to set
	 */
	public void setPassengerID(Integer passengerID) {
		this.passengerID = passengerID;
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
	/**
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}
	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}

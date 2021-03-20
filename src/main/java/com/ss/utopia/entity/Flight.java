/**
 * 
 */
package com.ss.utopia.entity;

import java.sql.Timestamp;

/**
 * @author Christian Angeles
 *
 */
public class Flight {
	private Integer flightID;
	private Route routeID;
	private Airplane airplaneID;
	private Timestamp departureTime;
	private Integer reservedSeats;
	private Float seatPrice;
	/**
	 * @return the flightID
	 */
	public Integer getFlightID() {
		return flightID;
	}
	/**
	 * @param flightID the flightID to set
	 */
	public void setFlightID(Integer flightID) {
		this.flightID = flightID;
	}
	/**
	 * @return the routeID
	 */
	public Route getRouteID() {
		return routeID;
	}
	/**
	 * @param routeID the routeID to set
	 */
	public void setRouteID(Route routeID) {
		this.routeID = routeID;
	}
	/**
	 * @return the airplaneID
	 */
	public Airplane getAirplaneID() {
		return airplaneID;
	}
	/**
	 * @param airplaneID the airplaneID to set
	 */
	public void setAirplaneID(Airplane airplaneID) {
		this.airplaneID = airplaneID;
	}
	/**
	 * @return the departureTime
	 */
	public Timestamp getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the reservedSeats
	 */
	public Integer getReservedSeats() {
		return reservedSeats;
	}
	/**
	 * @param reservedSeats the reservedSeats to set
	 */
	public void setReservedSeats(Integer reservedSeats) {
		this.reservedSeats = reservedSeats;
	}
	/**
	 * @return the seatPrice
	 */
	public Float getSeatPrice() {
		return seatPrice;
	}
	/**
	 * @param seatPrice the seatPrice to set
	 */
	public void setSeatPrice(Float seatPrice) {
		this.seatPrice = seatPrice;
	}
	
}

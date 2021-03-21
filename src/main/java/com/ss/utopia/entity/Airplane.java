/**
 * 
 */
package com.ss.utopia.entity;

/**
 * @author Christian Angeles
 *
 */
public class Airplane {
	private Integer airplaneID;
	private AirplaneType airplaneTypeID;
	/**
	 * @return the airplaneID
	 */
	public Integer getAirplaneID() {
		return airplaneID;
	}
	/**
	 * @param airplaneID the airplaneID to set
	 */
	public void setAirplaneID(Integer airplaneID) {
		this.airplaneID = airplaneID;
	}
	/**
	 * @return the airplaneTypeID
	 */
	public AirplaneType getAirplaneTypeID() {
		return airplaneTypeID;
	}
	/**
	 * @param airplaneTypeID the airplaneTypeID to set
	 */
	public void setAirplaneTypeID(AirplaneType airplaneTypeID) {
		this.airplaneTypeID = airplaneTypeID;
	}
}

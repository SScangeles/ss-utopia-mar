/**
 * 
 */
package com.ss.utopia.entity;

/**
 * @author Christian Angeles
 *
 */
public class Route {
	private Integer routeID;
	private Airport originAirportID;
	private Airport destAirportID;
	/**
	 * @return the routeID
	 */
	public Integer getRouteID() {
		return routeID;
	}
	/**
	 * @param routeID the routeID to set
	 */
	public void setRouteID(Integer routeID) {
		this.routeID = routeID;
	}
	/**
	 * @return the originAirportID
	 */
	public Airport getOriginAirportID() {
		return originAirportID;
	}
	/**
	 * @param originAirportID the originAirportID to set
	 */
	public void setOriginAirportID(Airport originAirportID) {
		this.originAirportID = originAirportID;
	}
	/**
	 * @return the destAirPortID
	 */
	public Airport getDestAirportID() {
		return destAirportID;
	}
	/**
	 * @param destAirportID the destAirPortID to set
	 */
	public void setDestAirportID(Airport destAirportID) {
		this.destAirportID = destAirportID;
	}
	
}

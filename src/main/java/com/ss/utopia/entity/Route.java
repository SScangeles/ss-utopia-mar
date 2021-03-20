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
	private Airport destAirPortID;
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
	public Airport getDestAirPortID() {
		return destAirPortID;
	}
	/**
	 * @param destAirPortID the destAirPortID to set
	 */
	public void setDestAirPortID(Airport destAirPortID) {
		this.destAirPortID = destAirPortID;
	}
	
}

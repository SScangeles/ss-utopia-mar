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
	private Airport originAirport;
	private Airport destAirport;
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
	public Airport getOriginAirport() {
		return originAirport;
	}
	/**
	 * @param originAirport the originAirportID to set
	 */
	public void setOriginAirport(Airport originAirport) {
		this.originAirport = originAirport;
	}
	/**
	 * @return the destAirPortID
	 */
	public Airport getDestAirport() {
		return destAirport;
	}
	/**
	 * @param destAirport the destAirPortID to set
	 */
	public void setDestAirport(Airport destAirport) {
		this.destAirport = destAirport;
	}
	
}

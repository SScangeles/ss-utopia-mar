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
	private String originAirportID;
	private String destAirPortID;
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
	public String getOriginAirportID() {
		return originAirportID;
	}
	/**
	 * @param originAirportID the originAirportID to set
	 */
	public void setOriginAirportID(String originAirportID) {
		this.originAirportID = originAirportID;
	}
	/**
	 * @return the destAirPortID
	 */
	public String getDestAirPortID() {
		return destAirPortID;
	}
	/**
	 * @param destAirPortID the destAirPortID to set
	 */
	public void setDestAirPortID(String destAirPortID) {
		this.destAirPortID = destAirPortID;
	}
	
}

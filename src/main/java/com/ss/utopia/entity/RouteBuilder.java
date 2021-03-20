/**
 * 
 */
package com.ss.utopia.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Christian Angeles
 *
 */
public class RouteBuilder {
	private ResultSet qresult;
	private Airport airportOrg;
	private Airport airportDest;
	private Route route;
	
	public RouteBuilder(ResultSet qresult) {
		this.qresult = qresult;
		airportOrg = new Airport();
		airportDest = new Airport();
		route = new Route();
	}
	

	public Route buildRoute() throws SQLException {
		airportOrg.setAirportID(qresult.getString("origin_id"));
		airportOrg.setCity(qresult.getString("origin_city"));
		airportDest.setAirportID(qresult.getString("destination_id"));
		airportDest.setCity(qresult.getString("destination_city"));
		
		route.setRouteID(qresult.getInt("route_id"));
		route.setOriginAirportID(airportOrg);
		route.setDestAirPortID(airportDest);
		
		return route;
	}
}

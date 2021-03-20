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
public class FlightBuilder {
	private ResultSet qresult;
	private Flight flight;
	
	public FlightBuilder(ResultSet qresult) {
		this.qresult = qresult;
		flight = new Flight();
	}
	
	public Flight buildFlight() throws SQLException {
		flight.setFlightID(qresult.getInt("id"));
		flight.setRouteID(new RouteBuilder(qresult).buildRoute());
		flight.setAirplaneID(new AirplaneBuilder(qresult).buildAirplane());
		flight.setDepartureTime(qresult.getTimestamp("departure_time"));
		flight.setReservedSeats(qresult.getInt("reserved_seats"));
		flight.setSeatPrice(qresult.getFloat("seat_price"));
		
		return flight;
	}
}

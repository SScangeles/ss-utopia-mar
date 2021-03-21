/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.FlightBuilder;

/**
 * @author Christian Angeles
 *
 */
public class FlightDAO extends BaseDAO<Flight> {

	public FlightDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Flight> getList(ResultSet qresult) throws SQLException {
		List<Flight> flights = new ArrayList<>();
		while(qresult.next()) {
			flights.add(new FlightBuilder(qresult).buildFlight());
		}
		return flights;
	}

	@Override
	public void insert(Flight flight) throws SQLException  {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into flight(id, route_id, airplane_id, departure_time)\r\n"
				+ "values (?, ?, ?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {flight.getFlightID(), flight.getRouteID(), flight.getAirplaneID(), flight.getDepartureTime()});
	}

	@Override
	public void delete(Flight flight) throws SQLException  {
		saveData("delete from flight where flight.id = ?", 
				new Object[] {flight.getFlightID()});
	}

	@Override
	public void update(Flight flight) throws SQLException  {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update flight \r\n"
				+ "set \r\n"
				+ "flight.route_id = ?,\r\n"
				+ "flight.airplane_id = ?,\r\n"
				+ "flight.departure_time = ?\r\n"
				+ "where flight.id = ?;\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {flight.getRouteID(), flight.getAirplaneID(), flight.getDepartureTime(), flight.getFlightID()});
	}
	
	public List<Flight> getAllFlight() throws SQLException {
		return readData("select \r\n"
				+ "flight.id as flight_id,\r\n"
				+ "flight.*,\r\n"
				+ "rt.destination_id,\r\n"
				+ "rt.origin_id,\r\n"
				+ "a_dest.city as destination_city,\r\n"
				+ "a_origin.city as origin_city,\r\n"
				+ "a.type_id,\r\n"
				+ "a_t.max_capacity\r\n"
				+ "from flight\r\n"
				+ "inner join\r\n"
				+ "(select * from route) as rt\r\n"
				+ "on flight.route_id = rt.id\r\n"
				+ "inner join\r\n"
				+ "(select * from airport) as a_dest\r\n"
				+ "on a_dest.iata_id = rt.destination_id\r\n"
				+ "inner join\r\n"
				+ "(select * from airport) as a_origin\r\n"
				+ "on a_origin.iata_id = rt.origin_id\r\n"
				+ "inner join\r\n"
				+ "(select * from airplane) as a\r\n"
				+ "on flight.airplane_id = a.id\r\n"
				+ "inner join\r\n"
				+ "(select * from airplane_type) as a_t\r\n"
				+ "on a.type_id = a_t.id", 
				null);
	}
}

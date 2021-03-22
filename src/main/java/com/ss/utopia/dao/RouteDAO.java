/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.Route;
import com.ss.utopia.entity.RouteBuilder;

/**
 * @author Christian Angeles
 *
 */
public class RouteDAO extends BaseDAO<Route> {

	public RouteDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Route> getList(ResultSet qresult) throws SQLException {
		List<Route> routes = new ArrayList<>();
		while(qresult.next()) {
			routes.add(new RouteBuilder(qresult).buildRoute());
		}
		return routes;
	}

	@Override
	public void insert(Route route) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into route(id, origin_id, destination_id)\r\n"
				+ "values (?, ?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {route.getRouteID(), route.getOriginAirport().getAirportID(), 
						route.getDestAirport().getAirportID()});
	}

	@Override
	public void delete(Route route) throws SQLException {
		saveData("delete from route where route.id = ?", 
				new Object[] {route.getRouteID()});
	}

	@Override
	public void update(Route route) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update route \r\n"
				+ "set \r\n"
				+ "route.origin_id = ?,\r\n"
				+ "route.destination_id = ?,\r\n"
				+ "where route.id = ?;\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {route.getOriginAirport().getAirportID(), route.getDestAirport().getAirportID(), 
						route.getRouteID()});
	}
	
	public List<Route> getAllRoute() throws SQLException {
		return readData("select\r\n"
				+ "route.id as route_id,\r\n"
				+ "route.*,\r\n"
				+ "a_origin.city as origin_city,\r\n"
				+ "a_dest.city as destination_city\r\n"
				+ "from route\r\n"
				+ "inner join\r\n"
				+ "(select * from airport) as a_origin\r\n"
				+ "on route.origin_id = a_origin.iata_id\r\n"
				+ "inner join\r\n"
				+ "(select * from airport) as a_dest\r\n"
				+ "on route.destination_id = a_dest.iata_id", null);
	}

}

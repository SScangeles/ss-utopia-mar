/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.Airport;


/**
 * @author Christian Angeles
 *
 */
public class AirportDAO extends BaseDAO<Airport> {

	public AirportDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Airport> getList(ResultSet qresult) throws SQLException {
		List<Airport> airports = new ArrayList<>();
		while(qresult.next()) {
			Airport airport = new Airport();
			airport.setAirportID(qresult.getString("iata_id"));
			airport.setCity(qresult.getString("city"));
		}
		return airports;
	}

	@Override
	public void insert(Airport airport) throws SQLException {
		saveData("insert into airport(iata_id, city)\r\n"
				+ "values (?, ?);", 
				new Object[] {airport.getAirportID(), airport.getCity()});
	}

	@Override
	public void delete(Airport airport) throws SQLException {
		saveData("delete from airport where airport.iata_id = ?", 
				new Object[] {airport.getAirportID()});
	}

	@Override
	public void update(Airport airport) throws SQLException {
		saveData("update airport set \r\n"
				+ "airport.city = ?\r\n"
				+ "where airport.iata_id = ?;", 
				new Object[] {airport.getCity(), airport.getAirportID()});
	}
	
	public List<Airport> getAllAirport() throws SQLException {
		return readData("select * from airport", null);
	}
}

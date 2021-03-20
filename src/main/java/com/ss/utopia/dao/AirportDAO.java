/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Airport airport) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Airport airport) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Airport airport) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

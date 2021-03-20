/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.FlightBookings;

/**
 * @author Christian Angeles
 *
 */
public class FlightBookingsDAO extends BaseDAO<FlightBookings> {

	public FlightBookingsDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<FlightBookings> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(FlightBookings obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(FlightBookings obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FlightBookings obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

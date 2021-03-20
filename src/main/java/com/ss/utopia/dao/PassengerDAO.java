/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.Passenger;

/**
 * @author Christian Angeles
 *
 */
public class PassengerDAO extends BaseDAO<Passenger> {

	public PassengerDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Passenger> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Passenger obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Passenger obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Passenger obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

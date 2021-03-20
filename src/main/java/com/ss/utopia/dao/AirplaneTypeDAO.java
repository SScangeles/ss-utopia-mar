/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.AirplaneType;

/**
 * @author Christian Angeles
 *
 */
public class AirplaneTypeDAO extends BaseDAO<AirplaneType> {

	public AirplaneTypeDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<AirplaneType> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(AirplaneType airplanetype) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(AirplaneType airplanetype) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AirplaneType airplanetype) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

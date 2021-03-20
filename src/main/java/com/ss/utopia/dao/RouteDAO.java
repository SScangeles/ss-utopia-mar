/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.Route;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Route obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Route obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Route obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

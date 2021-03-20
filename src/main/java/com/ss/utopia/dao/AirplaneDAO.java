/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.Airplane;

/**
 * @author Christian Angeles
 *
 */
public class AirplaneDAO extends BaseDAO<Airplane> {

	public AirplaneDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Airplane> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Airplane airplane) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Airplane airplane) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Airplane airplane) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

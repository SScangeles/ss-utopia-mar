/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.User;

/**
 * @author Christian Angeles
 *
 */
public class UserDAO extends BaseDAO<User> {

	public UserDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

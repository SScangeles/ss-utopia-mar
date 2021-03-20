/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.UserRole;

/**
 * @author Christian Angeles
 *
 */
public class UserRoleDAO extends BaseDAO<UserRole> {

	public UserRoleDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UserRole> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(UserRole obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserRole obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserRole obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

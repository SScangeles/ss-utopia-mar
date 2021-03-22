/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		List<UserRole> roles = new ArrayList<>();
		while(qresult.next()) {
			UserRole role = new UserRole();
			role.setRoleID(qresult.getInt("id"));
			role.setName(qresult.getString("name"));
		}
		return roles;
	}

	@Override
	public void insert(UserRole role) throws SQLException {
		saveData("insert into user_role(id, name)\r\n"
				+ "values (?, ?);", 
				new Object[] {role.getRoleID(), role.getName()});
	}

	@Override
	public void delete(UserRole role) throws SQLException {
		saveData("delete from user_role where user_role.id = ?", 
				new Object[] {role.getRoleID()});
	}

	@Override
	public void update(UserRole role) throws SQLException {
		saveData("update user_role set \r\n"
				+ "user_role.name = ?,\r\n"
				+ "where user_role.id = ?;", 
				new Object[] {role.getName(), role.getRoleID()});
	}
	
	public List<UserRole> getAllUserRole() throws SQLException {
		return readData("select * from user_role", null);
	}
}

/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.User;
import com.ss.utopia.entity.UserBuilder;

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
		List<User> users = new ArrayList<>();
		while(qresult.next()) {
			users.add(new UserBuilder(qresult).buildUser());
		}
		return users;
	}

	@Override
	public void insert(User user) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into user(id, role_id, given_name, family_name, username, email, password, phone)\r\n"
				+ "values (?, ?, ?, ?, ?, ?, ?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {user.getUserID(), user.getRoleID().getRoleID(), user.getGivenName(), user.getFamilyName(), 
						user.getUsername(), user.getEmail(), user.getPassword(), user.getPhone()});
	}

	@Override
	public void delete(User user) throws SQLException {
		saveData("delete from user where user.id = ?", 
				new Object[] {user.getUserID()});
	}

	@Override
	public void update(User user) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update user \r\n"
				+ "set \r\n"
				+ "user.role_id = ?,\r\n"
				+ "user.given_name = ?,\r\n"
				+ "user.family_name = ?,\r\n"
				+ "user.username = ?,\r\n"
				+ "user.email = ?,\r\n"
				+ "user.password = ?,\r\n"
				+ "user.phone = ?,\r\n"
				+ "where user.id = ?;\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {user.getRoleID().getRoleID(), user.getGivenName(), user.getFamilyName(), user.getUsername(), 
						user.getEmail(), user.getPassword(), user.getPhone(), user.getUserID()});
	}
	
	public List<User> getAllUser() throws SQLException {
		return readData("select\r\n"
				+ "u.id as user_id,\r\n"
				+ "u.*,\r\n"
				+ "u_r.name\r\n"
				+ "from user u\r\n"
				+ "inner join\r\n"
				+ "(select * from user_role) as u_r\r\n"
				+ "on u.role_id = u_r.id", null);
	}
}

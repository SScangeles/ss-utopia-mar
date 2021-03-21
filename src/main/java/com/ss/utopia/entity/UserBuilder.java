/**
 * 
 */
package com.ss.utopia.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Christian Angeles
 *
 */
public class UserBuilder {
	private ResultSet qresult;
	private User user;
	private UserRole role;
	
	public UserBuilder(ResultSet qresult) {
		this.qresult = qresult;
		user = new User();
		role = new UserRole();
	}
	
	public User buildUser() throws SQLException {
		role.setRoleID(qresult.getInt("role_id"));
		role.setName(qresult.getString("name"));
				
		user.setUserID(qresult.getInt("user_id"));
		user.setRoleID(role);
		user.setGivenName(qresult.getString("given_name"));
		user.setFamilyName(qresult.getString("family_name"));
		user.setUsername(qresult.getString("username"));
		user.setEmail(qresult.getString("email"));
		user.setPassword(qresult.getString("password"));
		user.setPassword(qresult.getString("phone"));
		
		return user;
	}
}

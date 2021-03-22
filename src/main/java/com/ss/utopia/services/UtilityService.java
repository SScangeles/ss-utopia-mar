/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Christian Angeles
 *
 */
public class UtilityService {
	private final String driver;
	private final String url;
	private final String username;
	private final String password;
	
	public UtilityService() {
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/utopia";
		username = "root";
		password = "root";
	}
	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		connection.setAutoCommit(Boolean.FALSE);
		return connection;
	}
}

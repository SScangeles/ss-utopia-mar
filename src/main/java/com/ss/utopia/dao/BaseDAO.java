/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Christian Angeles
 *
 */
public abstract class BaseDAO<T> {
	protected Connection connection;
	
	public BaseDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void saveData(String sql, Object[] objVals) throws ClassNotFoundException, SQLException {
		PreparedStatement prepStmt = connection.prepareStatement(sql);
		if(objVals != null) {
			int count = 1;
			for(Object vals: objVals) {
				prepStmt.setObject(count, vals);
				count += 1;
			}
		}
		prepStmt.executeUpdate();
	}
	
	public List<T> readData(String sql, Object[] objVals) throws ClassNotFoundException, SQLException {
		PreparedStatement prepStmt = connection.prepareStatement(sql);
		if(objVals != null) {
			int count = 1;
			for(Object vals: objVals) {
				prepStmt.setObject(count, vals);
				count += 1;
			}
		}
		ResultSet qresult = prepStmt.executeQuery();
		return getData(qresult);
	}
	
	public abstract List<T> getData(ResultSet qresult) throws ClassNotFoundException, SQLException;
}

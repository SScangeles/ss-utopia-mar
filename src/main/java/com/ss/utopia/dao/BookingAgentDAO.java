/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.BookingAgent;

/**
 * @author Christian Angeles
 *
 */
public class BookingAgentDAO extends BaseDAO<BookingAgent> {

	/**
	 * @param connection
	 */
	public BookingAgentDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BookingAgent> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(BookingAgent obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BookingAgent obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookingAgent obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

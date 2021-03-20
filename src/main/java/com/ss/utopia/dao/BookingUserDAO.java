/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.BookingUser;

/**
 * @author Christian Angeles
 *
 */
public class BookingUserDAO extends BaseDAO<BookingUser> {

	public BookingUserDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BookingUser> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(BookingUser obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BookingUser obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookingUser obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

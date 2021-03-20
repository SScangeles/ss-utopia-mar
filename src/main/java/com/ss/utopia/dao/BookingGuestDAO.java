/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.BookingGuest;

/**
 * @author Christian Angeles
 *
 */
public class BookingGuestDAO extends BaseDAO<BookingGuest> {

	public BookingGuestDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BookingGuest> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(BookingGuest obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BookingGuest obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookingGuest obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}

/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.BookingPayment;

/**
 * @author Christian Angeles
 *
 */
public class BookingPaymentDAO extends BaseDAO<BookingPayment> {

	public BookingPaymentDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BookingPayment> getList(ResultSet qresult) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(BookingPayment obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BookingPayment obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookingPayment obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}

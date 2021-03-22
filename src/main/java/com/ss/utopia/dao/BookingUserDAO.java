/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		List<BookingUser> users = new ArrayList<>();
		while(qresult.next()) {
			BookingUser user = new BookingUser();
			user.setBookingID(qresult.getInt("booking_id"));
			user.setUserID(qresult.getInt("user_id"));
		}
		return users;
	}

	@Override
	public void insert(BookingUser user) throws SQLException {
		saveData("insert into booking_user(booking_id, user_id)\r\n"
				+ "values (?, ?);", 
				new Object[] {user.getBookingID(), user.getUserID()});
	}

	@Override
	public void delete(BookingUser user) throws SQLException {
		saveData("delete from booking_user where booking_user.booking_id = ?", 
				new Object[] {user.getBookingID()});
	}

	@Override
	public void update(BookingUser user) throws SQLException {
		saveData("update booking_user set \r\n"
				+ "booking_user.user_id = ?\r\n"
				+ "where booking_user.booking_id = ?", 
				new Object[] {user.getUserID(), user.getBookingID()});
	}
	
	public List<BookingUser> getBookingUserByUserID(Integer userID) throws SQLException {
		return readData("select * from booking_user where user_id = ?", new Object[] {userID});
	}
	
	public List<BookingUser> getAllBookingUser() throws SQLException {
		return readData("select * from booking_user", null);
	}
}

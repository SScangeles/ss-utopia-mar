/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.FlightBookings;

/**
 * @author Christian Angeles
 *
 */
public class FlightBookingsDAO extends BaseDAO<FlightBookings> {

	public FlightBookingsDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<FlightBookings> getList(ResultSet qresult) throws SQLException {
		List<FlightBookings> flightbooks = new ArrayList<>();
		while(qresult.next()) {
			FlightBookings flightbook = new FlightBookings();
			flightbook.setFlightID(qresult.getInt("flight_id"));
			flightbook.setBookingID(qresult.getInt("booking_id"));
		}
		return flightbooks;
	}

	@Override
	public void insert(FlightBookings flightbook) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into flight_bookings(flight_id, booking_id)\r\n"
				+ "values (?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {flightbook.getFlightID(), flightbook.getBookingID()});
	}

	@Override
	public void delete(FlightBookings flightbook) throws SQLException {
		saveData("delete from flight_bookings where flight_bookings.flight_id = ?", 
				new Object[] {flightbook.getFlightID()});
	}

	@Override
	public void update(FlightBookings flightbook) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update flight_bookings \r\n"
				+ "set \r\n"
				+ "flight_bookings.flight_id = ?,\r\n"
				+ "flight_bookings.booking_id = ?,\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {flightbook.getFlightID(), flightbook.getBookingID()});
	}
	
	public List<FlightBookings> getAllFlightBookings() throws SQLException {
		return readData("select * from flight_bookings", null);
	}
}

/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.Passenger;
import com.ss.utopia.entity.PassengerBuilder;

/**
 * @author Christian Angeles
 *
 */
public class PassengerDAO extends BaseDAO<Passenger> {

	public PassengerDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Passenger> getList(ResultSet qresult) throws SQLException {
		List<Passenger> passengers = new ArrayList<>();
		while(qresult.next()) {
			passengers.add(new PassengerBuilder(qresult).buildPassenger());
		}
		return passengers;
	}

	@Override
	public void insert(Passenger passenger) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into passenger(id, booking_id, given_name, family_name, dob, gender, address)\r\n"
				+ "values (?, ?, ?, ?, ?, ?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {passenger.getPassengerID(), passenger.getBookingID().getBookingID(), passenger.getGivenName(), 
						passenger.getFamilyName(), passenger.getDob(), passenger.getGender(), passenger.getAddress()});
	}

	@Override
	public void delete(Passenger passenger) throws SQLException {
		saveData("delete from passenger where passenger.id = ?", 
				new Object[] {passenger.getPassengerID()});
	}

	@Override
	public void update(Passenger passenger) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update passenger \r\n"
				+ "set \r\n"
				+ "passenger.booking_id = ?,\r\n"
				+ "passenger.given_name = ?,\r\n"
				+ "passenger.family_name = ?,\r\n"
				+ "passenger.dob = ?,\r\n"
				+ "passenger.gender = ?,\r\n"
				+ "passenger.address = ?,\r\n"
				+ "where passenger.id = ?;\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {passenger.getBookingID().getBookingID(), passenger.getGivenName(), passenger.getFamilyName(), 
						passenger.getDob(), passenger.getGender(), passenger.getAddress(), passenger.getPassengerID()});
	}
	
	public List<Passenger> getAllPassenger() throws SQLException {
		return readData("select\r\n"
				+ "passenger.id as passenger_id,\r\n"
				+ "passenger.*,\r\n"
				+ "b.is_active,\r\n"
				+ "b.confirmation_code\r\n"
				+ "from passenger\r\n"
				+ "inner join\r\n"
				+ "(select * from booking) as b\r\n"
				+ "on passenger.booking_id = b.id", null);
	}
}

/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.Airplane;
import com.ss.utopia.entity.AirplaneBuilder;

/**
 * @author Christian Angeles
 *
 */
public class AirplaneDAO extends BaseDAO<Airplane> {

	public AirplaneDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Airplane> getList(ResultSet qresult) throws SQLException {
		List<Airplane> airplanes = new ArrayList<>();
		while(qresult.next()) {
			airplanes.add(new AirplaneBuilder(qresult).buildAirplane());
		}
		return airplanes;
	}

	@Override
	public void insert(Airplane airplane) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "insert into airplane(id, type_id)\r\n"
				+ "values (?, ?);"
				+ "set foreign_key_checks = 1;\r\n", 
				new Object[] {airplane.getAirplaneID(), airplane.getAirplaneTypeID().getAirplaneTypeID()});
	}

	@Override
	public void delete(Airplane airplane) throws SQLException {
		saveData("delete from airplane where airplane.id = ?", 
				new Object[] {airplane.getAirplaneID()});
	}

	@Override
	public void update(Airplane airplane) throws SQLException {
		saveData("set foreign_key_checks = 0;\r\n"
				+ "update airplane \r\n"
				+ "set \r\n"
				+ "airplane.type_id = ?,\r\n"
				+ "where airplane.id = ?;\r\n"
				+ "set foreign_key_checks = 1;", 
				new Object[] {airplane.getAirplaneTypeID().getAirplaneTypeID(), airplane.getAirplaneID()});
	}
	
	public List<Airplane> getAllAirplane() throws SQLException {
		return readData("select\r\n"
				+ "airplane.id as airplane_id,\r\n"
				+ "airplane.*,\r\n"
				+ "a_t.max_capacity\r\n"
				+ "from airplane\r\n"
				+ "inner join\r\n"
				+ "(select * from airplane_type) as a_t\r\n"
				+ "on airplane.type_id = a_t.id", null);
	}
}

/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.AirplaneType;

/**
 * @author Christian Angeles
 *
 */
public class AirplaneTypeDAO extends BaseDAO<AirplaneType> {

	public AirplaneTypeDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<AirplaneType> getList(ResultSet qresult) throws SQLException {
		List<AirplaneType> airplaneTypes = new ArrayList<>();
		while(qresult.next()) {
			AirplaneType type = new AirplaneType();
			type.setAirplaneTypeID(qresult.getInt("id"));
			type.setMaxCap(qresult.getInt("max_capacity"));
			airplaneTypes.add(type);
		}
		return airplaneTypes;
	}

	@Override
	public void insert(AirplaneType airplanetype) throws SQLException {
		saveData("insert into airplane_type(id, max_capacity)\r\n"
				+ "values (?, ?);", 
				new Object[] {airplanetype.getAirplaneTypeID(), airplanetype.getMaxCap()});
	}

	@Override
	public void delete(AirplaneType airplanetype) throws SQLException {
		saveData("delete from airplane_type where airplane_type.id = ?", 
				new Object[] {airplanetype.getAirplaneTypeID()});
	}

	@Override
	public void update(AirplaneType airplanetype) throws SQLException {
		saveData("update airplane_type set \r\n"
				+ "airplane_type.max_capacity = ?\r\n"
				+ "where airplane_type.id = ?;", 
				new Object[] {airplanetype.getMaxCap(), airplanetype.getAirplaneTypeID()});
	}
	
	public List<AirplaneType> getAllAirplaneType() throws SQLException {
		return readData("select * from airplane_type", null);
	}
}

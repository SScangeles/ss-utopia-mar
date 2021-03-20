/**
 * 
 */
package com.ss.utopia.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Christian Angeles
 *
 */
public class AirplaneBuilder {
	private ResultSet qresult;
	private AirplaneType airplaneType;
	private Airplane airplane;
	
	public AirplaneBuilder(ResultSet qresult) {
		this.qresult = qresult;
		airplaneType = new AirplaneType();
		airplane = new Airplane();
	}
	
	public Airplane buildAirplane() throws ClassNotFoundException, SQLException {
		airplaneType.setAirplaneTypeID(qresult.getInt("type_id"));
		airplaneType.setMaxCap(qresult.getInt("max_capacity"));
		
		airplane.setAirplaneID(qresult.getInt("airplane_id"));
		airplane.setAirplaneTypeID(airplaneType);
		
		return airplane;
	}
}

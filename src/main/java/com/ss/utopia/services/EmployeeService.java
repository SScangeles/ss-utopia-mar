/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.dao.FlightDAO;
import com.ss.utopia.entity.Flight;

/**
 * @author Christian Angeles
 *
 */
public class EmployeeService {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public EmployeeService() {
		serviceUtil = new ServiceUtil();
		connection = null;
	}
	
	public List<Flight> getFlights() throws ClassNotFoundException, SQLException {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			return null;
		}
		finally {
			connection.close();
		}
	}
	
}

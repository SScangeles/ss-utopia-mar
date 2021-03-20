/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
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
	
	public List<Flight> getAllFlight() throws SQLException {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			connection.commit();
			return flightdao.getAllFlight();
		}
		catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
			if(connection != null) {
				connection.rollback();
			}
			return new ArrayList<Flight>();
		}
		finally {
			if(connection != null) {
				connection.close();
			}
		}
	}
	
}

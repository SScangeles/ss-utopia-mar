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
	
	public List<Flight> getAllFlight() {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			return flightdao.getAllFlight();
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("ClassNotFoundException: "+cnfe.getMessage());
			return new ArrayList<Flight>();
		}
		catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle.getMessage());
			return new ArrayList<Flight>();
		}
		finally {
			if(connection != null) {
				try {
					connection.close();
				}
				catch(SQLException sqle) {
					System.out.println("SQLException: "+sqle.getMessage());
				}
			}
		}
	}
	
}

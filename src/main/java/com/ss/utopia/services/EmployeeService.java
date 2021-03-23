/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;

import com.ss.utopia.dao.FlightDAO;
import com.ss.utopia.dao.RouteDAO;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.Route;

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
	/**
	 * 
	 * @param flight
	 * @param route
	 */
	public boolean updateFlightRoute(Flight flight, Route route) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			RouteDAO routedao = new RouteDAO(connection);
			routedao.update(route);
			flightdao.update(flight);
			connection.commit();
			return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			if(connection != null) {
				try {
					connection.rollback();
				}
				catch(SQLException rollEx) {
					System.out.println("SQLException: "+rollEx.getMessage());
				}
			}
			return false;
		}
		finally {
			if(connection != null) {
				try {
					connection.close();
				}
				catch(SQLException closeEx) {
					System.out.println("SQLException: "+closeEx.getMessage());
				}
			}
		}
	}

}

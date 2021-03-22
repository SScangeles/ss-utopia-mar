/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.dao.FlightDAO;
import com.ss.utopia.dao.UserDAO;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.User;

/**
 * @author Christian Angeles
 *
 */
public class TravelerService {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public TravelerService() {
		serviceUtil = new ServiceUtil();
		connection = null;
	}
	
	public List<User> getUserList() {
		try {
			connection = serviceUtil.getConnection();
			UserDAO userdao = new UserDAO(connection);
			
			return userdao.getAllUser();
		}
		catch(ClassNotFoundException cnfEx) {
			System.out.println("ClassNotFoundException: "+cnfEx.getMessage());
			return new ArrayList<User>();
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
			return new ArrayList<User>();
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

	public List<Flight> getFlightList() {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			return flightdao.getAllFlight();
		}
		catch(ClassNotFoundException cnfEx) {
			System.out.println("ClassNotFoundException: "+cnfEx.getMessage());
			return new ArrayList<Flight>();
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
			return new ArrayList<Flight>();
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
	
	public List<Flight> getFlight(Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			return flightdao.getFlightByID(flight);
		}
		catch(ClassNotFoundException cnfEx) {
			System.out.println("ClassNotFoundException: "+cnfEx.getMessage());
			return new ArrayList<Flight>();
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
			return new ArrayList<Flight>();
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

/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	 * @return
	 */
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

	public void updateFlight(Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			flightdao.update(flight);
			connection.commit();
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("ClassNotFoundException: "+cnfe.getMessage());
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
			if(connection != null) {
				try {
					connection.rollback();
				}
				catch(SQLException rollEx) {
					System.out.println("SQLException: "+rollEx.getMessage());
				}
			}
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

	public void updateRoute(Route route) {
		try {
			connection = serviceUtil.getConnection();
			RouteDAO routedao = new RouteDAO(connection);
			routedao.update(route);
			connection.commit();
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("ClassNotFoundException: "+cnfe.getMessage());
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
			if(connection != null) {
				try {
					connection.rollback();
				}
				catch(SQLException rollEx) {
					System.out.println("SQLException: "+rollEx.getMessage());
				}
			}
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

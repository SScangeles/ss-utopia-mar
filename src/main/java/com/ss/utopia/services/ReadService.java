/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.dao.AirplaneDAO;
import com.ss.utopia.dao.AirplaneTypeDAO;
import com.ss.utopia.dao.AirportDAO;
import com.ss.utopia.dao.BookingAgentDAO;
import com.ss.utopia.dao.BookingDAO;
import com.ss.utopia.dao.BookingGuestDAO;
import com.ss.utopia.dao.BookingPaymentDAO;
import com.ss.utopia.dao.BookingUserDAO;
import com.ss.utopia.dao.FlightBookingsDAO;
import com.ss.utopia.dao.FlightDAO;
import com.ss.utopia.dao.PassengerDAO;
import com.ss.utopia.dao.RouteDAO;
import com.ss.utopia.dao.UserDAO;
import com.ss.utopia.dao.UserRoleDAO;
import com.ss.utopia.entity.Airplane;
import com.ss.utopia.entity.AirplaneType;
import com.ss.utopia.entity.Airport;
import com.ss.utopia.entity.Booking;
import com.ss.utopia.entity.BookingAgent;
import com.ss.utopia.entity.BookingGuest;
import com.ss.utopia.entity.BookingPayment;
import com.ss.utopia.entity.BookingUser;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.FlightBookings;
import com.ss.utopia.entity.Passenger;
import com.ss.utopia.entity.Route;
import com.ss.utopia.entity.User;
import com.ss.utopia.entity.UserRole;

/**
 * @author Christian Angeles
 *
 */
public class ReadService {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public ReadService() {
		serviceUtil = new ServiceUtil();
		connection = null;
	}
	// Airplane DAO
	/**
	 * 
	 * @return
	 */
	public List<Airplane> getAirplaneList(){
		try {
			connection = serviceUtil.getConnection();
			AirplaneDAO dao = new AirplaneDAO(connection);
			
			return dao.getAllAirplane();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// AirplaneType DAO
	/**
	 * 
	 * @return
	 */
	public List<AirplaneType> getAirplaneTypeList(){
		try {
			connection = serviceUtil.getConnection();
			AirplaneTypeDAO dao = new AirplaneTypeDAO(connection);
			
			return dao.getAllAirplaneType();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// Airport DAO
	/**
	 * 
	 * @return
	 */
	public List<Airport> getAirportList(){
		try {
			connection = serviceUtil.getConnection();
			AirportDAO dao = new AirportDAO(connection);
			
			return dao.getAllAirport();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// Booking DAO
	/**
	 * 
	 * @return
	 */
	public List<Booking> getBookingList() {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO bookingdao = new BookingDAO(connection);
			
			return bookingdao.getAllBooking();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// BookingAgent DAO
	/**
	 * 
	 * @return
	 */
	public List<BookingAgent> getBookingAgentList(){
		try {
			connection = serviceUtil.getConnection();
			BookingAgentDAO dao = new BookingAgentDAO(connection);
			
			return dao.getAllBookingAgent();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// BookingGuest DAO
	/**
	 * 
	 * @return
	 */
	public List<BookingGuest> getBookingGuestList(){
		try {
			connection = serviceUtil.getConnection();
			BookingGuestDAO dao = new BookingGuestDAO(connection);
			
			return dao.getAllBookingGuest();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// BookingPayment DAO
	/**
	 * 
	 * @return
	 */
	public List<BookingPayment> getBookingPaymentList(){
		try {
			connection = serviceUtil.getConnection();
			BookingPaymentDAO dao = new BookingPaymentDAO(connection);
			
			return dao.getAllBookingPayment();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// BookingUser DAO
	/**
	 * 
	 * @return
	 */
	public List<BookingUser> getBookingUserList() {
		try {
			connection = serviceUtil.getConnection();
			BookingUserDAO bookinguserdao = new BookingUserDAO(connection);
			
			return bookinguserdao.getAllBookingUser();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	/**
	 * 
	 * @param userID
	 * @return
	 */
	public List<BookingUser> getBookingUserByUserID(Integer userID) {
		try {
			connection = serviceUtil.getConnection();
			BookingUserDAO bookinguserdao = new BookingUserDAO(connection);
			
			return bookinguserdao.getBookingUserByUserID(userID);
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// Flight DAO
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
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	/**
	 * 
	 * @param flight
	 * @return
	 */
	public List<Flight> getFlight(Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			return flightdao.getFlightByID(flight);
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	/**
	 * 
	 * @param userID
	 * @return
	 */
	public List<Flight> getFlightListByUserID(Integer userID) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			return flightdao.getFlightByUserID(userID);
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// FlightBooking DAO
	/**
	 * 
	 * @return
	 */
	public List<FlightBookings> getFlightBookingList() {
		try {
			connection = serviceUtil.getConnection();
			FlightBookingsDAO flightbookingdao = new FlightBookingsDAO(connection);
			
			return flightbookingdao.getAllFlightBookings();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// Passenger DAO
	/**
	 * 
	 * @return
	 */
	public List<Passenger> getPassengerList() {
		try {
			connection = serviceUtil.getConnection();
			PassengerDAO passengerdao = new PassengerDAO(connection);
			
			return passengerdao.getAllPassenger();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// Route DAO
	/**
	 * 
	 * @return
	 */
	public List<Route> getRouteList(){
		try {
			connection = serviceUtil.getConnection();
			RouteDAO dao = new RouteDAO(connection);
			
			return dao.getAllRoute();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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
	
	// User DAO
	/**
	 * 
	 * @return
	 */
	public List<User> getUserList() {
		try {
			connection = serviceUtil.getConnection();
			UserDAO userdao = new UserDAO(connection);
			
			return userdao.getAllUser();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
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
	
	// UserRole DAO
	/**
	 * 
	 * @return
	 */
	public List<UserRole> getUserRoleList(){
		try {
			connection = serviceUtil.getConnection();
			UserRoleDAO dao = new UserRoleDAO(connection);
			
			return dao.getAllUserRole();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception: "+e.getMessage());
			return new ArrayList<>();
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

/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;

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
public class CreateService {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public CreateService() {
		serviceUtil = new ServiceUtil();
		connection = null;
	}
	// Airplane DAO
	/**
	 * 
	 * @param airplane
	 * @return
	 */
	public boolean insertAirplane(Airplane airplane) {
		try {
			connection = serviceUtil.getConnection();
			AirplaneDAO dao = new AirplaneDAO(connection);
			dao.insert(airplane);
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
	
	// AirplaneType DAO
	/**
	 * 
	 * @param airplanetype
	 * @return
	 */
	public boolean insertAirplaneType(AirplaneType airplanetype) {
		try {
			connection = serviceUtil.getConnection();
			AirplaneTypeDAO dao = new AirplaneTypeDAO(connection);
			dao.insert(airplanetype);
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
	
	// Airport DAO
	/**
	 * 
	 * @param airport
	 * @return
	 */
	public boolean insertAirport(Airport airport) {
		try {
			connection = serviceUtil.getConnection();
			AirportDAO dao = new AirportDAO(connection);
			dao.insert(airport);
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
	
	// Booking DAO
	/**
	 * 
	 * @param booking
	 * @return
	 */
	public boolean insertBooking(Booking booking) {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO bookingdao = new BookingDAO(connection);
			bookingdao.insert(booking);
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
	
	// BookingAgent DAO
	/**
	 * 
	 * @param bookagent
	 * @return
	 */
	public boolean insertBookingAgent(BookingAgent bookagent) {
		try {
			connection = serviceUtil.getConnection();
			BookingAgentDAO dao = new BookingAgentDAO(connection);
			dao.insert(bookagent);
			connection.commit();
			return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			try {
				connection.rollback();
			}
			catch(SQLException rollEx) {
				System.out.println("SQLException: "+rollEx.getMessage());
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
	
	// BookingGuest DAO
	/**
	 * 
	 * @param bookguest
	 * @return
	 */
	public boolean insertBookingGuest(BookingGuest bookguest) {
		try {
			connection = serviceUtil.getConnection();
			BookingGuestDAO dao = new BookingGuestDAO(connection);
			dao.insert(bookguest);
			connection.commit();
			return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			try {
				connection.rollback();
			}
			catch(SQLException rollEx) {
				System.out.println("SQLException: "+rollEx.getMessage());
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
	
	// BookingPayment DAO
	/**
	 * 
	 * @param bookingpayment
	 * @return
	 */
	public boolean insertBookingPayment(BookingPayment bookingpayment) {
		try {
			connection = serviceUtil.getConnection();
			BookingPaymentDAO bookingpaymentdao = new BookingPaymentDAO(connection);
			bookingpaymentdao.insert(bookingpayment);
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
	
	// BookingUser DAO
	/**
	 * 
	 * @param bookinguser
	 * @return
	 */
	public boolean insertBookingUser(BookingUser bookinguser) {
		try {
			connection = serviceUtil.getConnection();
			BookingUserDAO bookinguserdao = new BookingUserDAO(connection);
			bookinguserdao.insert(bookinguser);
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
	
	// Flight DAO
	/**
	 * 
	 * @param flight
	 * @return
	 */
	public boolean insertFlight(Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO dao = new FlightDAO(connection);
			dao.insert(flight);
			connection.commit();
			return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			try {
				connection.rollback();
			}
			catch(SQLException rollEx) {
				System.out.println("SQLException: "+rollEx.getMessage());
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
	
	// FlightBooking DAO
	/**
	 * 
	 * @param flightbooking
	 * @return
	 */
	public boolean insertFlightBooking(FlightBookings flightbooking) {
		try {
			connection = serviceUtil.getConnection();
			FlightBookingsDAO flightbookingdao = new FlightBookingsDAO(connection);
			flightbookingdao.insert(flightbooking);
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
	
	// Passenger DAO
	/**
	 * 
	 * @param passenger
	 * @return
	 */
	public boolean insertPassenger(Passenger passenger) {
		try {
			connection = serviceUtil.getConnection();
			PassengerDAO passengerdao = new PassengerDAO(connection);
			passengerdao.insert(passenger);
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
	
	// Route DAO
	/**
	 * 
	 * @param route
	 * @return
	 */
	public boolean insertRoute(Route route) {
		try {
			connection = serviceUtil.getConnection();
			RouteDAO dao = new RouteDAO(connection);
			dao.insert(route);
			connection.commit();
			return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			try {
				connection.rollback();
			}
			catch(SQLException rollEx) {
				System.out.println("SQLException: "+rollEx.getMessage());
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
	
	// User DAO
	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean insertUser(User user) {
		try {
			connection = serviceUtil.getConnection();
			UserDAO dao = new UserDAO(connection);
			dao.insert(user);
			connection.commit();
			return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			try {
				connection.rollback();
			}
			catch(SQLException rollEx) {
				System.out.println("SQLException: "+rollEx.getMessage());
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
	
	// UserRole DAO
	/**
	 * 
	 * @param role
	 * @return
	 */
	public boolean insertUserRole(UserRole role) {
		try {
			connection = serviceUtil.getConnection();
			UserRoleDAO dao = new UserRoleDAO(connection);
			dao.insert(role);
			connection.commit();
			return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			try {
				connection.rollback();
			}
			catch(SQLException rollEx) {
				System.out.println("SQLException: "+rollEx.getMessage());
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

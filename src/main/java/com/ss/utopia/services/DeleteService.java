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
public class DeleteService {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public DeleteService() {
		serviceUtil = new ServiceUtil();
		connection = null;
	}
	// Airplane DAO
	/**
	 * 
	 * @param airzplane
	 * @return
	 */
	public boolean deleteAirzplane(Airplane airzplane) {
		try {
			connection = serviceUtil.getConnection();
			AirplaneDAO dao = new AirplaneDAO(connection);
			dao.delete(airzplane);
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
	 * @param type
	 * @return
	 */
	public boolean deleteAirplaneType(AirplaneType type) {
		try {
			connection = serviceUtil.getConnection();
			AirplaneTypeDAO dao = new AirplaneTypeDAO(connection);
			dao.delete(type);
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
	/**
	 * 
	 * @param airport
	 * @return
	 */
	// Airport DAO
	public boolean deleteAirport(Airport airport) {
		try {
			connection = serviceUtil.getConnection();
			AirportDAO dao = new AirportDAO(connection);
			dao.delete(airport);
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
	public boolean deleteBooking(Booking booking) {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO dao = new BookingDAO(connection);
			dao.delete(booking);
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
	 * @param agent
	 * @return
	 */
	public boolean deleteBookingAgent(BookingAgent agent) {
		try {
			connection = serviceUtil.getConnection();
			BookingAgentDAO dao = new BookingAgentDAO(connection);
			dao.delete(agent);
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
	
	// BookingGuest DAO
	/**
	 * 
	 * @param guest
	 * @return
	 */
	public boolean deleteBookingGuest(BookingGuest guest) {
		try {
			connection = serviceUtil.getConnection();
			BookingGuestDAO dao = new BookingGuestDAO(connection);
			dao.delete(guest);
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
	
	// BookingPayment DAO
	/**
	 * 
	 * @param payment
	 * @return
	 */
	public boolean deleteBookingPayment(BookingPayment payment) {
		try {
			connection = serviceUtil.getConnection();
			BookingPaymentDAO dao = new BookingPaymentDAO(connection);
			dao.delete(payment);
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
	 * @param user
	 * @return
	 */
	public boolean deleteBookingUser(BookingUser user) {
		try {
			connection = serviceUtil.getConnection();
			BookingUserDAO dao = new BookingUserDAO(connection);
			dao.delete(user);
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
	public boolean deleteFlight(Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO dao = new FlightDAO(connection);
			dao.delete(flight);
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
	
	// FlightBooking DAO
	/**
	 * 
	 * @param flightbook
	 * @return
	 */
	public boolean deleteFlightBooking(FlightBookings flightbook) {
		try {
			connection = serviceUtil.getConnection();
			FlightBookingsDAO dao = new FlightBookingsDAO(connection);
			dao.delete(flightbook);
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
	public boolean deletePassenger(Passenger passenger) {
		try {
			connection = serviceUtil.getConnection();
			PassengerDAO dao = new PassengerDAO(connection);
			dao.delete(passenger);
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
	public boolean deleteRoute(Route route) {
		try {
			connection = serviceUtil.getConnection();
			RouteDAO dao = new RouteDAO(connection);
			dao.delete(route);
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
	
	// User DAO
	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean deleteUser(User user) {
		try {
			connection = serviceUtil.getConnection();
			UserDAO dao = new UserDAO(connection);
			dao.delete(user);
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
	
	// UserRole DAO
	/**
	 * 
	 * @param role
	 * @return
	 */
	public boolean deleteUserRole(UserRole role) {
		try {
			connection = serviceUtil.getConnection();
			UserRoleDAO dao = new UserRoleDAO(connection);
			dao.delete(role);
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

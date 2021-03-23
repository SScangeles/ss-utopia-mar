/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;

import com.ss.utopia.dao.BookingDAO;
import com.ss.utopia.dao.BookingPaymentDAO;
import com.ss.utopia.dao.BookingUserDAO;
import com.ss.utopia.dao.FlightBookingsDAO;
import com.ss.utopia.dao.FlightDAO;
import com.ss.utopia.dao.PassengerDAO;
import com.ss.utopia.dao.RouteDAO;
import com.ss.utopia.entity.Booking;
import com.ss.utopia.entity.BookingPayment;
import com.ss.utopia.entity.BookingUser;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.FlightBookings;
import com.ss.utopia.entity.Passenger;
import com.ss.utopia.entity.Route;

/**
 * @author Christian Angeles
 *
 */
public class UpdateService {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public UpdateService() {
		serviceUtil = new ServiceUtil();
		connection = null;
	}
	// Airplane DAO
	
	// AirplaneType DAO
	
	// Airport DAO
	
	// Booking DAO
	/**
	 * 
	 * @param booking
	 */
	public void updateBooking(Booking booking) {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO bookingdao = new BookingDAO(connection);
			bookingdao.update(booking);
			connection.commit();
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
	
	// BookingGuest DAO
	
	// BookingPayment DAO
	/**
	 * 
	 * @param bookingpayment
	 */
	public void updateBookingPayment(BookingPayment bookingpayment) {
		try {
			connection = serviceUtil.getConnection();
			BookingPaymentDAO bookingpaymentdao = new BookingPaymentDAO(connection);
			bookingpaymentdao.update(bookingpayment);
			connection.commit();
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
	 */
	public void updateBookingUser(BookingUser bookinguser) {
		try {
			connection = serviceUtil.getConnection();
			BookingUserDAO bookinguserdao = new BookingUserDAO(connection);
			bookinguserdao.update(bookinguser);
			connection.commit();
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
	 */
	public void updateFlight(Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			flightdao.update(flight);
			connection.commit();
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
	 * @param route
	 */
	public void updateFlight(Flight flight, Route route) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			RouteDAO routedao = new RouteDAO(connection);
			routedao.update(route);
			flightdao.update(flight);
			connection.commit();
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
	 */
	public void updateFlightBooking(FlightBookings flightbooking) {
		try {
			connection = serviceUtil.getConnection();
			FlightBookingsDAO flightbookingdao = new FlightBookingsDAO(connection);
			flightbookingdao.update(flightbooking);
			connection.commit();
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
	 */
	public void updatePassenger(Passenger passenger) {
		try {
			connection = serviceUtil.getConnection();
			PassengerDAO passengerdao = new PassengerDAO(connection);
			passengerdao.update(passenger);
			connection.commit();
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
	 */
	public void updateRoute(Route route) {
		try {
			connection = serviceUtil.getConnection();
			RouteDAO routedao = new RouteDAO(connection);
			routedao.update(route);
			connection.commit();
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
	
	// UserRole DAO
	
}

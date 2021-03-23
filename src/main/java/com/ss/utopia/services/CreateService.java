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
import com.ss.utopia.entity.Booking;
import com.ss.utopia.entity.BookingPayment;
import com.ss.utopia.entity.BookingUser;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.FlightBookings;
import com.ss.utopia.entity.Passenger;

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
	
	// AirplaneType DAO
	
	// Airport DAO
	
	// Booking DAO
	/**
	 * 
	 * @param booking
	 */
	public void insertBooking(Booking booking) {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO bookingdao = new BookingDAO(connection);
			bookingdao.insert(booking);
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
	public void insertBookingPayment(BookingPayment bookingpayment) {
		try {
			connection = serviceUtil.getConnection();
			BookingPaymentDAO bookingpaymentdao = new BookingPaymentDAO(connection);
			bookingpaymentdao.insert(bookingpayment);
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
	public void insertBookingUser(BookingUser bookinguser) {
		try {
			connection = serviceUtil.getConnection();
			BookingUserDAO bookinguserdao = new BookingUserDAO(connection);
			bookinguserdao.insert(bookinguser);
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
	
	// FlightBooking DAO
	/**
	 * 
	 * @param flightbooking
	 */
	public void insertFlightBooking(FlightBookings flightbooking) {
		try {
			connection = serviceUtil.getConnection();
			FlightBookingsDAO flightbookingdao = new FlightBookingsDAO(connection);
			flightbookingdao.insert(flightbooking);
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
	public void insertPassenger(Passenger passenger) {
		try {
			connection = serviceUtil.getConnection();
			PassengerDAO passengerdao = new PassengerDAO(connection);
			passengerdao.insert(passenger);
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
	
	// User DAO
	
	// UserRole DAO
	
	// Traveler
	/**
	 * 
	 * @param booking
	 * @param bookpay
	 * @param bookuser
	 * @param passenger
	 * @param flightbook
	 * @param flight
	 */
	public void insertTravelerBookFlight(Booking booking, BookingPayment bookpay, BookingUser bookuser, 
			Passenger passenger, FlightBookings flightbook, Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO bookdao = new BookingDAO(connection);
			FlightBookingsDAO fbookdao = new FlightBookingsDAO(connection);
			BookingPaymentDAO bookpdao = new BookingPaymentDAO(connection);
			BookingUserDAO bookudao = new BookingUserDAO(connection);
			PassengerDAO passengerdao = new PassengerDAO(connection);
			FlightDAO flightdao = new FlightDAO(connection);
			bookdao.insert(booking);
			fbookdao.insert(flightbook);
			bookpdao.insert(bookpay);
			bookudao.insert(bookuser);
			passengerdao.insert(passenger);
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
}

/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.dao.BookingDAO;
import com.ss.utopia.dao.BookingPaymentDAO;
import com.ss.utopia.dao.BookingUserDAO;
import com.ss.utopia.dao.FlightBookingsDAO;
import com.ss.utopia.dao.FlightDAO;
import com.ss.utopia.dao.PassengerDAO;
import com.ss.utopia.dao.RouteDAO;
import com.ss.utopia.dao.UserDAO;
import com.ss.utopia.entity.Booking;
import com.ss.utopia.entity.BookingPayment;
import com.ss.utopia.entity.BookingUser;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.FlightBookings;
import com.ss.utopia.entity.Passenger;
import com.ss.utopia.entity.Route;
import com.ss.utopia.entity.User;

/**
 * @author Christian Angeles
 *
 */
public class Service {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public Service() {
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
			return new ArrayList<>();
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
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
	
	public List<Flight> getFlight(Flight flight) {
		try {
			connection = serviceUtil.getConnection();
			FlightDAO flightdao = new FlightDAO(connection);
			
			return flightdao.getFlightByID(flight);
		}
		catch(ClassNotFoundException cnfEx) {
			System.out.println("ClassNotFoundException: "+cnfEx.getMessage());
			return new ArrayList<>();
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
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
	
	public void updateBooking(Booking booking) {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO bookingdao = new BookingDAO(connection);
			bookingdao.update(booking);
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
	
	public List<Booking> getBookingList() {
		try {
			connection = serviceUtil.getConnection();
			BookingDAO bookingdao = new BookingDAO(connection);
			
			return bookingdao.getAllBooking();
		}
		catch(ClassNotFoundException cnfEx) {
			System.out.println("ClassNotFoundException: "+cnfEx.getMessage());
			return new ArrayList<>();
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
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
	
	public void updateFlightBooking(FlightBookings flightbooking) {
		try {
			connection = serviceUtil.getConnection();
			FlightBookingsDAO flightbookingdao = new FlightBookingsDAO(connection);
			flightbookingdao.update(flightbooking);
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
	
	public void updateBookingUser(BookingUser bookinguser) {
		try {
			connection = serviceUtil.getConnection();
			BookingUserDAO bookinguserdao = new BookingUserDAO(connection);
			bookinguserdao.update(bookinguser);
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
	
	public void updateBookingPayment(BookingPayment bookingpayment) {
		try {
			connection = serviceUtil.getConnection();
			BookingPaymentDAO bookingpaymentdao = new BookingPaymentDAO(connection);
			bookingpaymentdao.update(bookingpayment);
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

	public void updatePassenger(Passenger passenger) {
		try {
			connection = serviceUtil.getConnection();
			PassengerDAO passengerdao = new PassengerDAO(connection);
			passengerdao.update(passenger);
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
	
	public List<Passenger> getPassengerList() {
		try {
			connection = serviceUtil.getConnection();
			PassengerDAO passengerdao = new PassengerDAO(connection);
			
			return passengerdao.getAllPassenger();
		}
		catch(ClassNotFoundException cnfEx) {
			System.out.println("ClassNotFoundException: "+cnfEx.getMessage());
			return new ArrayList<>();
		}
		catch(SQLException connEx) {
			System.out.println("SQLException: "+connEx.getMessage());
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

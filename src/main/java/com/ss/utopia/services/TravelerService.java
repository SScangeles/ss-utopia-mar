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
public class TravelerService {
	private ServiceUtil serviceUtil;
	private Connection connection;
	
	public TravelerService() {
		serviceUtil = new ServiceUtil();
		connection = null;
	}
	/**
	 * 
	 * @param booking
	 * @param bookpay
	 * @param bookuser
	 * @param passenger
	 * @param flightbook
	 * @param flight
	 * @return
	 */
	public boolean addBookedFlight(Booking booking, BookingPayment bookpay, BookingUser bookuser, 
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

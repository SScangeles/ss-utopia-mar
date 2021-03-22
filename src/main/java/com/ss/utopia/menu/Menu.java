/**
 * 
 */
package com.ss.utopia.menu;

import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.Flight;
import com.ss.utopia.services.EmployeeService;

/**
 * @author Christian Angeles
 *
 */
public class Menu {
	private StringBuilder menu;
	private UserInput input;
	private List<Flight> flightList;
	private Flight flight;

	public Menu() {
		menu = new StringBuilder();
		input = new UserInput();
		flightList = new ArrayList<>();
		flight = null;
	}
	
	/**
	 * @return the flightList
	 */
	public List<Flight> getFlightList() {
		return flightList;
	}
	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	public StringBuilder utopiaMenu() {
		System.out.println(
				  "Welcome to the Utopia Airlines Management System. Which category of a user are you:\n"
				+ "1) Employee\n"
				+ "2) Administrator\n"
				+ "3) Traveler\n");
		input.setInput();
		return input.getInput();
	}

	public StringBuilder empMenu() {
		System.out.println(
				  "1) Enter flights you manage\n"
				+ "2) Return to previous\n");
		input.setInput();
		return input.getInput();
	}
	
	public StringBuilder empFlights() {
		EmployeeService service = new EmployeeService();
		flightList = service.getFlightList();
		menu.setLength(0);
		int count = 1;
		for(Flight flight: flightList) {
			menu.append(count+") ");
			menu.append(flight.getRoute().getOriginAirport().getAirportID()+", "+flight.getRoute().getOriginAirport().getCity()+" -> ");
			menu.append(flight.getRoute().getDestAirport().getAirportID()+", "+flight.getRoute().getDestAirport().getCity()+"\n");
			count++;
		}
		menu.append(count+") Return to previous\n");
		System.out.println(menu);
		input.setInput();
		return input.getInput();
	}
	
	public StringBuilder empFlightDetail(Integer flightID) {
		if(flightList.size() > 0) {
			flight = flightList.get(flightID-1);
			System.out.println(
					  "1) View more details about the flight\n"
					+ "2) Update the details of the flight\n"
					+ "3) Add seats to flight\n"
					+ "4) Return to previous\n");
			input.setInput();
		}
		return input.getInput();
	}
	
	public StringBuilder empViewFlight() {
		menu.setLength(0);
		menu.append(
				  "You have chosen to view the Flight with Flight Id: "+flight.getFlightID()
				+ " and Departure Airport: "+flight.getRoute().getOriginAirport().getCity()
				+ " and Arrival Airport: "+flight.getRoute().getDestAirport().getCity()+".\n\n"
				+ "Departure Airport: "+flight.getRoute().getOriginAirport().getAirportID()
				+ " | Arrival Airport: "+flight.getRoute().getDestAirport().getAirportID()+" | \n"
				+ "Departure Date: "+flight.getDepartureTime().toString().split(" ")[0]
				+ " | Departure Time: "+flight.getDepartureTime().toString().split(" ")[1]+" | \n\n"
				+ "Available Seats:\n"
				+ "1) Check reserved seats\n"
				+ "2) Return to previous\n");
		System.out.println(menu);
		input.setInput();
		return input.getInput();
	}
	
	public StringBuilder empCheckSeats() {
		menu.setLength(0);
		menu.append("Reserved seats: "+flight.getReservedSeats());
		System.out.println(menu);
		input.setInput();
		return input.getInput();
	}
	
	public StringBuilder empUpdateFlight() {
		EmployeeService service = new EmployeeService();
		Flight updateFlight = new Flight();
		//display output
		service.updateFlight(updateFlight);
		input.setInput();
		return input.getInput();
	}
}

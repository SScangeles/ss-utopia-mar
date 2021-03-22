/**
 * 
 */
package com.ss.utopia.menu;

import java.sql.Timestamp;

import com.ss.utopia.entity.Airport;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.Route;

/**
 * @author Christian Angeles
 *
 */
public class MenuUtil {
	
	public Flight empUpdateFlightUtil(Flight flight) {
		UserInput input = new UserInput();
		Flight updateFlight = new Flight();
		Route route = new Route();
		Airport origin = new Airport();
		Airport dest = new Airport();
		StringBuilder date = new StringBuilder();
		StringBuilder time = new StringBuilder();
		
		boolean inputLoop = true;
		while(inputLoop) {
			System.out.println("Please enter new Origin Airport and City or enter N/A for no change:");
			input.setInput();
			if(input.getInput().toString().equals("N/A") || input.getInput().toString().equals("n/a")){
				origin.setAirportID(flight.getRoute().getOriginAirport().getAirportID());
				origin.setCity(flight.getRoute().getOriginAirport().getCity());
				inputLoop = false;
			}
			else if(input.getInput().toString().equals("quit")) {
				inputLoop = false;
				return flight;
			}
			else if(input.getInput().toString().split(",").length >= 2 ) {
				origin.setAirportID(input.getInput().toString().split(",")[0].strip());
				origin.setCity(input.getInput().toString().split(",")[1].strip());
				inputLoop = false;
			}
		}
		
		inputLoop = true;
		while(inputLoop) {
			System.out.println("Please enter new Destination Airport and City or enter N/A for no change:");
			input.setInput();
			if(input.getInput().toString().equals("N/A") || input.getInput().toString().equals("n/a")){
				dest.setAirportID(flight.getRoute().getDestAirport().getAirportID());
				dest.setCity(flight.getRoute().getDestAirport().getCity());
				inputLoop = false;
			}
			else if(input.getInput().toString().equals("quit")) {
				inputLoop = false;
				return flight;
			}
			else if(input.getInput().toString().split(",").length >= 2 ) {
				dest.setAirportID(input.getInput().toString().split(",")[0].strip());
				dest.setCity(input.getInput().toString().split(",")[1].strip());
				inputLoop = false;
			}
		}
		
		inputLoop = true;
		while(inputLoop) {
			date.setLength(0);
			System.out.println("Please enter new Departure Date or enter N/A for no change:");
			input.setInput();
			if(input.getInput().toString().equals("N/A") || input.getInput().toString().equals("n/a")){
				date.append(flight.getDepartureTime().toString().split(" ")[0]);
				inputLoop = false;
			}
			else if(input.getInput().toString().equals("quit")) {
				inputLoop = false;
				return flight;
			}
			else {
				date.append(input.getInput());
				inputLoop = false;
			}
			
		}

		inputLoop = true;
		while(inputLoop) {
			time.setLength(0);
			System.out.println("Please enter new Departure Time or enter N/A for no change:");
			input.setInput();
			if(input.getInput().toString().equals("N/A") || input.getInput().toString().equals("n/a")){
				time.append(flight.getDepartureTime().toString().split(" ")[1]);
				inputLoop = false;
			}
			else if(input.getInput().toString().equals("quit")) {
				inputLoop = false;
				return flight;
			}
			else {
				time.append(input.getInput());
				inputLoop = false;
			}
			
		}
		route.setOriginAirport(origin);
		route.setDestAirport(dest);
		route.setRouteID(flight.getRoute().getRouteID());
		updateFlight.setFlightID(flight.getFlightID());
		updateFlight.setRoute(route);
		updateFlight.setAirplane(flight.getAirplane());
		updateFlight.setDepartureTime(Timestamp.valueOf(date.toString()+" "+time.toString()));
		updateFlight.setReservedSeats(flight.getReservedSeats());
		updateFlight.setSeatPrice(flight.getSeatPrice());
		return updateFlight;
	}
	
	public Flight empUpdateSeatUtil(Flight flight) {
		UserInput input = new UserInput();
		Flight updateFlight = new Flight();
		StringBuilder menu = new StringBuilder();
		
		menu.append(
				  "Existing number of seat: " + flight.getReservedSeats()
				+ "\nEnter new number of seats:\n");
		System.out.println(menu);
		
		input.setInput();
		int seat = Integer.parseInt(input.getInput().toString());
		if( seat >= 0 && seat <= flight.getAirplane().getAirplaneTypeID().getMaxCap()) {
			updateFlight.setFlightID(flight.getFlightID());
			updateFlight.setRoute(flight.getRoute());
			updateFlight.setAirplane(flight.getAirplane());
			updateFlight.setDepartureTime(flight.getDepartureTime());
			updateFlight.setReservedSeats(Integer.parseInt(input.getInput().toString()));
			updateFlight.setSeatPrice(flight.getSeatPrice());
			return updateFlight;
		}
		
		return flight;
	}
}

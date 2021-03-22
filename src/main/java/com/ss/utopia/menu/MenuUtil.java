/**
 * 
 */
package com.ss.utopia.menu;

import com.ss.utopia.entity.Airport;
import com.ss.utopia.entity.Flight;
import com.ss.utopia.entity.Route;

/**
 * @author Christian Angeles
 *
 */
public class MenuUtil {
	
	public boolean empUpdateFlightUtil(Flight flight) {
		UserInput input = new UserInput();
		Flight updateFlight = new Flight();
		Route route = new Route();
		Airport origin = new Airport();
		Airport dest = new Airport();
		
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
				return false;
			}
			else if(input.getInput().toString().split(" ").length >= 2 ) {
				origin.setAirportID(input.getInput().toString().split(" ")[0]);
				origin.setCity(input.getInput().toString().split(" ")[1]);
				inputLoop = false;
			}
		}
		
		inputLoop = true;
		while(inputLoop) {
			System.out.println("Please enter new Destination Airport and City or enter N/A for no change:");
			input.setInput();
			if(input.getInput().toString().equals("N/A") || input.getInput().toString().equals("n/a")){
				origin.setAirportID(flight.getRoute().getDestAirport().getAirportID());
				origin.setCity(flight.getRoute().getDestAirport().getCity());
				inputLoop = false;
			}
			else if(input.getInput().toString().equals("quit")) {
				inputLoop = false;
				return false;
			}
			else if(input.getInput().toString().split(" ").length >= 2 ) {
				dest.setAirportID(input.getInput().toString().split(" ")[0]);
				dest.setCity(input.getInput().toString().split(" ")[1]);
				inputLoop = false;
			}
		}
		
		inputLoop = true;
		while(inputLoop) {
			System.out.println("Please enter new Departure Date or enter N/A for no change:");
			input.setInput();
			if(input.getInput().toString().equals("N/A") || input.getInput().toString().equals("n/a")){
				inputLoop = false;
			}
			else if(input.getInput().toString().equals("quit")) {
				inputLoop = false;
				return false;
			}
			else if(input.getInput().toString().split(" ").length >= 2 ) {
				inputLoop = false;
			}
			
		}

		inputLoop = true;
		while(inputLoop) {
			System.out.println("Please enter new Departure Time or enter N/A for no change:");
			input.setInput();
			if(input.getInput().toString().equals("N/A") || input.getInput().toString().equals("n/a")){
				inputLoop = false;
			}
			else if(input.getInput().toString().equals("quit")) {
				inputLoop = false;
				return false;
			}
			else if(input.getInput().toString().split(" ").length >= 2 ) {
				inputLoop = false;
			}
			
		}
		return true;
	}
}

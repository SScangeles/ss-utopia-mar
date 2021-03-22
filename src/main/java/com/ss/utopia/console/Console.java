/**
 * 
 */
package com.ss.utopia.console;

import com.ss.utopia.menu.Menu;

/**
 * @author Christian Angeles
 *
 */
public class Console {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Menu menu = new Menu();
		
		boolean utopia = true;
		while(utopia) {
			switch(menu.utopiaMenu().charAt(0)) {
			case '1': //go to employee
				boolean employee = true;
				while(employee) {
					switch(menu.empMenu().charAt(0)) {
					case '1': //go to flight list
						boolean list = true;
						while(list) {
							int flightID = Integer.parseInt(menu.empFlights().toString());
							if(flightID <= menu.getFlightList().size()) {
								//go to flight detail
								boolean detail = true;
								while(detail) {
									switch(menu.empFlightDetail(flightID).charAt(0)) {
									case '1': //go to view flight
										boolean view = true;
										while(view) {
											switch(menu.empViewFlight().charAt(0)) {
											case '1': //check seats
												menu.empCheckSeats();
												break;
											case '2': //return to flight detail
												view = false;
												break;
											default:
												break;
											}
										}
										break;
									case '2': //go to update flight
										menu.empUpdateFlight();
										break;
									case '3': //go to add seat
										menu.empAddSeat();
										break;
									case '4': //return to flight detail
										detail = false;
										break;
									default:
										break;
									}
								}
							}
							else if(flightID == menu.getFlightList().size()+1) {
								//return to employee
								list = false;
							}
						}
						break;
					case '2': //return to utopia
						employee = false;
						break;
					default:
						break;
					}
				}
				break;
			case '2': //go to admin
				boolean admin = true;
				break;
			case '3': //go to traveler
				boolean travel = menu.checkMembership();
				while(travel) {
					switch(menu.travelMenu().charAt(0)) {
					case '1': //go to flight list
						boolean flightlist = true;
						while(flightlist) {
							int flightID = Integer.parseInt(menu.travelFlights().toString());
							if(flightID <= menu.getFlightList().size()) {
								//go to flight detail to book
								boolean flightdetail = true;
								while(flightdetail) {
									switch(menu.travelBooking(flightID).charAt(0)) {
									case '1': //view flight detail
										menu.travelViewFlight();
										break;
									case '2': //book flight
										menu.travelBookFlight();
										break;
									case '3': //return to traveler
										flightdetail = false;
										flightlist = false;
										break;
									default:
										break;
									}
								}
							}
							else if(flightID == menu.getFlightList().size()+1) {
								//return to traveler
								flightlist = false;
							}
						}
						break;
					case '2': //go to booking list to cancel
						boolean booklist = true;
						while(booklist) {
							int flightID = Integer.parseInt(menu.travelCancelList().toString());
							if(flightID <= menu.getFlightList().size()) {
								//go to flight detail to book
								boolean canceldetail = true;
								while(canceldetail) {
									switch(menu.travelCancelBooking(flightID).charAt(0)) {
									case '1': //view flight detail
										menu.travelViewFlight();
										break;
									case '2': //cancel flight
										break;
									case '3': //return to traveler
										canceldetail = false;
										booklist = false;
										break;
									default:
										break;
									}
								}
							}
							else if(flightID == menu.getFlightList().size()+1) {
								//return to traveler
								booklist = false;
							}
						}
						break;
					case '3': //return to utopia
						travel = false;
						break;
					default:
						break;
					}
				}
				break;
			case 'q': //quit utopia
				System.out.println("Closing Utopia");
				utopia = false;
				break;
			default:
				break;
			}
			
		}
	}
}

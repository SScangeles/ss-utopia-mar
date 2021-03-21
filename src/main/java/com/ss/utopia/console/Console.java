/**
 * 
 */
package com.ss.utopia.console;

import java.sql.SQLException;
import java.util.List;

import com.ss.utopia.entity.Flight;
import com.ss.utopia.main.Menu;
import com.ss.utopia.services.EmployeeService;

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
		
		System.out.print(menu.getMainMenu());
		switch(1) {
		case 1:
			//employee
			EmployeeService emp = new EmployeeService();
			List<Flight> flights = emp.getFlight();
			System.out.println(flights);
			break;
		case 2:
			//admin
			break;
		case 3:
			//traveler
			break;
		default:
			break;
		}
		System.out.println("END");
	}

}

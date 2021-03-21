/**
 * 
 */
package com.ss.utopia.console;

import com.ss.utopia.main.Menu;

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

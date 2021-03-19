/**
 * 
 */
package com.ss.utopia.main;

/**
 * @author Christian Angeles
 *
 */
public class Menu {
	private String mainMenu, empMenu;
	
	public Menu() {
		mainMenu = "Welcome to the Utopia Airlines Management System. Which category of a user are you:\n\n"
				+ "1) Employee\n"
				+ "2) Administrator\n"
				+ "3) Traveler\n\n";
		empMenu = "1) Enter flights you manage\n2) Return to previous";
	}

	public String getMainMenu() {
		return mainMenu;
	}

	public String getEmpMenu() {
		return empMenu;
	}
	
}

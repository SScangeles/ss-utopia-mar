/**
 * 
 */
package com.ss.utopia.menu;

import java.util.Scanner;

/**
 * @author Christian Angeles
 *
 */
public class UserInput {
	private Scanner inScan;
	private StringBuilder input;
	/**
	 * Initialize Scanner and StringBuilder objects.
	 */
	public UserInput() {
		inScan = new Scanner(System.in);
		input = new StringBuilder();
	}
	/**
	 * Ask user for input in console.
	 */
	public void setInput() {
		input.setLength(0);
		input.append(inScan.nextLine());
	}
	/**
	 * Returns user input as StringBuilder object.
	 * @return
	 */
	public StringBuilder getInput() {
		if(input.length() < 1) {
			input.append(" ");
		}
		return input;
	}
}

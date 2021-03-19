/**
 * 
 */
package com.ss.utopia.console;

import java.util.Scanner;

import com.ss.utopia.entity.Airplane;

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
		Scanner scan = new Scanner(System.in);
		switch(1) {
		case 1:
			System.out.println(menu.getEmpMenu());
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
	}

}

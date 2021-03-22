/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;

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
}

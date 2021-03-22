/**
 * 
 */
package com.ss.utopia.services;

import java.sql.Connection;

/**
 * @author Christian Angeles
 *
 */
public class DeleteService {
	private UtilityService serviceUtil;
	private Connection connection;
	
	public DeleteService() {
		serviceUtil = new UtilityService();
		connection = null;
	}
}

/**
 * 
 */
package com.ss.utopia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ss.utopia.entity.BookingAgent;

/**
 * @author Christian Angeles
 *
 */
public class BookingAgentDAO extends BaseDAO<BookingAgent> {

	/**
	 * @param connection
	 */
	public BookingAgentDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BookingAgent> getList(ResultSet qresult) throws SQLException {
		List<BookingAgent> agents = new ArrayList<>();
		while(qresult.next()) {
			BookingAgent agent = new BookingAgent();
			agent.setBookingID(qresult.getInt("booking_id"));
			agent.setAgentID(qresult.getInt("agent_id"));
			agents.add(agent);
		}
		return agents;
	}

	@Override
	public void insert(BookingAgent agent) throws SQLException {
		saveData("insert into booking_agent(booking_id, agent_id)\r\n"
				+ "values (?, ?);", 
				new Object[] {agent.getBookingID(), agent.getAgentID()});
	}

	@Override
	public void delete(BookingAgent agent) throws SQLException {
		saveData("delete from booking_agent where booking_agent.booking_id = ?", 
				new Object[] {agent.getBookingID()});
	}

	@Override
	public void update(BookingAgent agent) throws SQLException {
		saveData("update booking_agent set \r\n"
				+ "booking_agent.agent_id = ?\r\n"
				+ "where booking_agent.booking_id = ?;", 
				new Object[] {agent.getAgentID(), agent.getBookingID()});
	}
	
	public List<BookingAgent> getAllBookingAgent() throws SQLException {
		return readData("select * from booking_agent", null);
	}
}

package com.medicare.database;

import java.net.MalformedURLException;
import java.sql.SQLException;

import org.sqlite.JDBC;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class ConnectionFactory {
	static {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private ConnectionFactory() {
	}
	/*
	 * public static ConnectionSource newConnection(String path) throws
	 * MalformedURLException, SQLException { return
	 * fromConnectionString(getUrl(path)); }
	 * 
	 * public static ConnectionSource newMemoryConnection() throws
	 * MalformedURLException, SQLException { return new
	 * JdbcConnectionSource(getUrl(":memory")); }
	 * 
	 * public static ConnectionSource fromConnectionString(String connectionString)
	 * throws SQLException { return new JdbcConnectionSource(connectionString); }
	 * 
	 * private static String getUrl(String string) throws MalformedURLException {
	 * return JDBC.PREFIX + string.toString(); }
	 */

	public static ConnectionSource create() throws MalformedURLException, SQLException {
		return new JdbcConnectionSource("jdbc:mysql://localhost:3306/medicare?user=medicare");
	}
}

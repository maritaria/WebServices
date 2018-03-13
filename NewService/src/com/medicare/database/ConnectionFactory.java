package com.medicare.database;

import java.net.MalformedURLException;
import java.sql.SQLException;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class ConnectionFactory {
	static {
		try {
			String driverClassName = System.getenv("JDBC_DRIVER");
			if (driverClassName != null) {
				Class.forName(driverClassName);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private ConnectionFactory() {
	}

	public static ConnectionSource create() throws MalformedURLException, SQLException {
		return new JdbcConnectionSource(System.getenv("DELETE_ME"));
	}
}

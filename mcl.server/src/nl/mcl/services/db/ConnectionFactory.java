package nl.mcl.services.db;

import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
	
	private ConnectionFactory() {}
	
	public static ConnectionSource newConnection(File file) throws MalformedURLException, SQLException {
		return newConnection(Paths.get(file.toURI()));
	}
	
	public static ConnectionSource newConnection(Path path) throws MalformedURLException, SQLException {
		return newConnection(getUrl(path));
	}
	
	public static ConnectionSource newConnection(String url) throws SQLException {
		return new JdbcConnectionSource(url);
	}

	private static String getUrl(Path path) throws MalformedURLException {
		return JDBC.PREFIX + path.toString();
	}
}

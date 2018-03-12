package nl.mcl.services.db;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

public class RoomDAO {
	
	private static Dao<RoomRecord, String> roomDao;

	private RoomDAO() {
	}
	
	public static synchronized Dao<RoomRecord, String> get(ConnectionSource connection) throws SQLException {
		return roomDao == null ? roomDao = DaoManager.createDao(connection, RoomRecord.class) : roomDao;
	}
	
}

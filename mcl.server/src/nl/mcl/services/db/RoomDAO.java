package nl.mcl.services.db;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import nl.mcl.services.Room;

public class RoomDAO {
	
	private static Dao<Room, String> roomDao;

	private RoomDAO() {
	}
	
	public static synchronized Dao<Room, String> get(ConnectionSource connection) throws SQLException {
		return roomDao == null ? roomDao = DaoManager.createDao(connection, Room.class) : roomDao;
	}
	
}

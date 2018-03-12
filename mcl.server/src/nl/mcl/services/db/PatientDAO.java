package nl.mcl.services.db;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

import nl.mcl.services.Patient;
import nl.mcl.services.Room;

public class PatientDAO {
	
	private static Dao<PatientRecord, String> roomDao;

	private PatientDAO() {
	}
	
	public static synchronized Dao<PatientRecord, String> get(ConnectionSource connection) throws SQLException {
		return roomDao == null ? roomDao = DaoManager.createDao(connection, PatientRecord.class) : roomDao;
	}
	
}

package nl.mcl.services.db;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;

public class DoctorDAO {
	
	private static Dao<DoctorRecord, String> doctorDao;
	
	private DoctorDAO() {
	}
	
	public static synchronized Dao<DoctorRecord, String> get(ConnectionSource connection) throws SQLException {
		return doctorDao == null ? doctorDao = DaoManager.createDao(connection, DoctorRecord.class) : doctorDao;
	}

}

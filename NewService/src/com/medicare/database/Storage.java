package com.medicare.database;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class Storage {
	public static Dao<PatientRecord, Integer> getPatients(ConnectionSource source) throws SQLException {
		Dao<PatientRecord, Integer> result = DaoManager.createDao(source, PatientRecord.class);
		TableUtils.createTableIfNotExists(source, PatientRecord.class);
		return result;
	}

	public static Dao<RoomRecord, Integer> getRooms(ConnectionSource source) throws SQLException {
		Dao<RoomRecord, Integer> result = DaoManager.createDao(source, RoomRecord.class);
		TableUtils.createTableIfNotExists(source, RoomRecord.class);
		return result;
	}
}

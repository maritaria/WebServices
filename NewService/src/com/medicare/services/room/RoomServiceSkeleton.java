
/**
 * RoomServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.room;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.medicare.database.ConnectionFactory;
import com.medicare.database.RoomRecord;
import com.medicare.database.Storage;

/**
 * RoomServiceSkeleton java skeleton for the axisService
 */
public class RoomServiceSkeleton implements RoomServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @return roomArrayResponse6
	 */

	public com.medicare.services.room.RoomArrayResponse getAll() {
		try(ConnectionSource conn = ConnectionFactory.create()){
			RoomArrayResponse response = new RoomArrayResponse();
			for(RoomRecord r : Storage.getRooms(conn).queryForAll()) {
				response.addRoom(r.toSoap());
			}
			return response;
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Error("IO/SQL error: " + e.toString());
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @return roomArrayResponse3
	 */

	public com.medicare.services.room.RoomArrayResponse init() {
		try (ConnectionSource conn = ConnectionFactory.create()) {
			ArrayList<RoomRecord> data = new ArrayList<RoomRecord>();
			RoomRecord record = new RoomRecord();
			record.name = "surgery-01";
			record.equipment.add("bed");
			record.equipment.add("table");
			record.equipment.add("knife");
			data.add(record);
			record = new RoomRecord();
			record.name = "surgery-02";
			record.equipment.add("bed");
			record.equipment.add("table");
			record.equipment.add("knife");
			data.add(record);
			record = new RoomRecord();
			record.name = "xray-01";
			record.equipment.add("bed");
			record.equipment.add("table");
			record.equipment.add("xray-machine");
			data.add(record);
			record = new RoomRecord();
			record.name = "mri-01";
			record.equipment.add("bed");
			record.equipment.add("table");
			record.equipment.add("mri-machine");
			data.add(record);
			Dao<RoomRecord, Integer> rooms = Storage.getRooms(conn);
			RoomArrayResponse response = new RoomArrayResponse();
			for (RoomRecord r : data) {
				rooms.create(r);
				response.addRoom(r.toSoap());
			}
			System.out.println("test");
			return response;
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Error("IO/SQL error: " + e.toString());
		}
	}
	/**
	 * Auto generated method signature
	 * 
	 * @param reservate9
	 * @return param10
	 */

	public void reservate(com.medicare.services.room.Reservate reservate9) {
		// TODO : fill this with the necessary business logic

	}

	/**
	 * Auto generated method signature
	 * 
	 * @param findFilter11
	 * @return roomArrayResponse12
	 */

	public com.medicare.services.room.RoomArrayResponse find(com.medicare.services.room.FindFilter findFilter11) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#find");
	}

}


/**
 * RoomServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.medicare.services.room;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.medicare.database.ConnectionFactory;
import com.medicare.database.RoomRecord;
import com.medicare.database.Storage;
import com.medicare.types.RoomE;

/**
 * RoomServiceSkeleton java skeleton for the axisService
 */
public class RoomServiceSkeleton implements RoomServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param roomId5
	 * @return room6
	 * @throws GetFault
	 */

	public RoomE get(RoomId roomId5) throws GetFault {
		try(ConnectionSource source = ConnectionFactory.create())
		{
			Dao<RoomRecord, Integer> rooms = Storage.getRooms(source);
			RoomRecord room = rooms.queryForId(new Integer(roomId5.getRoomId()));
			RoomE result = new RoomE();
			result.setRoom(room.toSoap());
			return result;
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new GetFault(e);
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @return roomArrayResponse8
	 * @throws GetAllFault
	 */

	public RoomArrayResponse getAll(

	) throws GetAllFault {
		try(ConnectionSource source = ConnectionFactory.create())
		{
			Dao<RoomRecord, Integer> rooms = Storage.getRooms(source);
			RoomArrayResponse result = new RoomArrayResponse();
			for(RoomRecord room : rooms.queryForAll()) {
				result.addRoom(room.toSoap());
			}
			return result;
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new GetAllFault(e);
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param room9
	 * @return room10
	 * @throws RegisterFault
	 */

	public RoomE register(RoomE room9) throws RegisterFault {
		try(ConnectionSource source = ConnectionFactory.create())
		{
			Dao<RoomRecord, Integer> rooms = Storage.getRooms(source);
			RoomE result = new RoomE();
			RoomRecord newRecord = new RoomRecord(room9.getRoom());
			int id = rooms.create(newRecord);
			result.setRoom(newRecord.toSoap());
			return result;
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RegisterFault(e);
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param reserve11
	 * @return param12
	 * @throws ReserveFault
	 */

	public void reserve(Reserve reserve11) throws ReserveFault {
		// TODO : fill this with the necessary business logic
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param findFilter13
	 * @return roomArrayResponse14
	 * @throws FindFault
	 */

	public RoomArrayResponse find(FindFilter findFilter13) throws FindFault {
		try(ConnectionSource source = ConnectionFactory.create())
		{
			Dao<RoomRecord, Integer> rooms = Storage.getRooms(source);
			RoomArrayResponse result = new RoomArrayResponse();
			QueryBuilder<RoomRecord, Integer> builder = rooms.queryBuilder();
			for(RoomRecord room : rooms.queryForAll()) {
				findFilter13.get
				rooms.queryForEq(", arg1)
			}
			return result;
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new GetAllFault(e);
		}
	}

}

package com.hms.dao.service;

import java.util.List;

import com.hms.model.Room;

public interface RoomDao {
	/**
	 * CRUD operations for Room Table
	 */
	
	int insertRoom(Room room);
	int updateRoom(Room room);
	int deleteRoom(int roomNumber);

	Room getRoom(int roomNumber);
	List<Room> getRooms();

}

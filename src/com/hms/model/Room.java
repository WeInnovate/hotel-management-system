package com.hms.model;

public class Room {

	private int roomNumber;
	private String roomType;
	private String isReserved;
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getIsReserved() {
		return isReserved;
	}
	public void setIsReserved(String isReserved) {
		this.isReserved = isReserved;
	}
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", isReserved=" + isReserved + "]";
	}
	
}

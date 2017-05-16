package com.hms.model;

import java.util.Date;

public class Customer {
	private int userId;
	private String userName;
	private int userAge;
	private String userGender;
	private String userAddress;
	private int userPhone;
	private String userIdType;
	private String userIdProofNumber;
	private Date userCheckInDate;
	private Date userCheckOutDate;
	private Room userRoomNumber;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}
	public String getUserIdProofNumber() {
		return userIdProofNumber;
	}
	public void setUserIdProofNumber(String userIdProofNumber) {
		this.userIdProofNumber = userIdProofNumber;
	}
	public Date getUserCheckInDate() {
		return userCheckInDate;
	}
	public void setUserCheckInDate(Date userCheckInDate) {
		this.userCheckInDate = userCheckInDate;
	}
	public Date getUserCheckOutDate() {
		return userCheckOutDate;
	}
	public void setUserCheckOutDate(Date userCheckOutDate) {
		this.userCheckOutDate = userCheckOutDate;
	}
	public Room getUserRoomNumber() {
		return userRoomNumber;
	}
	public void setUserRoomNumber(Room userRoomNumber) {
		this.userRoomNumber = userRoomNumber;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userGender="
				+ userGender + ", userAddress=" + userAddress + ", userPhone=" + userPhone + ", userIdType="
				+ userIdType + ", userIdProofNumber=" + userIdProofNumber + ", userCheckInDate=" + userCheckInDate
				+ ", userCheckOutDate=" + userCheckOutDate + ", userRoomNumber=" + userRoomNumber + "]";
	}
	
}


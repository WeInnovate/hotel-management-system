package com.hms.model;

import java.sql.Date;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private Date doj;
	private String mobileNumber;
	private float employeeSalary;
	private Login userId;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Login getUserId() {
		return userId;
	}
	public void setUserId(Login userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", doj=" + doj
				+ ", mobileNumber=" + mobileNumber + ", employeeSalary=" + employeeSalary + ", userId=" + userId + "]";
	}
	
    
}

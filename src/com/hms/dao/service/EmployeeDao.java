package com.hms.dao.service;

import java.util.List;

import com.hms.model.Employee;

public interface EmployeeDao {
	
	
	int insertEmployee(Employee employee);
	int updateEmployee(Employee employee);
	int deleteEmployee(int employeeId);

	Employee getEmployee(int employeeId);
	List<Employee> getEmployees();

}

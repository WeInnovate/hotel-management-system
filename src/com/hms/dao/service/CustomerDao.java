package com.hms.dao.service;

import java.util.List;

import com.hms.model.Customer;

public interface CustomerDao {
	
	/**
	 * CRUD operations for Employee table
	 */
	int insertCustomer(Customer customer);
	int updateCustomer(Customer customer);
	int deleteCustomer(int customerId);

	Customer getCustomer(int customerId);
	List<Customer> getCustomers();
}

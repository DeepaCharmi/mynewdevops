package com.demo.stm.dao;

import java.util.List;

import com.demo.stm.model.Customer;

public interface CustomerDao {

	void createuser(Customer c);

	List<Customer> getCustomers();

}

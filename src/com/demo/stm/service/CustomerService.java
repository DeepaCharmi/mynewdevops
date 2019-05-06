package com.demo.stm.service;

import java.util.List;

import com.demo.stm.model.Customer;

public interface CustomerService {

	void createuser(Customer c);

	List<Customer> getCustomers();

}

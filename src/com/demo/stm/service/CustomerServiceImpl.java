package com.demo.stm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.stm.dao.CustomerDao;
import com.demo.stm.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
   @Autowired
   CustomerDao dao;
	@Override
	@Transactional
	public void createuser(Customer c) {
	dao.createuser(c);
		
	}
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return dao.getCustomers();
	}

}

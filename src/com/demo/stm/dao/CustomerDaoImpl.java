package com.demo.stm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.stm.model.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {
  
	@Autowired
    SessionFactory factory;
	
	@Override
	public void createuser(Customer c) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(c);
	}
	
	@Override
	public List<Customer> getCustomers() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Customer");
		List<Customer> customers = query.list();
		return customers;
	}

}

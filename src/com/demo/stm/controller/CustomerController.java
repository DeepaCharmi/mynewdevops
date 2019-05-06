package com.demo.stm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.stm.model.Customer;
import com.demo.stm.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	@RequestMapping("/")
	public String dostart(Model model)
	{
		model.addAttribute("cust", new Customer());
		return "home";
	}
	@PostMapping("/insertuser")
	public String insertuser(@ModelAttribute("cust") Customer c, Model model)
	{
		customerservice.createuser(c);
		List<Customer> customers= customerservice.getCustomers();
		model.addAttribute("customers",customers);
		return "success";
		
	}

}

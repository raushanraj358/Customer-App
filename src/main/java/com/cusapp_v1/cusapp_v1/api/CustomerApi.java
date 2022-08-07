package com.cusapp_v1.cusapp_v1.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cusapp_v1.cusapp_v1.dao.Customer;
import com.cusapp_v1.cusapp_v1.service.CustomerService;
@RestController
@RequestMapping(path = "api")
public class CustomerApi {

	private CustomerService customerService;

	@Autowired
	public CustomerApi(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping(path = "customer")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
}
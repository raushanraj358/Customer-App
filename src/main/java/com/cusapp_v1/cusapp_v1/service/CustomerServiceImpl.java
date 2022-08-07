package com.cusapp_v1.cusapp_v1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cusapp_v1.cusapp_v1.dao.Customer;
// 
@Service
public class CustomerServiceImpl implements CustomerService{
	@Override
	public List<Customer> getAll() {
		return Arrays.asList(new Customer(12, "Raj", 56000),new Customer(129, "Sanjeev", 46000));
	}

}



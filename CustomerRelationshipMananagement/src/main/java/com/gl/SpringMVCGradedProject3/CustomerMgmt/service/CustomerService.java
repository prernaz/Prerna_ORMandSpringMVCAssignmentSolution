package com.gl.SpringMVCGradedProject3.CustomerMgmt.service;

import com.gl.SpringMVCGradedProject3.CustomerMgmt.model.Customer;
import java.util.List;

public interface CustomerService {

	public List<Customer> findAll();
	public Customer findById(long customerId);
	public void save(Customer customer  );
	public void delete(long customerId);
	
}
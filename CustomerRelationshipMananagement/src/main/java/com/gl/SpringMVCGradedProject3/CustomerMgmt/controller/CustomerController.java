package com.gl.SpringMVCGradedProject3.CustomerMgmt.controller;

import com.gl.SpringMVCGradedProject3.CustomerMgmt.model.Customer;
import com.gl.SpringMVCGradedProject3.CustomerMgmt.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")

public class CustomerController {

@Autowired
private CustomerService customerservice;

@RequestMapping("/list")
public  String listCustomers(Model theModel) {
	
	List<Customer> theCustomers = customerservice.findAll();
	theModel.addAttribute("customers", theCustomers);
	return "list-customers";
}

@RequestMapping("/showFormForAdd")
public  String showFormForAdd(Model theModel) { 
	
	Customer customer = new Customer();
	theModel.addAttribute("customer", customer);
	theModel.addAttribute("mode", "Add");
	return "customer-form";
}

@RequestMapping("/showFormForUpdate")
public  String showFormForUpdate(@RequestParam("customerId") long customerId, Model theModel) { 
	
	Customer customer = customerservice.findById(customerId);
	theModel.addAttribute("customer", customer);
	theModel.addAttribute("mode", "Update");
	return "customer-form";
}

@PostMapping("/save")
public  String saveCustomer(@RequestParam("customerId") long customerId, 
		@RequestParam("firstName") String firstName,
		@RequestParam("lastName") String lastName,
		@RequestParam("email") String email )  {
	       
	   Customer customer = null;
	   if(customerId==0) {
		 customer = new Customer(firstName,lastName,email);
	    }
	  
	   else { 
		customer = customerservice.findById(customerId);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		
	}
	   
	   customerservice.save(customer);
	  	return "redirect:list";
 }

 @RequestMapping("/delete")
  public String delete(@RequestParam("customerId") long customerId) {
	
	customerservice.delete(customerId);
	return "redirect:list";
   }

  }
 
package com.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerOperationController
{
	 @GetMapping("/getCustomerData")
	 public ResponseEntity<Customer> getCustomerDetails()
	 {
		 Customer cust = new Customer();
		  cust.setCno(1001);
		  cust.setCname("Sukanta");
		  cust.setBillAmt(10000f);
		  cust.setLocation("Bhadrak");
		  
		 return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	 }
	 @PostMapping("/register")
	 public ResponseEntity<Customer> registerCustomer(@RequestBody Customer cust)
	 {
		 
		 return new ResponseEntity<Customer>(cust,HttpStatus.CREATED);
	 }
}

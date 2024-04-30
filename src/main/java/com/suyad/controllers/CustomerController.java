package com.suyad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suyad.AddressClass;
import com.suyad.Customer;

@Controller
public class CustomerController 
{
	@Autowired
	Customer c;
	@Autowired
	AddressClass a;
	
	@GetMapping("/json")
	@ResponseBody
	public Customer getJsonData()
	{
		a.setCity("Bathan Kalan");
		a.setState("Punjab");
		a.setCountry("India");
		c.setId(10);
		c.setName("Suyadpreet Singh");
		c.setEmail("Suyadpreet@gmail.com");
		c.setPhno(95015L);
		c.setAddr(a);
		return c;
	}
}

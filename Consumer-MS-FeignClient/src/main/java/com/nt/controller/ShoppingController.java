package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	
	@Autowired
	private IBillingServiceRestConsumer client;
	
	@GetMapping("/details")
	public String displayShoppingDetails() {
		System.out.println("ShoppingController:: client comp class name:: " + client.getClass());
		return "Diwali Shopping for Family...."+client.fetchBillDetails();
	}

}

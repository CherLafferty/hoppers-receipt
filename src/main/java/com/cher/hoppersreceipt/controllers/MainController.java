package com.cher.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		String name = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 5.25;
		String description = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		
		//Add values to the view model that will be rendered
		model.addAttribute("customerName", name);
		model.addAttribute("product", itemName);
		model.addAttribute("itemPrice", price);
		model.addAttribute("productDescription", description);
		model.addAttribute("vendorName", vendor);
		
		return "index.jsp";
	}
}

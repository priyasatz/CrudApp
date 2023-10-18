package com.priya.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCars {
	@GetMapping("/Cars")
	public String Cars(){
		return "Holiday car sales..... Limited offer"; 
	}
	@GetMapping("/Toyoto")
	public String Toyoto(){
		return "Toyoto 5000$ drop..... Discount last for a week";
	}
	@GetMapping("/Hyundai")
	public String Hyundai(){
		return "Hyundai 7000$ drop";
	}
	
	@GetMapping("/Jeep")
	public String Jeep(){
		return "Check our website";
	}
	@GetMapping("/Nissan")
	public String Nissan(){
		return "Nissan 9000$ drop";
	}
	@GetMapping("/Chevrolet")
	public String Chevrolet(){
		return "Chevrolet price dropped based on colors";
	}
	@GetMapping("/Dodge")
	public String Dodge(){
		return "New model on market with exclusive offer";
	}
	@GetMapping("/GMC")
	public String GMC(){
		return "GMC 12000$ drop";
	}
	@GetMapping("/Volkswagon")
	public String Volkswagon(){
		return "Check instore";
	}
	@GetMapping("/Volvo")
	public String Volvo(){
		return "Volvo has Special deal";
	}
	@GetMapping("/Ford")
	public String Ford(){
		return "Ford 3000$ drop";
	}
	@GetMapping("/Camry")
	public String Camry(){
		return "Limited time deal";
	}
	@GetMapping("/Kia")
	public String Kia(){
		return "Reach the store to know the exclusive offer";
	}
}

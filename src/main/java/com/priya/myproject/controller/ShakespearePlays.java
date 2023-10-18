package com.priya.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//testing github
@RestController
public class ShakespearePlays {
	
	@GetMapping("/Plays")
	public String Plays (){
		return "Famous Plays for Sale testing dev tools Offers applicable Code lab  ";	
	}
	@GetMapping("/Hamlet")
	public String Hamlet() {
		return "Hamlet has 20% discount";
	}
	@GetMapping("/KingLear")
	public String KingLear() {
		return "KingLear has 10% discount";
	}
}

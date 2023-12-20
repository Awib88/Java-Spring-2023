package com.amin.daikaichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikaichi")
public class DaikaichiController {
	@RequestMapping("")
	public String hello() {
		return "hello ";
	}
	
	@RequestMapping("/travel/{country}")
	public String travel(@PathVariable("country") String country) {
		return "Congratulations! You will soon travel to " + country;
	}
	
	@RequestMapping("/lotto/{number}")
	public String number(@PathVariable("number") int number) {
		if(number % 2 == 0) {
			return "You will take a grand..bla bla";
		}else {
			return "You have enjoyed the fruits..re-bla bla";
		}
	}
}

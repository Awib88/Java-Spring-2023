package com.amin.omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "Form.jsp";
	}
	
	@RequestMapping(value="/process",method=RequestMethod.POST)
	public String process(HttpSession session,
			@RequestParam(value="number") String number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="living") String living,
			@RequestParam(value="message") String message
			) {
		
		String[] result = {number,city,person,hobby,living,message};
		session.setAttribute("result", result);	
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String show(HttpSession session,Model model) {
		
		String[] result = (String[]) session.getAttribute("result");
		model.addAttribute("result", result);
		
		return "Show.jsp";
	}
}

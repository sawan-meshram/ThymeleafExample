package com.example.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/about", method= RequestMethod.GET)
	public String about(Model model) {
		System.out.println("This is about controller");
		model.addAttribute("name", "Sawan Meshram");
		model.addAttribute("currentDate", new Date().toLocaleString());

		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		
//		List<String> list = new ArrayList<>();
//		list.add("Sawan");
//		list.add("Raju");
//		list.add("Sachin");
//		list.add("Keshav");
		
		List<String> list = Arrays.asList("Sawan", "Raju", "Sachin", "Keshav");
		model.addAttribute("names", list);
		
		return "iterate";
	}
	
	//Handler for conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model model) {
		model.addAttribute("isActive", false);
		model.addAttribute("gender", "F");
		
		List<Integer> list = Arrays.asList(1);
		model.addAttribute("myList", list);
		
		return "condition";
	}
	
	//handler for including fragments
	@GetMapping("/service")
	public String servicesHandler(Model model) {
		model.addAttribute("title", "I liked to eat pizza");
		model.addAttribute("subtitle", LocalDate.now().toString());
		return "service";
	}
	
	//new about page
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}

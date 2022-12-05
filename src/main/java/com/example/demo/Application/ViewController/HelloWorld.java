package com.example.demo.Application.ViewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("message","Hello World!");
		return "index";
	}
}

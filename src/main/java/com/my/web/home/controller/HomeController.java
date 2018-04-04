package com.my.web.home.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private Logger logger = Logger.getLogger(HomeController.class.getName());

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String viewHomePage() {
		
		logger.info("/home/info");
		return "home/home";
	}
}

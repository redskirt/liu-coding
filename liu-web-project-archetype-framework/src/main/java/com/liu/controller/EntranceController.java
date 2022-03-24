package com.liu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Matthew
 * @description
 */
@RestController("/main")
public class EntranceController extends GeneralController {

	@GetMapping("/login")
	public ModelAndView login() {
		
		return new ModelAndView("login");
	}
	
	
	@GetMapping("/")
	public ModelAndView main() {
		return forwardOrRedirect("main");
	}
	
	
}

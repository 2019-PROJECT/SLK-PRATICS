package com.example.rc.org.controller;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRest {
	
	@RequestMapping("/details")
	public String getDetails(@QueryParam("name")String name) {
		
		return "hi...."+name +"THIS IS YOUR RESULT";
		
		
	}
}

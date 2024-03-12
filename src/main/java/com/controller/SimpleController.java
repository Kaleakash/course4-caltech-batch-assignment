package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value = "/")
	public String sayHello() {
		String msg=  "<div style='color:red'>Welcome DrShawn pet clinic</div>";
		return msg;
	}
}

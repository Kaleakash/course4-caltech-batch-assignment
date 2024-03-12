package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value = "/")
	public String sayHello() {
		String msg=  "<div style='color:red;backgrond-color:yellow;	align:center;'>Welcome DrShawn pet clinic. This appliatication develop using spring boot</div>";
		return msg;
	}
}

package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping(value = "/")
	public String sayHello() {
		String msg=  "<div style='color:red;background-color:yellow;font-size:40pt;'>"
				+ "Welcome DrShawn pet clinic. This appliatication develop using spring boot"
				+ "We are developing application using Spring, EC2, Docker, Jenkin etc"
				+ "</div>";
		return msg;
	}
}

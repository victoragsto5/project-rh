package com.dpaula.rh.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloResource {
 
	@RequestMapping("/hello")
	public String index() {
		return "Spring Boot Example!!";
	}
 
}
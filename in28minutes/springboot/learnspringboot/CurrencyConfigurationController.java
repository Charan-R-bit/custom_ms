package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CurrencyConfigurationController 
{
	@Value("${spring.name}")
	String name;
	@Autowired
	private CurrencyServiceConfiguration configuration;
	@RequestMapping("/currency")
	public  CurrencyServiceConfiguration retrieveAllCourses()
	{
		return configuration;		
	}
	@GetMapping("/app")
	public String Applicationproperties(){
		return name;
	}
}
	

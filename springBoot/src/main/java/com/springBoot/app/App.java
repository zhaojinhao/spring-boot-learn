package com.springBoot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {
	@RequestMapping("/index")
	@ResponseBody
	 public String index(){
		 return "hello";
	 }
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}

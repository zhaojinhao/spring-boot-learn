package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Value("${com.springBoot.name}")
    private  String name;
    @Value("${com.springBoot.age}")
    private  String age;
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("mess", name+age);
		System.out.println(name+age);
		return "hello";
	}
}

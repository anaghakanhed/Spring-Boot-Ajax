package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadIndex(){
	return "index";
	}
	

	
	@GetMapping("/msg")
	@ResponseBody
	public String getMsg(@RequestParam("name") String name) {
		String msg = "Hello, " + name;
		return msg;
	}
	
	@GetMapping("/cmsg")
	@ResponseBody
	public String getDropdownMsg(@RequestParam("cname") String cname) {
		String msg = "I am going to, " + cname + " in next month";
		return msg;
	}

}

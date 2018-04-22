package com.labseni.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
	@RequestMapping("/")
	public String welcome(Model model)
	{
		model.addAttribute("greeting", "Welcome to MIT!");
		model.addAttribute("tagline", "Only faoziaziz can pass MIT");
		return "welcome";
	}
}
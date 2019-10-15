package com.moneyhub.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moneyhub.web.serviceimpls.AdminServiceImpl;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	@Autowired AdminServiceImpl adminService;
	
	@GetMapping("/count")
	public String count(Model model) {
		int count = adminService.countAdmin();
		model.addAttribute("count", count);
		return "index";
	}
	
	@GetMapping("/info")
	public String findAdminById(@RequestParam("aid") String aid,
			@RequestParam("pwd") String pwd) {
		
		
		
		
		return "index";
	}
	
	
	
	
}

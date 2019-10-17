package com.moneyhub.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moneyhub.web.domains.ClientDTO;


@Controller
@RequestMapping("/client/*")
public class ClientController {
	private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
//	@Autowired AdminServiceImpl adminService;
	
	
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody ClientDTO user) {			
		logger.info("AJAX 가 보낸 아이디 와 비번 {}" , user.getCid() + "," + user.getPwd());
		HashMap<String,String> map = new HashMap<>();
		map.put("cid", user.getCid());
		map.put("pwd", user.getPwd());
		logger.info("map에 담긴 아이디 와 비번 {}" , map.get("cid") + "," + map.get("pwd"));
		return map;
	}               
	
	
	
	
	
}

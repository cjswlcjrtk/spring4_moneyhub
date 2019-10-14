package com.moneyhub.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.moneyhub.web.services.MoneyhubService;

@Controller
public class MoneyhubController {
	private static final Logger logger = LoggerFactory.getLogger(MoneyhubController.class);
	@Autowired MoneyhubService moneyhubService;
}

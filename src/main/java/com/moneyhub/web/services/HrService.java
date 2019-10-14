package com.moneyhub.web.services;

import java.util.List;

import com.moneyhub.web.domains.HrDTO;

import org.springframework.stereotype.Component;

@Component
public interface HrService {
	public void join(HrDTO param);
	public HrDTO login(HrDTO param);
	public List<String> viewMypage();
}

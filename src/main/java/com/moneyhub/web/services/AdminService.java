package com.moneyhub.web.services;

import java.util.List;

import com.moneyhub.web.domains.AdminDTO;

import org.springframework.stereotype.Component;

@Component
public interface AdminService {
	public void join(AdminDTO param);
	public AdminDTO login(AdminDTO param);
	public List<String> viewMypage();
	
	public int countAdmin();
}

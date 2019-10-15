package com.moneyhub.web.serviceimpls;

import java.util.List;

import com.moneyhub.web.domains.AdminDTO;
import com.moneyhub.web.mappers.AdminMapper;
import com.moneyhub.web.services.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminMapper adminMapper;

	public void join(AdminDTO param) {
	}
	
	public AdminDTO login(AdminDTO param) {
		return null;
	} 	

	public List<String> viewMypage() {
		return null;
	}

	@Override
	public int countAdmin() {
		return adminMapper.countAdmin();
	}

	

}

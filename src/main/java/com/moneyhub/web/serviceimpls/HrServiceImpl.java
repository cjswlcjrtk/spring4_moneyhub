package com.moneyhub.web.serviceimpls;

import java.util.List;

import com.moneyhub.web.domains.HrDTO;
import com.moneyhub.web.services.HrService;
import org.springframework.stereotype.Service;
@Service
public class HrServiceImpl implements HrService{
	private static HrServiceImpl instance = new HrServiceImpl();
	public static HrServiceImpl getInstance() {return instance;}
	private HrServiceImpl() {}

	public void join(HrDTO param) {
	}
	
	public HrDTO login(HrDTO param) {
		return null;
	} 	

	public List<String> viewMypage() {
		return null;
	}

}

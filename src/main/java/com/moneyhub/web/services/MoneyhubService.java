package com.moneyhub.web.services;

import java.util.List;

import com.moneyhub.web.domains.MoneyhubDTO;

import org.springframework.stereotype.Component;

@Component
public interface MoneyhubService {
	public void join(MoneyhubDTO param);
	public MoneyhubDTO login(MoneyhubDTO param);
	public List<String> viewMypage();
}

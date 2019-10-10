package com.moneyhub.web.services;

import java.util.List;

import com.moneyhub.web.domains.HrBean;

public interface HrService {
	public void join(HrBean param);
	public HrBean login(HrBean param);
	public List<String> viewMypage();
}

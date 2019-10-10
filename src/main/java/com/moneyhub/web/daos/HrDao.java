package com.moneyhub.web.daos;

import java.util.List;

import com.moneyhub.web.domains.HrBean;

public interface HrDao {
	public void insertJoin(HrBean param);
	public HrBean selectLogin(HrBean param);
	public List<String> searchMypage();
}

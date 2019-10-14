package com.moneyhub.web.daos;

import java.util.List;
import com.moneyhub.web.domains.HrDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface HrDao {
	public void insertJoin(HrDTO param);
	public HrDTO selectLogin(HrDTO param);
	public List<String> searchMypage();
}

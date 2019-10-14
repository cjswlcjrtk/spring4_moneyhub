package com.moneyhub.web.mappers;

import java.util.List;
import com.moneyhub.web.domains.MoneyhubDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyhubMapper {
	public void insertJoin(MoneyhubDTO param);
	public MoneyhubDTO selectLogin(MoneyhubDTO param);
	public List<String> searchMypage();
}

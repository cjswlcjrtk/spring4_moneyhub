package com.moneyhub.web.domains;

import java.io.Serializable;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class ClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String cid,
	pwd;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "ClientDTO [cid=" + cid + ", pwd=" + pwd + "]";
	}
	
	
	
	
	
	
}

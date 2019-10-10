package com.moneyhub.web.command;

import javax.servlet.http.HttpServletRequest;

import com.moneyhub.web.pool.Constants;

import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, domain, page, view;
	public void setDomain(){
		domain = request.getServletPath().replace(".do", "").substring(1);
	}
	
	public void execute() {
		this.view = String.format(Constants.DOUBLE_PATH,"facade", "main");
	}
}

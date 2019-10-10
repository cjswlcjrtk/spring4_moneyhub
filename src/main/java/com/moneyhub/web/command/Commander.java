package com.moneyhub.web.command;

import javax.servlet.http.HttpServletRequest;

import com.moneyhub.web.enums.Action;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE:
			cmd = null;
			break;
		case LOGIN:
			cmd = null;
			break;
		case JOIN:
			cmd = null;
			break;
		case SEARCH:
			cmd = null;
			break;
		default:
			break;
		}
		return cmd;
	}
}

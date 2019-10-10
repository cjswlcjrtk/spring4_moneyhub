package com.moneyhub.web.enums;

public enum URL {
	ORACLE_URL;
	
	public String toString() {
		return "jdbc:oracle:thin:@localhost:1521:xe";
	}
}

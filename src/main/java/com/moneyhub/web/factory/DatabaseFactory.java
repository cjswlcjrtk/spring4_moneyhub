package com.moneyhub.web.factory;

public class DatabaseFactory {
	public static Database createDatabase(String vendor) {
		return new Oracle();
	}
}

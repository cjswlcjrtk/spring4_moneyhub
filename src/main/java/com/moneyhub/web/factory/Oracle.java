package com.moneyhub.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.moneyhub.web.enums.DRIVER;
import com.moneyhub.web.enums.URL;
import com.moneyhub.web.pool.Constants;

public class Oracle implements Database{

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(URL.ORACLE_URL.toString(),
					Constants.USERNAME,
					Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}

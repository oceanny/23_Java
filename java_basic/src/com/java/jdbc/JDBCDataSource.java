package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCDataSource extends AbstractMyDataSource {

	private static JDBCDataSource instance = new JDBCDataSource();

	private JDBCDataSource() {
	}

//	singletone pattern
	public static JDBCDataSource getInstance() {
		return instance;
	}

	{
		try {
//			driver loading			
			Class.forName(properties.getProperty("driver"));

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public Connection getConnection() throws SQLException {
//			get Connection
//			�ܺο��� url, username, password ���� ���� -> connection �����
		this.conn = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
				properties.getProperty("password"));
		return conn;
	}

}

package com.java.jdbc;

import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.ibatis.io.Resources;

public abstract class AbstractMyDataSource {
	
	protected Connection conn;
	protected Properties properties = new Properties();
	protected String path = "com/java/jdbc/jdbc.properties";
	
//	properties 초기화
	{
		try {
//			Resource에 reader를 요청
//			Factory pattern -> architecture 규격
			Reader reader = Resources.getResourceAsReader(path);
			properties.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public abstract Connection getConnection() throws SQLException;
	

}

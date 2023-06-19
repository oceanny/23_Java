package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCP2JDBCDataSource extends AbstractMyDataSource{
//	DBCP2 singletone pattern으로 만들기
	private static DBCP2JDBCDataSource instance = new DBCP2JDBCDataSource();
	private DBCP2JDBCDataSource() {}
	public static DBCP2JDBCDataSource getInstance() {
		return instance;
	}
	
//	JDBC는 driveManager를 발동하지만 DBCP는 set하는 형태 -> 더 객체지향적
	private BasicDataSource dataSource = new BasicDataSource();
//	private Properties properties;
//	private String path;
	
	{
//	singletone은 상속 불가 -> extends JDBCDataSource 불가능 -> wrapping
		
//		AbstractMyDataSource 만들어서 상속받음
//		JDBCDataSource dataSource = JDBCDataSource.getInstance();
//		properties = dataSource.getProperties();
//		path = dataSource.getPath();
		
//		jdbc db를 만들지 못한 상황이면 이런 방법을 사용해야 함
		this.dataSource.setDriverClassName(properties.getProperty("driver"));
		this.dataSource.setUrl(properties.getProperty("url"));
		this.dataSource.setUsername(properties.getProperty("username"));
		this.dataSource.setPassword(properties.getProperty("password"));
		
		this.dataSource.setInitialSize(10);
//		대기
		this.dataSource.setMaxIdle(2);
		
	}
	
//	private DBCP2JDBCDataSource() {}
//	public JDBCDataSource getInstance() {
//		return dataSource;
//	};
	
	
	public Connection getConnection() throws SQLException{
//		connection을 무조건 배정이 아닌 미리 할당 후 배정하는 방식으로 바뀜
		Connection conn = this.dataSource.getConnection();
		return conn;
	}

	public Properties getProperites() {
		return properties;
	}

	public void setProperites(Properties properites) {
		this.properties = properites;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}

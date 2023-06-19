package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCP2JDBCDataSource extends AbstractMyDataSource{
//	DBCP2 singletone pattern���� �����
	private static DBCP2JDBCDataSource instance = new DBCP2JDBCDataSource();
	private DBCP2JDBCDataSource() {}
	public static DBCP2JDBCDataSource getInstance() {
		return instance;
	}
	
//	JDBC�� driveManager�� �ߵ������� DBCP�� set�ϴ� ���� -> �� ��ü������
	private BasicDataSource dataSource = new BasicDataSource();
//	private Properties properties;
//	private String path;
	
	{
//	singletone�� ��� �Ұ� -> extends JDBCDataSource �Ұ��� -> wrapping
		
//		AbstractMyDataSource ���� ��ӹ���
//		JDBCDataSource dataSource = JDBCDataSource.getInstance();
//		properties = dataSource.getProperties();
//		path = dataSource.getPath();
		
//		jdbc db�� ������ ���� ��Ȳ�̸� �̷� ����� ����ؾ� ��
		this.dataSource.setDriverClassName(properties.getProperty("driver"));
		this.dataSource.setUrl(properties.getProperty("url"));
		this.dataSource.setUsername(properties.getProperty("username"));
		this.dataSource.setPassword(properties.getProperty("password"));
		
		this.dataSource.setInitialSize(10);
//		���
		this.dataSource.setMaxIdle(2);
		
	}
	
//	private DBCP2JDBCDataSource() {}
//	public JDBCDataSource getInstance() {
//		return dataSource;
//	};
	
	
	public Connection getConnection() throws SQLException{
//		connection�� ������ ������ �ƴ� �̸� �Ҵ� �� �����ϴ� ������� �ٲ�
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

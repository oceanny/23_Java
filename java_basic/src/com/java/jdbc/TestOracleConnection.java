package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestOracleConnection {

	private Connection conn;

	{
		try {

			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "java";
			String password = "java";

			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public static void main(String[] args) throws Exception {

		TestOracleConnection main = new TestOracleConnection();
//		main.selectSQL();
		main.insertSQL();

	}
	
	public void insertSQL() throws Exception {
		
		MemberVO member = new MemberVO();
		member.set�����̵�("mimi");
		member.set���̸�("�̼���");
		member.set����(26);
		member.set���("gold");
		member.set������(5690);
		
//		java�� sql�� ������ �����ݷ� X
//		insert into�� get�� �� ���� ���߱�
//		�����Ͱ� ���� �� �Է��ϱ� �����
//		String sql = "inert into ��(�����̵�, ���̸�, ����, ���, ����, ������)"
//				+ " values('" + member.get�����̵�() + "', '"
//				+ member.get���̸�() + "', '"
//				+ member.get����() + "', '"
//				+ member.get���() + "', '"
//				+ member.get����() + "', '"
//				+ member.get������() + "', "
//				+ ")";
//		
//		Statement stmt = conn.createStatement();
		
//		�����Ͱ� ���� �� �ڸ��� ���� ���ϵ�ī�� ?�� �Է�
		String sql = "insert into ��(�����̵�, ���̸�, ����, ���, ����, ������)"
				+ " values(?, ?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.get�����̵�());
		pstmt.setString(2, member.get���̸�());
		pstmt.setInt(3, member.get����());
		pstmt.setString(4, member.get���());
		pstmt.setString(5, member.get����());
		pstmt.setInt(6, member.get������());
		
//		�����ϸ� �ڵ� Ŀ�ԵǹǷ� test ����� �������� commit false
		conn.setAutoCommit(false);
		
//		stmt.executeUpdate(sql);
		pstmt.executeUpdate();
		
		selectSQL();
		conn.rollback();
		if (conn != null) conn.close();
		
	}

	public void selectSQL() throws Exception {

		String sql = "select * from ��";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<MemberVO> memberList = new ArrayList<MemberVO>();

		while (rs.next()) {
			MemberVO member = new MemberVO();
			member.set�����̵�(rs.getString("�����̵�"));
			member.set����(rs.getInt("����"));
			member.set���̸�(rs.getString("���̸�"));
			member.set���(rs.getString("���"));
			member.set������(rs.getInt("������"));
			member.set����(rs.getString("����"));

			memberList.add(member);

		}

		if (conn != null)
//			conn.close();

		System.out.println(memberList);
	}

}

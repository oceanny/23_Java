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
		member.set고객아이디("mimi");
		member.set고객이름("이수민");
		member.set나이(26);
		member.set등급("gold");
		member.set적립금(5690);
		
//		java로 sql문 생성시 세미콜론 X
//		insert into와 get의 값 순서 맞추기
//		데이터가 많을 땐 입력하기 어려움
//		String sql = "inert into 고객(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)"
//				+ " values('" + member.get고객아이디() + "', '"
//				+ member.get고객이름() + "', '"
//				+ member.get나이() + "', '"
//				+ member.get등급() + "', '"
//				+ member.get직업() + "', '"
//				+ member.get적립금() + "', "
//				+ ")";
//		
//		Statement stmt = conn.createStatement();
		
//		데이터가 많을 땐 자릿수 맞춰 와일드카드 ?로 입력
		String sql = "insert into 고객(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)"
				+ " values(?, ?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.get고객아이디());
		pstmt.setString(2, member.get고객이름());
		pstmt.setInt(3, member.get나이());
		pstmt.setString(4, member.get등급());
		pstmt.setString(5, member.get직업());
		pstmt.setInt(6, member.get적립금());
		
//		실행하면 자동 커밋되므로 test 결과만 보기위해 commit false
		conn.setAutoCommit(false);
		
//		stmt.executeUpdate(sql);
		pstmt.executeUpdate();
		
		selectSQL();
		conn.rollback();
		if (conn != null) conn.close();
		
	}

	public void selectSQL() throws Exception {

		String sql = "select * from 고객";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<MemberVO> memberList = new ArrayList<MemberVO>();

		while (rs.next()) {
			MemberVO member = new MemberVO();
			member.set고객아이디(rs.getString("고객아이디"));
			member.set나이(rs.getInt("나이"));
			member.set고객이름(rs.getString("고객이름"));
			member.set등급(rs.getString("등급"));
			member.set적립금(rs.getInt("적립금"));
			member.set직업(rs.getString("직업"));

			memberList.add(member);

		}

		if (conn != null)
//			conn.close();

		System.out.println(memberList);
	}

}

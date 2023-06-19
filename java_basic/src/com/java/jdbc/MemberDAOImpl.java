package com.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {

	private AbstractMyDataSource dataSource = DBCP2JDBCDataSource.getInstance();

//	private JDBCDataSource dataSource = JDBCDataSource.getInstance();

	@Override
	public List<MemberVO> selectMemberList() throws SQLException {

		Connection conn = dataSource.getConnection();

		String sql = "select * from 고객";
		Statement stmt = conn.createStatement();
		List<MemberVO> memberList = null;

		try {

			ResultSet rs = stmt.executeQuery(sql);
			memberList = new ArrayList<MemberVO>();

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
		} finally {
			if (conn != null)
				conn.close();
		}

		return memberList;
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {

		Connection conn = dataSource.getConnection();
//		member를 받아서 사용하므로 주석 처리
//		MemberVO member = new MemberVO();
//		member.set고객아이디("mimi");
//		member.set고객이름("이수민");
//		member.set나이(26);
//		member.set등급("gold");
//		member.set적립금(5690);

		String sql = "insert into 고객(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)" + " values(?, ?, ?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.get고객아이디());
		pstmt.setString(2, member.get고객이름());
		pstmt.setInt(3, member.get나이());
		pstmt.setString(4, member.get등급());
		pstmt.setString(5, member.get직업());
		pstmt.setInt(6, member.get적립금());

		pstmt.executeUpdate();
//		exception 발생시 close되지 않으므로 try-catch-finally 사용
		try {
			pstmt.executeUpdate();
		} finally {
			if (conn != null)
				conn.close();
		}

//		test 용도 말고 실제 사용하려면 db에 insert 해야하므로 롤백 X
//		conn.setAutoCommit(false);
//		selectSQL();
//		conn.rollback();

	}

}

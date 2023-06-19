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

		String sql = "select * from ��";
		Statement stmt = conn.createStatement();
		List<MemberVO> memberList = null;

		try {

			ResultSet rs = stmt.executeQuery(sql);
			memberList = new ArrayList<MemberVO>();

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
		} finally {
			if (conn != null)
				conn.close();
		}

		return memberList;
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {

		Connection conn = dataSource.getConnection();
//		member�� �޾Ƽ� ����ϹǷ� �ּ� ó��
//		MemberVO member = new MemberVO();
//		member.set�����̵�("mimi");
//		member.set���̸�("�̼���");
//		member.set����(26);
//		member.set���("gold");
//		member.set������(5690);

		String sql = "insert into ��(�����̵�, ���̸�, ����, ���, ����, ������)" + " values(?, ?, ?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.get�����̵�());
		pstmt.setString(2, member.get���̸�());
		pstmt.setInt(3, member.get����());
		pstmt.setString(4, member.get���());
		pstmt.setString(5, member.get����());
		pstmt.setInt(6, member.get������());

		pstmt.executeUpdate();
//		exception �߻��� close���� �����Ƿ� try-catch-finally ���
		try {
			pstmt.executeUpdate();
		} finally {
			if (conn != null)
				conn.close();
		}

//		test �뵵 ���� ���� ����Ϸ��� db�� insert �ؾ��ϹǷ� �ѹ� X
//		conn.setAutoCommit(false);
//		selectSQL();
//		conn.rollback();

	}

}

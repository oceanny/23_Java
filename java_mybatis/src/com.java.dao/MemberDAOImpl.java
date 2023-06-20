package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.java.dataSource.OracleMybatisDataSource;
import com.java.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private SqlSessionFactory sqlSessionFactory = OracleMybatisDataSource.getInstance().getSqlSessionFactory();

//	private JDBCDataSource dataSource = JDBCDataSource.getInstance();

	@Override
	public List<MemberVO> selectMemberList() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		List<MemberVO> memberList = session.selectList("Member-Mapper.selectMemberList");
		return memberList;
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {		
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("Member-Mapper.insertMemberList", member);
	}

}

package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface MemberDAO {
	
	List<MemberVO> selectMemberList() throws SQLException;
//	Member를 받아오기(객체지향)
	void insertMember(MemberVO member) throws SQLException;
	
}

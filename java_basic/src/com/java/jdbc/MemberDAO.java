package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface MemberDAO {
	
	List<MemberVO> selectMemberList() throws SQLException;
//	Member�� �޾ƿ���(��ü����)
	void insertMember(MemberVO member) throws SQLException;
	
}

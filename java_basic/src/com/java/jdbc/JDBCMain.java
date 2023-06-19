package com.java.jdbc;

import java.util.List;

public class JDBCMain {
	
	public static void main(String[] args) throws Exception {
//		instance는 Impl이 제공함
		MemberDAO memberDAO = new MemberDAOImpl();
		
		List<MemberVO> memberList = memberDAO.selectMemberList();
		
		System.out.println(memberList);
		
	}
	
}

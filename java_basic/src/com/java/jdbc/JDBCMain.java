package com.java.jdbc;

import java.util.List;

public class JDBCMain {
	
	public static void main(String[] args) throws Exception {
//		instance�� Impl�� ������
		MemberDAO memberDAO = new MemberDAOImpl();
		
		List<MemberVO> memberList = memberDAO.selectMemberList();
		
		System.out.println(memberList);
		
	}
	
}

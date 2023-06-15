package com.java.dao;

import java.util.List;

import com.java.dto.MemberVO;

public interface MemberDAO {
	
//	ȸ�����
	List<MemberVO> selectMemberList() throws Exception;
	
//	ȸ����
	MemberVO selectMemberById(String id) throws Exception;
	
//	ȸ�����
	void insertMember(MemberVO member) throws Exception;
	
//	ȸ������
	void updateMember(MemberVO member) throws Exception;
	
//	ȸ������
	void deleteMember(String id) throws Exception;
	
	
}

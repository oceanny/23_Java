package com.java.dao;

import java.util.List;

import com.java.dto.MemberVO;

public interface MemberDAO {
	
//	회원목록
	List<MemberVO> selectMemberList() throws Exception;
	
//	회원상세
	MemberVO selectMemberById(String id) throws Exception;
	
//	회원등록
	void insertMember(MemberVO member) throws Exception;
	
//	회원수정
	void updateMember(MemberVO member) throws Exception;
	
//	회원삭제
	void deleteMember(String id) throws Exception;
	
	
}

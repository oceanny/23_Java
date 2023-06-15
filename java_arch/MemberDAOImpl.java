package com.java.dao;

import java.util.List;

import com.java.datasource.DataSource;
import com.java.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private DataSource dataSource = DataSource.getInstance();

	@Override
	public List<MemberVO> selectMemberList() throws Exception {
		List<MemberVO> memberList = dataSource.getMemberList();
		return memberList;
	}

	@Override
	public MemberVO selectMemberById(String id) throws Exception {
		List<MemberVO> memberList = dataSource.getMemberList();
		if (memberList == null || id == null || id.isEmpty())
			throw new NullPointerException();
		
		MemberVO findMember = null;
		for (int i = 0; i < memberList.size(); i++) {
			MemberVO member = memberList.get(i);
			if (id.equals(member.getId())) {
				findMember = member;
				break; // i = memberList.size()도 break의 역할 수행
			}
		}
		return findMember;
	}

	@Override
	public void insertMember(MemberVO member) throws Exception {
//		NullPointerException을 throw하면 add를 실행하지 않아서 if문을 굳이 할 필요 없다
		if (member == null)
			throw new NullPointerException();

		List<MemberVO> memberList = dataSource.getMemberList();
		memberList.add(member);
	}

	@Override
	public void updateMember(MemberVO member) throws Exception {
//		member가 null인 경우와 list가 null인 경우를 구별하고 싶다면 NullPointerException override
		if (member == null)
			throw new NullPointerException();

		List<MemberVO> memberList = dataSource.getMemberList();
		if (memberList == null)
			throw new NullPointerException();

		for (int i = 0; i < memberList.size(); i++) {
			String targetId = memberList.get(i).getId();
			if (member.getId().equals(targetId)) {
				memberList.set(i, member);
			}
		}
	}

	@Override
	public void deleteMember(String id) throws Exception {
		List<MemberVO> memberList = dataSource.getMemberList();
		if (memberList == null)
			throw new NullPointerException();

		for (int i = 0; i < memberList.size(); i++) {
			MemberVO member = memberList.get(i);
			if (id.equals(member.getId())) {
				memberList.remove(i);
			}
		}
	}
}

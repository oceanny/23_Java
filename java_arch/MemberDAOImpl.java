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
				break; // i = memberList.size()�� break�� ���� ����
			}
		}
		return findMember;
	}

	@Override
	public void insertMember(MemberVO member) throws Exception {
//		NullPointerException�� throw�ϸ� add�� �������� �ʾƼ� if���� ���� �� �ʿ� ����
		if (member == null)
			throw new NullPointerException();

		List<MemberVO> memberList = dataSource.getMemberList();
		memberList.add(member);
	}

	@Override
	public void updateMember(MemberVO member) throws Exception {
//		member�� null�� ���� list�� null�� ��츦 �����ϰ� �ʹٸ� NullPointerException override
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

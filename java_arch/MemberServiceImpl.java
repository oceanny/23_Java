package com.java.service;

import com.java.dao.MemberDAO;
import com.java.dao.MemberDAOImpl;
import com.java.dto.MemberVO;
import com.java.exception.IdNotFoundException;
import com.java.exception.InvalidPasswordException;
import com.java.exception.MemberDAOException;

public class MemberServiceImpl implements MemberService {

	private MemberDAO dao = new MemberDAOImpl();
	
	@Override
	public void login(String id, String pwd) throws IdNotFoundException, InvalidPasswordException, MemberDAOException {

		MemberVO member = null;
		try {
			member = dao.selectMemberById(id);
		} catch (Exception e) {
//			e.printStackTrace();
			throw new MemberDAOException();
		}
		if (member == null)
			throw new IdNotFoundException();
		if (!pwd.equals(member.getPwd()))
			throw new InvalidPasswordException();
	}
	
}

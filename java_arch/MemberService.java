package com.java.service;

import com.java.exception.IdNotFoundException;
import com.java.exception.InvalidPasswordException;
import com.java.exception.MemberDAOException;

public interface MemberService {
	
//	�α���
	void login(String id, String pwd) throws IdNotFoundException, InvalidPasswordException, MemberDAOException;
	
	
}

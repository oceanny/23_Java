package com.java.exception;

public class MemberService {
	
	public void login(String id, String pw) throws IdNotFoundException, InvalidPasswordException {
		
//		IdException �߻��� returnó�� �Լ��� ���� -> Exception �ΰ� ��µ��� ����
		if (!id.equals("mimi")) throw new IdNotFoundException();
		if (!pw.equals("mimi")) throw new InvalidPasswordException();
		
	}
	
}

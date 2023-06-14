package com.java.exception;

public class MemberService {
	
	public void login(String id, String pw) throws IdNotFoundException, InvalidPasswordException {
		
//		IdException 발생시 return처럼 함수가 끝남 -> Exception 두개 출력되지 않음
		if (!id.equals("mimi")) throw new IdNotFoundException();
		if (!pw.equals("mimi")) throw new InvalidPasswordException();
		
	}
	
}

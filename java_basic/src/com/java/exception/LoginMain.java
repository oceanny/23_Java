package com.java.exception;

public class LoginMain {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		try {
			service.login("mim", "mmm");
		} catch (IdNotFoundException | InvalidPasswordException e) {
//			IdException과 PwException 메세지를 다르게 설정했기 때문에 또는 으로 해도 결과가 헷갈리지 않음
		 System.out.println(e.getMessage());
		} 
		
	}

}

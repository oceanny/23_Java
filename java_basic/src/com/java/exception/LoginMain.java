package com.java.exception;

public class LoginMain {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		try {
			service.login("mim", "mmm");
		} catch (IdNotFoundException | InvalidPasswordException e) {
//			IdException�� PwException �޼����� �ٸ��� �����߱� ������ �Ǵ� ���� �ص� ����� �򰥸��� ����
		 System.out.println(e.getMessage());
		} 
		
	}

}

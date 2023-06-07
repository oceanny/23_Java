package com.java.dto;

public class TechWebStudent extends WebStudent {

//	abstract class 상속 시 method 구현 필수
	@Override
	public boolean login(String id, String pwd) {
//		TechWebStudent에 getID()가 없으므로 this와 super가 같은 메소드를 가리킨다

		boolean result = true;
//		기본값이 true이므로 not 연산자를 이용해 false인 경우만 솎아낸다
		if (!(id.equals(super.getId()))) {
			result = result && false;
		}
		
		if (!(pwd.equals(super.getPwd()))) {
			result = result && false;
		}
		
		return result;

	}

}

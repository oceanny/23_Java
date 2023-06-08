package com.java.dto;

// WebStudent를 상속받으면 Student와 Loginable을 모두 사용 가능해짐
// Student <- WebStudent <- Loginable 이라는 관계도를 알면 Student를 상속받는 코드로 수정 가능
// 그러면 WebStudent내에 생성된 멤버 변수를 굳이 가져오지 않음
public class TechWebStudent extends WebStudent{

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

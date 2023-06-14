package com.java.exception;

public class IdNotFoundException extends Exception {
	
//	exception에서 기본 메세지 생성하는 방법
//	getMessage 하면 해당 메세지가 출력됨
	public IdNotFoundException() {
		super("아이디가 존재하지 않습니다.");
	}

}

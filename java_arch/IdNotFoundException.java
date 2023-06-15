package com.java.exception;

public class IdNotFoundException extends Exception {
//	생성자
	public IdNotFoundException() {
		super("존재하지 않는 아이디 입니다.");
	}
	
}

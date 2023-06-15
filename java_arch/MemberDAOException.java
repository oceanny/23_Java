package com.java.exception;

public class MemberDAOException extends Exception {
	
	public MemberDAOException() {
		super("데이터 엑세스에 문제가 발생했습니다");
	}
	
}

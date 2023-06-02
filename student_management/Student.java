package com.java.dto;

import java.util.UUID;

public class Student {
	// 학생정보 : 학교명, 학번, 이름, 학년, 학과, 생년월일, 주소, 연락처, 상태
	// 명시적 초기화
	public static String school = "미래고";
	public String studentNum = "230601";
	public String name = "----";
	public int grade = -1;
	public String major = "";
	public String birth = "XXXX-XX-XX";
	public String address = "";
	public String contact = "XXX-XXXX-XXXX";
	public String state = "재학";
	
//	기본 생성자 생성해 변수를 입력받게 하는 메소드
//	우클 + source + generate constructor using filed
//	변수 이름은 필드의 변수명과 같게 만드는 게 일반적 (변수 구별을 위함)
//	묵시적 -> 명시적 -> 블록 초기화 -> 생성자 초기화
//	Zero   -> Value	 -> Statement	-> Other Value Statement
//	생성자 -> 블록 -> 명시 -> 묵시 순서로 초기화
//	외부에서 값을 입력받아 초기화를 해야할 때 생성자를 사용함
	
//	3개만 입력받는 메소드
//	public Student(String studentNum, String name, int grade) {
//		this.studentNum = studentNum;
//		this.name = name;
//		this.grade = grade;
//	}
	
	
//	우선 처리하고 싶은 변수 3개를 입력받고, 나머지는 빈값을 받음 
//	public Student(String studentNum, String name, int grade) {
//		this(studentNum, name, grade, "", "", "", "", "");
//	}
//	
//	모두 입력받는 메소드
//	public Student(String studentNum, String name, int grade, String major, String birth, String address,
//			String contact, String state) {
//		super();
//		this.studentNum = studentNum;
//		this.name = name;
//		this.grade = grade;
//		this.major = major;
//		this.birth = birth;
//		this.address = address;
//		this.contact = contact;
//		this.state = state;
//	}
	
	
	// 초기화 블록 : static이 없어 인스턴스를 만들 때마다 초기화 가능
	{
		studentNum = "230601";
		for (int i = 0; i < 3; i++) {
			studentNum += (int)(Math.random() * 10);
		}
		
		//시리얼 넘버를 만들 때 유용한 코드
		String tempStr = UUID.randomUUID().toString().replace("-", "").substring(0, (int)(Math.random() * 11) + 4);
		name = tempStr;		
		
		
//		홀수일 경우 111, 짝수일 경우 222를 붙이는 코드
//		if ((int)(Math.random()*11) % 2 > 0) studentNum = studentNum + "111";
//		else studentNum = studentNum + "222";
		// 등호 연산자는 쓰레기값 등의 문제가 생길 수 있으므로 크기 비교를 선호함
	}
	
	static {
		
	}
}

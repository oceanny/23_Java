package com.java.dto;

import java.util.UUID;

public class Student {
	// �л����� : �б���, �й�, �̸�, �г�, �а�, �������, �ּ�, ����ó, ����
	// ����� �ʱ�ȭ
	public static String school = "�̷���";
	public String studentNum = "230601";
	public String name = "----";
	public int grade = -1;
	public String major = "";
	public String birth = "XXXX-XX-XX";
	public String address = "";
	public String contact = "XXX-XXXX-XXXX";
	public String state = "����";
	
//	�⺻ ������ ������ ������ �Է¹ް� �ϴ� �޼ҵ�
//	��Ŭ + source + generate constructor using filed
//	���� �̸��� �ʵ��� ������� ���� ����� �� �Ϲ��� (���� ������ ����)
//	������ -> ����� -> ��� �ʱ�ȭ -> ������ �ʱ�ȭ
//	Zero   -> Value	 -> Statement	-> Other Value Statement
//	������ -> ��� -> ��� -> ���� ������ �ʱ�ȭ
//	�ܺο��� ���� �Է¹޾� �ʱ�ȭ�� �ؾ��� �� �����ڸ� �����
	
//	3���� �Է¹޴� �޼ҵ�
//	public Student(String studentNum, String name, int grade) {
//		this.studentNum = studentNum;
//		this.name = name;
//		this.grade = grade;
//	}
	
	
//	�켱 ó���ϰ� ���� ���� 3���� �Է¹ް�, �������� ���� ���� 
//	public Student(String studentNum, String name, int grade) {
//		this(studentNum, name, grade, "", "", "", "", "");
//	}
//	
//	��� �Է¹޴� �޼ҵ�
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
	
	
	// �ʱ�ȭ ��� : static�� ���� �ν��Ͻ��� ���� ������ �ʱ�ȭ ����
	{
		studentNum = "230601";
		for (int i = 0; i < 3; i++) {
			studentNum += (int)(Math.random() * 10);
		}
		
		//�ø��� �ѹ��� ���� �� ������ �ڵ�
		String tempStr = UUID.randomUUID().toString().replace("-", "").substring(0, (int)(Math.random() * 11) + 4);
		name = tempStr;		
		
		
//		Ȧ���� ��� 111, ¦���� ��� 222�� ���̴� �ڵ�
//		if ((int)(Math.random()*11) % 2 > 0) studentNum = studentNum + "111";
//		else studentNum = studentNum + "222";
		// ��ȣ �����ڴ� �����Ⱚ ���� ������ ���� �� �����Ƿ� ũ�� �񱳸� ��ȣ��
	}
	
	static {
		
	}
}

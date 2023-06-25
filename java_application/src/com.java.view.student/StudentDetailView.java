package com.java.view.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.java.command.StudentCommand;
import com.java.view.View;

public class StudentDetailView implements View {

	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/student/main";
		Map<String, String> requestMap = new HashMap<String, String>();

//		��ȭ��
		StudentCommand student = (StudentCommand) model.get("student");
		System.out.println("������������������������������������������������������������������������������������");
		System.out.println("�й� : " + student.getStuNum());
		System.out.println("�̸� : " + student.getName());
		System.out.println("��ȭ��ȣ : " + student.getPhone());
		System.out.println("���ŵ�� : " + student.getStuLevel());
		System.out.println("���г⵵ : " + student.getEntDate());
		System.out.println("��ϳ�¥ : " + student.getRegDate());
		System.out.println("����� : " + student.getRegister());
		System.out.println("���� : " + student.getStateStr());
		System.out.println("������������������������������������������������������������������������������������");
		
		boolean flag;
		do {
			System.out.println("1. ������2. ������3. ������");
			String menu = new Scanner(System.in).nextLine();
			flag = false;
			
			switch (menu) {
			case "1":
				controllerURL = "/student/modifyForm";
				requestMap.put("stuNum", student.getStuNum());
				break;
			case "2":
				controllerURL = "/student/remove";
				requestMap.put("stuNum", student.getStuNum());
				break;
			case "3":
				controllerURL = "/student/main";
				break;
			default: flag = true;
			}
		} while (flag);

		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

}

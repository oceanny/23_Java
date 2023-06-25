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

//		상세화면
		StudentCommand student = (StudentCommand) model.get("student");
		System.out.println("──────────────────────────────────────────");
		System.out.println("학번 : " + student.getStuNum());
		System.out.println("이름 : " + student.getName());
		System.out.println("전화번호 : " + student.getPhone());
		System.out.println("내신등급 : " + student.getStuLevel());
		System.out.println("입학년도 : " + student.getEntDate());
		System.out.println("등록날짜 : " + student.getRegDate());
		System.out.println("등록자 : " + student.getRegister());
		System.out.println("상태 : " + student.getStateStr());
		System.out.println("──────────────────────────────────────────");
		
		boolean flag;
		do {
			System.out.println("1. 수정　2. 삭제　3. 나가기");
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

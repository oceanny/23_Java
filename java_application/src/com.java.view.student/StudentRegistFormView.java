package com.java.view.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.java.dto.StaffVO;
import com.java.session.Session;
import com.java.view.View;

public class StudentRegistFormView implements View {
	
	
	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
//		실제로 등록을 처리하는 경로로 설정
		String controllerURL = "/student/regist";
		Map<String, String> requestMap = new HashMap<String, String>();
		
//		등록입력
		Scanner sc = new Scanner(System.in);
		System.out.println("──────────────────────────────────────────");
		System.out.print("학번 > ");
		requestMap.put("stuNum", sc.nextLine());
		System.out.print("이름 > ");
		requestMap.put("name", sc.nextLine());
		System.out.print("전화번호 > ");
		requestMap.put("phone", sc.nextLine());
		System.out.print("패스워드 > ");
		requestMap.put("pwd", sc.nextLine());
		System.out.print("입학년도 > ");
		requestMap.put("entDate", sc.nextLine());
		StaffVO staff = (StaffVO)Session.getInstance().getAttribute("loginUser");
		System.out.println("등록자 > " + staff.getName());
		requestMap.put("register", staff.getStaffNum());
		System.out.print("상태 (1:재학 2:휴학 3:유급 4:자퇴 5:퇴학) > ");
		requestMap.put("state", sc.nextLine());
		System.out.println("──────────────────────────────────────────");
		
		requestMap.put("controllerURL", controllerURL);		
		return requestMap;
	}

}

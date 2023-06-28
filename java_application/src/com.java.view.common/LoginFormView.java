package com.java.view.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.java.view.View;

public class LoginFormView implements View {

	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/common/login";
		Map<String, String> requestMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("　◆ 사용자 로그인 ◆");
		System.out.println("──────────────────────");
		System.out.println(" 1. 학생　　2. 직원");
		System.out.print("선택 > ");
		String menu = sc.nextLine();
		switch (menu) {
		case "1": //학생
			requestMap.put("dist", "학생");			
			System.out.print("학생번호 > ");
			requestMap.put("stuNum", sc.nextLine());
			System.out.print("패스워드 > ");
			requestMap.put("pwd", sc.nextLine());
			break;
		case "2": //직원
			requestMap.put("dist", "직원");			
			System.out.print("직원번호 > ");
			requestMap.put("staffNum", sc.nextLine());
			break;
		}
		System.out.println("──────────────────────");

		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

}

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
//		������ ����� ó���ϴ� ��η� ����
		String controllerURL = "/student/regist";
		Map<String, String> requestMap = new HashMap<String, String>();
		
//		����Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("������������������������������������������������������������������������������������");
		System.out.print("�й� > ");
		requestMap.put("stuNum", sc.nextLine());
		System.out.print("�̸� > ");
		requestMap.put("name", sc.nextLine());
		System.out.print("��ȭ��ȣ > ");
		requestMap.put("phone", sc.nextLine());
		System.out.print("�н����� > ");
		requestMap.put("pwd", sc.nextLine());
		System.out.print("���г⵵ > ");
		requestMap.put("entDate", sc.nextLine());
		StaffVO staff = (StaffVO)Session.getInstance().getAttribute("loginUser");
		System.out.println("����� > " + staff.getName());
		requestMap.put("register", staff.getStaffNum());
		System.out.print("���� (1:���� 2:���� 3:���� 4:���� 5:����) > ");
		requestMap.put("state", sc.nextLine());
		System.out.println("������������������������������������������������������������������������������������");
		
		requestMap.put("controllerURL", controllerURL);		
		return requestMap;
	}

}

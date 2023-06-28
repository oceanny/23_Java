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

		System.out.println("���� ����� �α��� ��");
		System.out.println("��������������������������������������������");
		System.out.println(" 1. �л�����2. ����");
		System.out.print("���� > ");
		String menu = sc.nextLine();
		switch (menu) {
		case "1": //�л�
			requestMap.put("dist", "�л�");			
			System.out.print("�л���ȣ > ");
			requestMap.put("stuNum", sc.nextLine());
			System.out.print("�н����� > ");
			requestMap.put("pwd", sc.nextLine());
			break;
		case "2": //����
			requestMap.put("dist", "����");			
			System.out.print("������ȣ > ");
			requestMap.put("staffNum", sc.nextLine());
			break;
		}
		System.out.println("��������������������������������������������");

		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

}

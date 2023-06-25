package com.java.view.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.java.command.StudentCommand;
import com.java.view.View;

public class StudentListView implements View {
	
	@Override
	public Map<String, String> view(Map<String, Object> request) throws Exception {
		
		String url = "/student/main";
		
		List<StudentCommand> stuList = (List<StudentCommand>)request.get("stuList");
		System.out.println("������������������������������������������������������������������������������������");
		System.out.println("�й�\t\t�̸�\t���\t���г⵵\t����");
		for (int i = 0; i < stuList.size(); i++) {
			System.out.print(stuList.get(i).getStuNum() + "\t");
			System.out.print(stuList.get(i).getName() + "\t");
			System.out.print(stuList.get(i).getStuLevel() + "\t");
			System.out.print(stuList.get(i).getEntDate() + "\t");
			System.out.println(stuList.get(i).getStateStr() + "\n");
		}
		
		System.out.println("�󼼺��� �л���ȣ : (q : ������) >");
		String menu = new Scanner(System.in).nextLine();
		
		Map<String ,String> requestMap = new HashMap<String, String>();
		if (!menu.toLowerCase().equals("q")) {
			url = "/student/detail";
			requestMap.put("stuNum", menu);
		}
		requestMap.put("controllerURL", url);
		
		return requestMap;
	}
	
	
	
}

package com.java.controller.student;

import java.util.HashMap;
import java.util.Map;

import com.java.command.StudentCommand;
import com.java.controller.Controller;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class StudentDetailController implements Controller {
	
	private StudentService stuService = new StudentServiceImpl();
	
//	request���� �й��� ����
	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/student/main";
		Map<String, Object> model = new HashMap<String, Object>();
		
//		�󼼱��
		String stuNum = (String)request.get("stuNum");
//		StudentService���� �л�����ȸ ��ɿ� stuNum�� ����
		StudentCommand stu = stuService.detail(stuNum);
		
		model.put("student", stu);
		model.put("viewURL", viewURL);
		return model;
	}

}

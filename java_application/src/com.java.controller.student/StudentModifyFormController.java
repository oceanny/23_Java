package com.java.controller.student;

import java.util.HashMap;
import java.util.Map;

import com.java.command.StudentCommand;
import com.java.controller.Controller;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class StudentModifyFormController implements Controller {
	
	private StudentService stuService = new StudentServiceImpl();
	
	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/student/modifyForm";
//		stuService�� �޾� StudentCommand�� ����
//		ȭ���� View���� �����ֹǷ� controller���� ó����
		StudentCommand student = stuService.detail(request.get("stuNum"));
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("student", student);
		model.put("viewURL", viewURL);
		
		return model;
	}

}

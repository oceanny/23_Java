package com.java.controller.student;

import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;

public class StudentRegistFormController implements Controller {
		
	
	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/student/registForm";
//		�л� ��� ȭ�鸸 �����ֹǷ� ���� ó���� ���� ����
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("viewURL", viewURL);
		return model;
	}

}

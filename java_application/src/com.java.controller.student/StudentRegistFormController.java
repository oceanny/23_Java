package com.java.controller.student;

import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;

public class StudentRegistFormController implements Controller {
		
	
	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/student/registForm";
//		학생 등록 화면만 보여주므로 따로 처리할 것이 없다
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("viewURL", viewURL);
		return model;
	}

}

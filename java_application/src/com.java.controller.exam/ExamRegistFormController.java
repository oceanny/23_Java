package com.java.controller.exam;

import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;

public class ExamRegistFormController implements Controller {

	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/exam/registForm";
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("viewURL", viewURL);
		return model;
	}

}

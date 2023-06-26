package com.java.controller.common;

import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;

public class LoginFormController implements Controller {
	
	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/common/loginForm";
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("viewURL", viewURL);
		return model;
	}	
}
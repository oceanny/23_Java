  package com.java.view.common;

import java.util.HashMap;
import java.util.Map;

import com.java.view.View;

public class LoginView implements View {
	
	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/main";
		
		Exception e = (Exception)model.get("exception");
		if (e != null) {
			controllerURL = "/common/loginForm";
			System.out.println(e.getMessage());
		}
		
		String dist = (String)model.get("dist");
		if (dist.equals("ÇÐ»ý")) controllerURL = "/exam/main";
				
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

}

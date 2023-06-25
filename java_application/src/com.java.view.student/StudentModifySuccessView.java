package com.java.view.student;

import java.util.HashMap;
import java.util.Map;

import com.java.view.View;

public class StudentModifySuccessView implements View{
	
	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/student/detail";
		
		System.out.println(model.get("stuNum") + "�� �л� ������ �����߽��ϴ�.");
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("controllerURL", controllerURL);
		requestMap.put("stuNum", (String)model.get("stuNum"));
		return requestMap;
	}

}

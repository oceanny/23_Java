package com.java.view.student;

import java.util.HashMap;
import java.util.Map;

import com.java.view.View;

public class StudentModifyFailView implements View {

	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/student/main";
		
		System.out.println(model.get("stuNum") + "번 학생 수정이 실패했습니다.");
		
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

}

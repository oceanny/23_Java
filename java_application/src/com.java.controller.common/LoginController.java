package com.java.controller.common;

import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;
import com.java.service.StaffService;
import com.java.service.StaffServiceImpl;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class LoginController implements Controller {

	private StudentService stuService = new StudentServiceImpl();
	private StaffService staffService = new StaffServiceImpl();

	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "common/login";
//		�л�, ���� ����
		String dist = (String) request.get("dist");
		Map<String, Object> model = new HashMap<String, Object>();
		stuService.login("viewURL", viewURL);
		
		String stuNum = null;
		String staffNum = null;
		String pwd = null;		
		
		try {
			switch (dist) {
			case "�л�":
				stuNum = (String)request.get("stuNum");
				pwd = (String)request.get("pwd");
				stuService.login(stuNum, pwd);
				break;
			case "����":
				staffNum = (String)request.get("staffNum");
				pwd = (String)request.get("pwd");
				staffService.login(staffNum, pwd);
				break;
			}
//		����ó��
		}catch(Exception e) {
			model.put("exception", e);
		}
		
		model.put("viewURL", viewURL);
		model.put("dist", request.get("dist"));
		return model;
	}

}

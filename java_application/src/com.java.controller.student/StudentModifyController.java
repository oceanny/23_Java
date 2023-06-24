package com.java.controller.student;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;
import com.java.dto.StudentVO;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class StudentModifyController implements Controller {

	private StudentService stuService = new StudentServiceImpl();

	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/student/modifySuccess";

//		수정 처리
		StudentVO student = new StudentVO();
		student.setStuNum(request.get("stuNum"));
		student.setPwd(request.get("pwd"));
		student.setName(request.get("name"));
		student.setPhone(request.get("phone"));
		student.setStuLevel(Integer.parseInt(request.get("stuLevel")));
		student.setEntDate(request.get("entDate"));
		student.setState(Integer.parseInt(request.get("state")));

		try {
			stuService.modify(student);
		} catch (SQLException e) {
			viewURL = "/student/modifyFail";
		}

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("viewURL", viewURL);
		model.put("stuNum", request.get("stuNum"));
		return model;
	}

}

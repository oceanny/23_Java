package com.java.controller.student;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class StudentRemoveController implements Controller {

	private StudentService stuService = new StudentServiceImpl();

	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/student/remove";

//		삭제 처리
		String stuNum = request.get("stuNum");
		String message = "";
		try {
			stuService.remove(stuNum);
			message = stuNum + "번 학생 삭제를 성공했습니다.";
		} catch (SQLException e) {
			message = stuNum + "번 학생 삭제를 실패했습니다.";
		}

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("viewURL", viewURL);
		model.put("message", message);
		return model;
	}

}

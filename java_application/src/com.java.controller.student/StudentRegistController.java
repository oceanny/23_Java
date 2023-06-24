package com.java.controller.student;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.java.controller.Controller;
import com.java.dto.StudentVO;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class StudentRegistController implements Controller {

	private StudentService stuService = new StudentServiceImpl();

	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/student/registSuccess";
		StudentVO student = new StudentVO();

//		입력 데이터 처리
//		등록날짜 : 시스템에서 자동 등록되므로 set X
		student.setStuNum(request.get("stuNum"));
		student.setName(request.get("name"));
		student.setPhone(request.get("phone"));
		student.setPwd(request.get("pwd"));
		student.setEntDate(request.get("entDate"));
		student.setRegister(request.get("register"));
		student.setState(Integer.parseInt(request.get("state")));
		
		try {
			stuService.regist(student);
		} catch (SQLException e) {
			e.printStackTrace();
			viewURL = "/student/registFail";
//			에러 발생 시 dispatcher가 e를 받음 -> but 밑이 실행이 안되므로 던지지 않음
//			throw e;
		}

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("stuNum", student.getStuNum());
		model.put("viewURL", viewURL);
		return model;
	}

}

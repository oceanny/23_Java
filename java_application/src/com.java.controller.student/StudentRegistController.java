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

//		�Է� ������ ó��
//		��ϳ�¥ : �ý��ۿ��� �ڵ� ��ϵǹǷ� set X
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
//			���� �߻� �� dispatcher�� e�� ���� -> but ���� ������ �ȵǹǷ� ������ ����
//			throw e;
		}

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("stuNum", student.getStuNum());
		model.put("viewURL", viewURL);
		return model;
	}

}

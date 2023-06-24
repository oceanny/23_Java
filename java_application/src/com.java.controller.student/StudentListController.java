package com.java.controller.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.command.StudentCommand;
import com.java.controller.Controller;
import com.java.service.StudentService;
import com.java.service.StudentServiceImpl;

public class StudentListController implements Controller {
	
	private StudentService stuService = new StudentServiceImpl();
	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
//		StudentService -> List<StudentCommand> (w. ViewName) -> Map<String, String>
//		List<StudentCommand>를 함수가 끝나면 View Name과 함께 심어 넘겨줘야 함
//		화면 제어(처리)를 하기 때문에 Controller
//		-> 화면을 여는 건 Controller만 해야함
		Map<String, Object> model = new HashMap<String, Object>();
		List<StudentCommand> stuList = stuService.list();
		
		model.put("stuList", stuList);
		model.put("viewURL", "/student/list");
		
		return model;
	}
	
	

}

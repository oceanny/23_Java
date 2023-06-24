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
//		List<StudentCommand>�� �Լ��� ������ View Name�� �Բ� �ɾ� �Ѱ���� ��
//		ȭ�� ����(ó��)�� �ϱ� ������ Controller
//		-> ȭ���� ���� �� Controller�� �ؾ���
		Map<String, Object> model = new HashMap<String, Object>();
		List<StudentCommand> stuList = stuService.list();
		
		model.put("stuList", stuList);
		model.put("viewURL", "/student/list");
		
		return model;
	}
	
	

}

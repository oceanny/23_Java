package com.java.controller.exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.controller.Controller;
import com.java.dto.ExamVO;
import com.java.service.ExamService;
import com.java.service.ExamServiceImpl;

public class ExamListController implements Controller {
	
	private ExamService examService = new ExamServiceImpl();
	
	@Override
	public Map<String, Object> process(Map<String, String> request) throws Exception {
		String viewURL = "/exam/list";
		
		List<ExamVO> examList = examService.list();
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("viewURL", viewURL);
		model.put("examList", examList);
		return model;
	}

}

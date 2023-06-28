package com.java.view.exam;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.java.dto.ExamVO;
import com.java.view.View;

public class ExamListView implements View {

	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/exam/main";

		Map<String, String> requestMap = new HashMap<String, String>();
		
		System.out.println("시험번호\t시험날짜\t과목\t\t학년\t학기\t학번\t\t성적");

		List<ExamVO> examList = (List<ExamVO>) model.get("examList");
		for (int i = 0; i < examList.size(); i++) {
			ExamVO exam = examList.get(i);
			String examDate = new SimpleDateFormat("yyyy-MM-dd").format(exam.getExamDate());
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%s\t%d\n", exam.getExamNum(), examDate, exam.getSubNum(),
					exam.getGrade(), exam.getTerm(), exam.getStuNum(), exam.getScore());
		}

		System.out.println("상세조회 시험번호 (나가기 : q) > ");
		String menu = new Scanner(System.in).nextLine();

		switch (menu) {
		case "q":case "Q":
			controllerURL = "/exam/main";
			break;
		default:
			controllerURL = "/exam/detail";
			requestMap.put("controllerURL", menu);
		}

		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

}

package com.java.view.exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.java.dto.ExamVO;
import com.java.view.View;

public class ExamRegistFormView implements View {

	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/exam/regist";
		Scanner sc = new Scanner(System.in);
		
		ExamVO exam = new ExamVO();
		System.out.print("시험날짜 (yyyy-MM-dd) > ");
		Date examDate = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
		exam.setExamDate(examDate);
		
		System.out.println("학번 > ");
		exam.setStuNum(sc.nextLine());
		System.out.println("과목번호 > ");
		exam.setSubNum(sc.nextLine());
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(examDate);
		String examNum = cal.get(Calendar.YEAR) + "0" + exam.getGrade() + "0" + exam.getTerm() + (int)Math.random() * 100;
		System.out.println("시험번호 : " + examNum);
		exam.setExamNum(examNum);
		
		System.out.print("학년 > ");
		exam.setGrade(sc.nextInt());sc.nextLine();
		System.out.println("학기 > ");
		exam.setTerm(sc.nextInt());sc.nextLine();
		System.out.println("점수 > ");
		exam.setScore(sc.nextInt());sc.nextLine();
		
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("controllerURL", controllerURL);
		requestMap.put("examDate", new SimpleDateFormat("yyyy-MM-dd").format(exam.getExamDate()));
		requestMap.put("stuNum", exam.getStuNum());
		requestMap.put("subNum", exam.getSubNum());
		requestMap.put("examNum", exam.getExamNum());
		requestMap.put("grade", "" + exam.getGrade());
		requestMap.put("term", "" + exam.getTerm());
		requestMap.put("score", "" + exam.getScore());
		return requestMap;
	}

}

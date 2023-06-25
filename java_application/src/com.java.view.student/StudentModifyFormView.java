package com.java.view.student;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.java.command.StudentCommand;
import com.java.dao.StudentDAO;
import com.java.dao.StudentDAOImpl;
import com.java.dto.StudentVO;
import com.java.view.View;

public class StudentModifyFormView implements View {

//	state를 String으로 바꾸기 위해 DAO 호출
	private StudentDAO stuDAO = new StudentDAOImpl();

	@Override
	public Map<String, String> view(Map<String, Object> model) throws Exception {
		String controllerURL = "/student/modify";
		StudentCommand student = (StudentCommand) model.get("student");
		
		Map<String, String> requestMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			printStudent(student);
			System.out.println("수정 항목 (제출 : s, 나가기 : q) >");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1": // 패스워드
				System.out.println("1. 패스워드 > ");
				student.setPwd(sc.nextLine());
				break;
			case "2": // 이름
				System.out.println("2. 이름 > ");
				student.setName(sc.nextLine());
				break;
			case "3": // 전화번호
				System.out.println("3. 전화번호 > ");
				student.setPhone(sc.nextLine());			
				break;
			case "4": // 내신등급
				System.out.println("4. 내신등급 > ");
				student.setStuLevel(sc.nextInt());sc.nextLine();			
				break;
			case "5": // 입학년도
				System.out.println("5. 입학년도 > ");
				student.setEntDate(sc.nextLine());			
				break;
			case "6": // 상태
				System.out.println("6. 상태 (1:재학 2:휴학 3:유급 4:자퇴 5:퇴학) > ");
				student.setState(sc.nextInt());sc.nextLine();			
				break;
			case "s":
			case "S":
				flag = false;
				requestMap.put("stuNum", student.getStuNum());
				requestMap.put("pwd", student.getPwd());
				requestMap.put("name", student.getName());
				requestMap.put("phone", student.getPhone());
				requestMap.put("stulevel", "" + student.getStuLevel());
				requestMap.put("entDate", "" + student.getEntDate());
				requestMap.put("state", "" + student.getState());
				break;
			case "q":
			case "Q":
				flag = false;
				controllerURL = "/student/main";
				break;
			}
			System.out.println(student);
		}while(flag);

		requestMap.put("controllerURL", controllerURL);
		return requestMap;
	}

//	사용자가 수정할 때마다 학생의 정보를 보여주는 메소드 필요
	private void printStudent(StudentVO student) {
		System.out.println("──────────────────────────────────────────");
		System.out.println("학번 : " + student.getStuNum());
		System.out.println("1. 패스워드 : " + student.getPwd());
		System.out.println("2. 이름	: " + student.getName());
		System.out.println("3. 전화번호 : " + student.getPhone());
		System.out.println("4. 내신등급 : " + student.getStuLevel());
		System.out.println("5. 입학년도 : " + student.getEntDate());
		try {
			System.out.println("6. 상태	: " + stuDAO.selectStateByNum(student.getState()));
		} catch (SQLException e) {
			System.out.println("6. 상태	: - ");
		}
		System.out.println("──────────────────────────────────────────");
	}
}

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

//	state�� String���� �ٲٱ� ���� DAO ȣ��
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
			System.out.println("���� �׸� (���� : s, ������ : q) >");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1": // �н�����
				System.out.println("1. �н����� > ");
				student.setPwd(sc.nextLine());
				break;
			case "2": // �̸�
				System.out.println("2. �̸� > ");
				student.setName(sc.nextLine());
				break;
			case "3": // ��ȭ��ȣ
				System.out.println("3. ��ȭ��ȣ > ");
				student.setPhone(sc.nextLine());			
				break;
			case "4": // ���ŵ��
				System.out.println("4. ���ŵ�� > ");
				student.setStuLevel(sc.nextInt());sc.nextLine();			
				break;
			case "5": // ���г⵵
				System.out.println("5. ���г⵵ > ");
				student.setEntDate(sc.nextLine());			
				break;
			case "6": // ����
				System.out.println("6. ���� (1:���� 2:���� 3:���� 4:���� 5:����) > ");
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

//	����ڰ� ������ ������ �л��� ������ �����ִ� �޼ҵ� �ʿ�
	private void printStudent(StudentVO student) {
		System.out.println("������������������������������������������������������������������������������������");
		System.out.println("�й� : " + student.getStuNum());
		System.out.println("1. �н����� : " + student.getPwd());
		System.out.println("2. �̸�	: " + student.getName());
		System.out.println("3. ��ȭ��ȣ : " + student.getPhone());
		System.out.println("4. ���ŵ�� : " + student.getStuLevel());
		System.out.println("5. ���г⵵ : " + student.getEntDate());
		try {
			System.out.println("6. ����	: " + stuDAO.selectStateByNum(student.getState()));
		} catch (SQLException e) {
			System.out.println("6. ����	: - ");
		}
		System.out.println("������������������������������������������������������������������������������������");
	}
}

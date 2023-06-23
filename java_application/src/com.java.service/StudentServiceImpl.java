package com.java.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.command.StudentCommand;
import com.java.dao.StudentDAO;
import com.java.dao.StudentDAOImpl;
import com.java.dto.StudentVO;

public class StudentServiceImpl implements StudentService {

	private StudentDAO stuDAO = new StudentDAOImpl();
	
	@Override
	public List<StudentCommand> list() throws SQLException {
//		state가 숫자로 저장되어 있기 때문에 상세 내용을 보여주기 위해 ByNum 생성
//		StudentVO를 상속해 해당 부분만 잘 맞게 변경
		List<StudentCommand> stuCommandList = new ArrayList<>();
		List<StudentVO> stuList = stuDAO.selectStudentList();
		
		for (int i = 0; i < stuList.size(); i++) {
//			stuList 생성 -> 리스트에서 student에 i번째 정보 받아옴
			StudentVO student = stuList.get(i);
//			stuCommand 인스턴스 생성해 toStudentCommand 이용
			StudentCommand stuCommand = new StudentCommand();
			stuCommand.toStudentCommand(student);
//			stuCommand 정보를 stuCommandList에 넣기
			stuCommandList.add(stuCommand);
		}
		return stuCommandList;
	}

	@Override
	public StudentCommand detail(String stuNum) throws SQLException {
//		학생 상세 조회이므로 한 개의 정보만 필요 -> 반복문, 리스트 사용 X
		StudentCommand stuCommand = null;
		StudentVO student = stuDAO.selectStudentByStuNum(stuNum);
		
		if (student != null) {
			stuCommand = new StudentCommand();
			stuCommand.toStudentCommand(student);
		}
		return stuCommand;			
	}

	@Override
	public void regist(StudentVO student) throws SQLException {
		stuDAO.insertStudent(student);
	}

	@Override
	public void modify(StudentVO student) throws SQLException {
		stuDAO.updateStudent(student);
	}

	@Override
	public void remove(String stuNum) throws SQLException {
		stuDAO.deleteStudent(stuNum);
	}

}

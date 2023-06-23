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
//		state�� ���ڷ� ����Ǿ� �ֱ� ������ �� ������ �����ֱ� ���� ByNum ����
//		StudentVO�� ����� �ش� �κи� �� �°� ����
		List<StudentCommand> stuCommandList = new ArrayList<>();
		List<StudentVO> stuList = stuDAO.selectStudentList();
		
		for (int i = 0; i < stuList.size(); i++) {
//			stuList ���� -> ����Ʈ���� student�� i��° ���� �޾ƿ�
			StudentVO student = stuList.get(i);
//			stuCommand �ν��Ͻ� ������ toStudentCommand �̿�
			StudentCommand stuCommand = new StudentCommand();
			stuCommand.toStudentCommand(student);
//			stuCommand ������ stuCommandList�� �ֱ�
			stuCommandList.add(stuCommand);
		}
		return stuCommandList;
	}

	@Override
	public StudentCommand detail(String stuNum) throws SQLException {
//		�л� �� ��ȸ�̹Ƿ� �� ���� ������ �ʿ� -> �ݺ���, ����Ʈ ��� X
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

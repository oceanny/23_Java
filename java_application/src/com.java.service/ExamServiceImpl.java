package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.dao.ExamDAO;
import com.java.dao.ExamDAOImpl;
import com.java.dto.ExamVO;

public class ExamServiceImpl implements ExamService {
	
	private ExamDAO examDAO = new ExamDAOImpl();
	
	@Override
	public List<ExamVO> list() throws SQLException {
		List<ExamVO> examList = examDAO.selectExamList();
		return examList;
	}

	@Override
	public ExamVO detail(String examNum) throws SQLException {
		ExamVO exam = examDAO.selectExamByExamNum(examNum);
		return exam;
	}

	@Override
	public void regist(ExamVO exam) throws SQLException {
		examDAO.insertExam(exam);
	}

	@Override
	public void modify(ExamVO exam) throws SQLException {
		examDAO.updateExam(exam);
	}

	@Override
	public void remove(String examNum) throws SQLException {
		examDAO.deleteExam(examNum);
	}

}

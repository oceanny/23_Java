package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.ExamVO;

public interface ExamDAO {

	List<ExamVO> selectExamList() throws SQLException;

	ExamVO selectExamByExamNum(String examNum) throws SQLException;

	void insertExam(ExamVO exam) throws SQLException;

	void updateExam(ExamVO exam) throws SQLException;

	void deleteExam(String examNum) throws SQLException;

}

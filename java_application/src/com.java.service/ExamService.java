package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.ExamVO;

public interface ExamService {
//	������ü��ȸ
	List<ExamVO> list() throws SQLException;
//	�������ȸ
	ExamVO detail(String examNum) throws SQLException;
//	������
	void regist(ExamVO exam) throws SQLException;
//	�������
	void modify(ExamVO exam) throws SQLException;
//	�������
	void remove(String examNum) throws SQLException;
}

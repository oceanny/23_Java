package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.ExamVO;

public interface ExamService {
//	시험전체조회
	List<ExamVO> list() throws SQLException;
//	시험상세조회
	ExamVO detail(String examNum) throws SQLException;
//	시험등록
	void regist(ExamVO exam) throws SQLException;
//	시험수정
	void modify(ExamVO exam) throws SQLException;
//	시험삭제
	void remove(String examNum) throws SQLException;
}

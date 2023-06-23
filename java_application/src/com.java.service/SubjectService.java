package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.SubjectVO;

public interface SubjectService {
//	과목전체조회
	List<SubjectVO> list() throws SQLException;
//	과목상세조회
	SubjectVO detail(String subNum) throws SQLException;
//	과목등록
	void register(SubjectVO subject) throws SQLException;
//	과목수정
	void modify(SubjectVO subject) throws SQLException;
//	과목삭제
	void remove(String subNum) throws SQLException;
}

package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.SubjectVO;

public interface SubjectService {
//	������ü��ȸ
	List<SubjectVO> list() throws SQLException;
//	�������ȸ
	SubjectVO detail(String subNum) throws SQLException;
//	������
	void register(SubjectVO subject) throws SQLException;
//	�������
	void modify(SubjectVO subject) throws SQLException;
//	�������
	void remove(String subNum) throws SQLException;
}

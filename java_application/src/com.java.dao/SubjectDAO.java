package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.SubjectVO;

public interface SubjectDAO {

	List<SubjectVO> selectSubjectList() throws SQLException;

	SubjectVO selectSubjectBySubNum(String subNum) throws SQLException;

	void insertSubject(SubjectVO subject) throws SQLException;

	void updateSubject(SubjectVO subject) throws SQLException;

	void deleteSubject(String subNum) throws SQLException;

}

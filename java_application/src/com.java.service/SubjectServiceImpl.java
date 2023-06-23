package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.dao.SubjectDAO;
import com.java.dao.SubjectDAOImpl;
import com.java.dto.SubjectVO;

public class SubjectServiceImpl implements SubjectService {
	
	private SubjectDAO subDAO = new SubjectDAOImpl();
	
	@Override
	public List<SubjectVO> list() throws SQLException {
		List<SubjectVO> subList = subDAO.selectSubjectList();
		return subList;
	}

	@Override
	public SubjectVO detail(String subNum) throws SQLException {
		SubjectVO subject = subDAO.selectSubjectBySubNum(subNum);
		return subject;
	}

	@Override
	public void register(SubjectVO subject) throws SQLException {
		subDAO.insertSubject(subject);
	}

	@Override
	public void modify(SubjectVO subject) throws SQLException {
		subDAO.updateSubject(subject);
	}

	@Override
	public void remove(String subNum) throws SQLException {
		subDAO.deleteSubject(subNum);
	}

}

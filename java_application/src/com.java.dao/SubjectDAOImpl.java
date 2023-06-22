package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.java.dataSource.MireSqlSessionFactory;
import com.java.dto.SubjectVO;

public class SubjectDAOImpl implements SubjectDAO {
	private SqlSessionFactory factory = new MireSqlSessionFactory();

	@Override
	public List<SubjectVO> selectSubjectList() throws SQLException {
		SqlSession session = factory.openSession();
		try {
			List<SubjectVO> subjectList = session.selectList("Subject-Mapper.selectSubjectList");
			return subjectList;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public SubjectVO selectSubjectBySubNum(String subNum) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			SubjectVO subject = session.selectOne("Subject-Mapper.selectSubjectBySubNum", subNum);
			return subject;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void insertSubject(SubjectVO subject) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.insert("Subject-Mapper.insertSubject", subject);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void updateSubject(SubjectVO subject) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.update("Subject-Mapper.updateSubject", subject);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void deleteSubject(String subNum) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.delete("Subject-Mapper.deleteSubject", subNum);
		} finally {
			if (session != null)
				session.close();
		}
	}

}

package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.java.dataSource.MireSqlSessionFactory;
import com.java.dto.ExamVO;

public class ExamDAOImpl implements ExamDAO {
	private SqlSessionFactory factory = new MireSqlSessionFactory();

	@Override
	public List<ExamVO> selectExamList() throws SQLException {
		SqlSession session = factory.openSession();
		try {
			List<ExamVO> examList = session.selectList("Exam-Mapper.selectExamList");
			return examList;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public ExamVO selectExamByExamNum(String examNum) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			ExamVO exam = session.selectOne("Exam-Mapper.selectExamByExamNum", examNum);
			return exam;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void insertExam(ExamVO exam) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.insert("Exam-Mapper.insertExam", exam);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void updateExam(ExamVO exam) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.update("Exam-Mapper.updateExam", exam);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void deleteExam(String examNum) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.delete("Exam-Mapper.deleteExam", examNum);
		} finally {
			if (session != null)
				session.close();
		}
	}

}

package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.java.dataSource.MireSqlSessionFactory;
import com.java.dto.StudentVO;

public class StudentDAOImpl implements StudentDAO {
	private SqlSessionFactory factory = new MireSqlSessionFactory();

	@Override
	public List<StudentVO> selectStudentList() throws SQLException {
		SqlSession session = factory.openSession();
		try {
			List<StudentVO> studentList = session.selectList("Student-Mapper.selectStudentList");
//		session이 close해줌
			return studentList;
		} finally {
//		test 정상 진행 위해 close 부분 만들기
			if (session != null)
				session.close();
		}
	}

	@Override
	public StudentVO selectStudentByStuNum(String stuNum) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			StudentVO student = session.selectOne("Student-Mapper.selectStudentByStuNum", stuNum);
			return student;
		} finally {
			if (session != null)
				session.close();
		}

	}

	@Override
	public String selectStateByNum(int num) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			String state = session.selectOne("Student-Mapper.selectStateByNum", num);
			return state;
		} finally {
			if (session != null)
				session.close();
		}

	}

	@Override
	public void insertStudent(StudentVO student) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.insert("Student-Mapper.insertStudent", student);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void updateStudent(StudentVO student) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.update("Student-Mapper.updateStudent", student);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void deleteStudent(String stuNum) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.delete("Student-Mapper.deleteStudent", stuNum);
		} finally {
			if (session != null)
				session.close();
		}
	}

}

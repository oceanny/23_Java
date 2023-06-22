package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.java.dataSource.MireSqlSessionFactory;
import com.java.dto.StaffVO;

public class StaffDAOImpl implements StaffDAO {
	private SqlSessionFactory factory = new MireSqlSessionFactory();

	@Override
	public List<StaffVO> selectStaffList() throws SQLException {
		SqlSession session = factory.openSession();
		try {
			List<StaffVO> staffList = session.selectList("Staff-Mapper.selectStaffList");
			return staffList;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public StaffVO selectStaffByStaffNum(String staffNum) throws SQLException {
		SqlSession session = factory.openSession();
//		primary Key로 받아오므로 selectOne
		try {
			StaffVO staff = session.selectOne("Staff-Member.selectStaffByStaffNum", staffNum);
			return staff;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public String selectStateByNum(int num) throws SQLException {
		SqlSession session = factory.openSession();
		String state = session.selectOne("Staff-Member.selectStateBynum", num);
		return state;
	}

	@Override
	public String selectPositionByNum(int num) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			String position = session.selectOne("Staff-Member.selectPositionBynum", num);
			return position;
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void insertStaff(StaffVO staff) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.insert("Staff-Member.insertStaff", staff);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void updateStaff(StaffVO staff) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.update("Staff-Member.updateStaff", staff);
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void deleteStaff(String staffNum) throws SQLException {
		SqlSession session = factory.openSession();
		try {
			session.delete("Staff-Member.deleteStaff", staffNum);
		} finally {
			if (session != null)
				session.close();
		}
	}

}

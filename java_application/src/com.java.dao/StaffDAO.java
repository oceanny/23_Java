package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.StaffVO;

public interface StaffDAO {

	List<StaffVO> selectStaffList() throws SQLException;

	StaffVO selectStaffByStaffNum(String staffNum) throws SQLException;

	String selectStateByNum(int num) throws SQLException;
	String selectPositionByNum(int num) throws SQLException;
	
	void insertStaff(StaffVO staff) throws SQLException;

	void updateStaff(StaffVO staff) throws SQLException;

	void deleteStaff(String staffNum) throws SQLException;

}

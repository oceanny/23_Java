package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.command.StaffCommand;
import com.java.dto.StaffVO;

public interface StaffService {
//	������ü��ȸ
	List<StaffCommand> list() throws SQLException;
//	�������ȸ
	StaffVO detail(String staffNum) throws SQLException;
//	������
	void register(StaffVO staff) throws SQLException;
//	�������
	void modify(StaffVO staff) throws SQLException;
//	�������
	void remove(String staffNum) throws SQLException;
}

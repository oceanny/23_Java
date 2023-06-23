package com.java.service;

import java.sql.SQLException;
import java.util.List;

import com.java.command.StaffCommand;
import com.java.dto.StaffVO;

public interface StaffService {
//	교사전체조회
	List<StaffCommand> list() throws SQLException;
//	교사상세조회
	StaffVO detail(String staffNum) throws SQLException;
//	교사등록
	void register(StaffVO staff) throws SQLException;
//	교사수정
	void modify(StaffVO staff) throws SQLException;
//	교사삭제
	void remove(String staffNum) throws SQLException;
}

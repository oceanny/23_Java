package com.java.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.command.StaffCommand;
import com.java.dao.StaffDAO;
import com.java.dao.StaffDAOImpl;
import com.java.dto.StaffVO;

public class StaffServiceImpl implements StaffService {

	private StaffDAO staffDAO = new StaffDAOImpl();
	
	@Override
	public List<StaffCommand> list() throws SQLException {
		List<StaffCommand> staffCommandList = new ArrayList<>();
		List<StaffVO> staffList = staffDAO.selectStaffList();
		
		for (int i = 0; i < staffList.size(); i++) {
			StaffVO staff = staffList.get(i);
			StaffCommand staffCommand = new StaffCommand();
			staffCommand.toStaffCommand(staff);
			staffCommandList.add(staffCommand);
		}
		return staffCommandList;
	}

	@Override
	public StaffCommand detail(String staffNum) throws SQLException {
		StaffCommand staffCommand = null;
		StaffVO staff = staffDAO.selectStaffByStaffNum(staffNum);
		
		if (staff != null) {
			staffCommand = new StaffCommand();
			staffCommand.toStaffCommand(staff);
		}
		return staffCommand;
	}

	@Override
	public void register(StaffVO staff) throws SQLException {
		staffDAO.insertStaff(staff);
	}

	@Override
	public void modify(StaffVO staff) throws SQLException {
		staffDAO.updateStaff(staff);
	}

	@Override
	public void remove(String staffNum) throws SQLException {
		staffDAO.deleteStaff(staffNum);
	}
	
	
	
}

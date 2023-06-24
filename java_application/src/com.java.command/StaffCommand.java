package com.java.command;

import java.sql.SQLException;

import com.java.dao.StaffDAO;
import com.java.dao.StaffDAOImpl;
import com.java.dto.StaffVO;

public class StaffCommand extends StaffVO {
	
	private String positionStr;
	private String stateStr;
	
	public String getPositionStr() {
		return positionStr;
	}
	public void setPositionStr(String positionStr) {
		this.positionStr = positionStr;
	}
	
	public String getStateStr() {
		return stateStr;
	}
	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}
	
	public void toStaffCommand(StaffVO staff) {
		
		if (staff == null) return;
		
		super.setName(staff.getName());
		super.setPhone(staff.getPhone());
		super.setPwd(staff.getPwd());
		super.setStafNum(staff.getStaffNum());
		
		StaffDAO staffDAO = new StaffDAOImpl();
		
		try {
			setPositionStr(staffDAO.selectPositionByNum(staff.getPosition()));
		} catch (SQLException e) {
			setPositionStr("-");
			e.printStackTrace();
		}
		
		try {
			setStateStr(staffDAO.selectStateByNum(staff.getState()));
		} catch (SQLException e) {
			setStateStr("-");
			e.printStackTrace();
		}
		
	}
	
}

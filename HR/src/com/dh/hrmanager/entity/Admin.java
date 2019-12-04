package com.dh.hrmanager.entity;

import com.dh.hrmanager.util.HrHelper;

public class Admin extends Employee{
	public Admin() {
		super();
	}
	public Admin(int userId,String empNo,String userName,String password,int departId,int roleId,double salary){
		super(userId,empNo,userName,password,departId,roleId,salary);
	}
	HrHelper helper = new HrHelper();
	
	public void modifyEmployeeRole(String empNo,String role){
		helper.modifyEmployeeRole(empNo, role);
	}
}

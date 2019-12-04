package com.dh.hrmanager.entity;

import com.dh.hrmanager.util.HrHelper;

public class Manager extends Employee{
	public Manager(){
		super();
	}
	public Manager(int userId,String empNo,String userName,String password,int departId,int roleId,double salary){
		super(userId,empNo,userName,password,departId,roleId,salary);
	}
	HrHelper helper = new HrHelper();
	public void displayReports(){
		helper.displayReports();
	}
}

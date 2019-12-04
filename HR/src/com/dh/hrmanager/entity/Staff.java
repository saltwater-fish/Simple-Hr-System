package com.dh.hrmanager.entity;

import java.util.Scanner;

import com.dh.hrmanager.util.Data;
import com.dh.hrmanager.util.HrHelper;

public class Staff extends Employee{
	public Staff(){
		super();
	}
	public Staff(int userId,String empNo,String userName,String password,int departId,int roleId,double salary){
		super(userId,empNo,userName,password,departId,roleId,salary);
	}
	HrHelper helper = new HrHelper();
	public void addReport() {
		System.out.println("请输入汇报信息\n");
		Scanner input = new Scanner(System.in);
		String content = input.next();
		Report report = new Report();
		report.setReporterId(helper.getReportsCount()+ 1);
		report.setContent(content);
		report.setReporterId(Data.currentEmployee.getUserId());
		helper.addReport(report);
	}
}

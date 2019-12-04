package com.dh.hrmanager.util;


import com.dh.hrmanager.entity.Employee;
import com.dh.hrmanager.entity.Report;

public class HrHelper {
	public Employee login(String name,String password) {
		if(name.equals(Data.staff.getUserName())&&password.equals(Data.staff.getPassword())){
			Data.currentEmployee = Data.staff;
		}
		else if (name.equals(Data.manager.getUserName())&&password.equals(Data.manager.getPassword())) {
			Data.currentEmployee = Data.manager;
		}
		else if (name.equals(Data.admin.getUserName())&&password.equals(Data.admin.getPassword())) {
			Data.currentEmployee = Data.admin;
		}
		return Data.currentEmployee;
	}
	public int  getReportsCount() {
		int count = 0;
		for(Report item:Data.reports){
			if(item.getReportId()<=0)
				break;
			count++;
		}
		return count;
	}
	public Employee getEmployeeByUserId(int userId) {
		if(Data.staff.getUserId() == userId)
			return Data.staff;
		if(Data.manager.getUserId() == userId)
			return Data.manager;
		if(Data.admin.getUserId() == userId)
			return Data.admin;
		return null;
	}
	public void displayReports() {
		System.out.println("汇报如下:");
		System.out.println("************************************************************");
		for (int i = 0; i < Data.reports.length; i++) {
			if(Data.reports[i]==null)
				break;
			Employee employee=getEmployeeByUserId(Data.reports[i].getReporterId());
			if(employee != null)
				System.out.println("编号："+Data.reports[i].getReporterId()+"\t汇报人：" + employee.getUserName() + "\t汇报内容：" + Data.reports[i].getContent());
		}
	}
	public void addReport(Report report) {
		int count = getReportsCount();
		if (count>=Data.reports.length) {
			System.out.println("汇报日志已满");
			return;
		}
		else{
			Data.reports[count] = report;
			System.out.println("汇报成功！");
		}
	}
	public void modifyEmployeeRole(String empNo,String roleName) {
		int roleId = 0;
		switch(roleName){
		case "Staff":
			roleId = 1;
			break;
		case "Manager":
			roleId = 2;
			break;
		case "Admin":
			roleId = 3;
			break;
		default:
			System.out.println("输入角色的名称不存在！");
			break;
		}
		if(empNo.equals(Data.staff.getEmpNo())){
			Data.staff.setRoleId(roleId);
		}
		else if (empNo.equals(Data.manager.getEmpNo())) {
			Data.manager.setRoleId(roleId);
		}
		else if (empNo.equals(Data.admin.getEmpNo())) {
			Data.admin.setRoleId(roleId);
		}
		else {
			System.out.println("不存在此员工！");
		}
	}
}

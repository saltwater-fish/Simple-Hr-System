package com.dh.hrmanager.util;

import com.dh.hrmanager.entity.Admin;
import com.dh.hrmanager.entity.Employee;
import com.dh.hrmanager.entity.Manager;
import com.dh.hrmanager.entity.Report;
import com.dh.hrmanager.entity.Staff;

public class Data {
	public static Employee currentEmployee;
	public static Staff staff = new Staff(1,"DH001","Staff","Staff",2,1,3000.5);
	public static Manager manager = new Manager(2, "DH002", "Manager", "Manager", 2, 2, 5000.5);
	public static Admin admin= new Admin(3, "DH003", "Admin", "Admin", 2, 3, 4000.5);
	public static Report[] reports = new Report[1000];
	public static void init(){
		for(int i = 0;i<reports.length;i++)
			reports[i]=new Report();
	}
}

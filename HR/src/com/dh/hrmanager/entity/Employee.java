package com.dh.hrmanager.entity;


public class Employee {
	private int userId;
	private String userName;
	private String password;
	private int roleId;
	private String empNo;
	private int departId;
	private double salary;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	public Employee(int userId, String empNo, String userName, String password,int departId, int roleId, double salary)
	{
		this.userId = userId;
		this.empNo = empNo;
		this.userName = userName;
		this.password = password;
		this.departId = departId;
		this.roleId = roleId;
		this.salary = salary;
	}
	
	public void displayInfo(){
		String position = null;
		if (roleId == 1) {
			position = "Staff";
		}
		if (roleId == 2) {
			position = "Manager";
		}
		if (roleId == 3) {
			position = "Admin";
		}
		
		String department = null;
		
		if (departId == 1) {
			department = "�г���";
		}
		if (departId == 2) {
			department = "������";
		}
		if (departId == 3) {
			department = "��Ϣ��";
		}
		System.out.println("\t\t��ǰ�û���Ϣ\n\n");
		System.out.println("**********************************************************");
		System.out.println("\t\t��Ա��ţ�" + empNo);
		System.out.println("\t\t������" + userName);
		System.out.println("\t\tְ��" + position);
		System.out.println("\t\t���ţ�" + department);
		System.out.println("\t\tнˮ��" + String.valueOf(salary));
		System.out.println("**********************************************************");
	}
	
	public void modifyPassword(String newPassword) {
		this.password = newPassword;
		System.out.println("�����޸ĳɹ�");

	}
}
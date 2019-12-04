package com.dh.hrmanager.util;

import java.util.Scanner;

public class Menu {
	/**
	 * ���ص�¼�˵�
	 */
	public void showLoginMenu() {
		System.out.println("\n\n\t\t��ӭ������ҵ������Դ����ϵͳ\n\n");
		System.out.println("**********************************************************\n");
		System.out.println("\t\t\t1����½ϵͳ\n");
		System.out.println("\t\t\t2��ע��ϵͳ\n");
		System.out.println("\t\t\t3���˳�ϵͳ\n");
		System.out.println("**********************************************************\n");
		System.out.println("������˵�ѡ�����֣�");
	}
	Scanner input = new Scanner(System.in);
	
	private void returnLoginMenu(Scanner input) {
		boolean flag = true;
		do{
			String num = input.next();
			if(num.toUpperCase().equals("R")){
				flag = false;
				showLoginMenu();
				break;
			}
			else{
				System.out.println("���幦�ܽ��ں���ʵ��ƪʵ�֣�����������r/R���ص�½�˵���");
			}
		}while(flag);
	}
	/**
	 * ��ͨԱ���˵�
	 */
	public void showStaffMenu(){
		System.out.println("������Դ����ϵͳ=>��ͨԱ��");
		System.out.println("**********************************************************\n");
		System.out.println("\t\t\t1���㱨����\n");
		System.out.println("\t\t\t2���鿴������Ϣ\n");
		System.out.println("\t\t\t3���޸�����\n");
		System.out.println("\t\t\t4���鿴����\n");
		System.out.println("\t\t\t5�����ʷ���\n");
		System.out.println("\t\t\t6�����չ���\n");
		System.out.println("\t\t\t7�����߹�������\n");
		System.out.println("**********************************************************\n");
		System.out.println("������˵������ֻ�������r/R������һ�˵���");
		boolean flag = true;
		do {
			String num = input.next();
			switch(num){
			case"1":
				//�㱨��������
				Data.staff.addReport();
				//������ʾ��ͨԱ���˵�
				showStaffMenu();
				flag = false;
				break;
			case"2":
				//��ʾ������Ϣ����
				Data.staff.displayInfo();
				showStaffMenu();
				flag = false;
				break;
			case"3":
				//�޸ĸ����������
				System.out.println("�������������룺");
				String newPassword = input.next();
				Data.staff.modifyPassword(newPassword);
				showStaffMenu();
				flag = false;
				break;
			case"4":
				//�鿴�����ɼ�
				break;
			case"5":
				//�鿴���ʷ���
				break;
			case"6":
				//�鿴���չ���
				break;
			case"7":
				//���߹�������
				break;
			case"r":	
			case"R":
				flag = false;
				showLoginMenu();
				break;
			default:
				System.out.println("��������������������֣�");
			}
		} while (flag);
		returnLoginMenu(input);
	}
	/**
	 * �������˵�
	 */
	public void showManangerMenu(){
		System.out.println("������Դ����ϵͳ=>���ž���");
	System.out.println("**********************************************************\n");
		System.out.println("\t\t\t1���鿴�����㱨\n");
		System.out.println("\t\t\t2������Ա��\n");
		System.out.println("\t\t\t3���鿴������Ϣ\n");
		System.out.println("\t\t\t4���޸�����\n");
		System.out.println("\t\t\t5�����ʷ���\n");
		System.out.println("\t\t\t6�����չ���\n");
		System.out.println("\t\t\t7�����߹�������\n");
		System.out.println("������˵������ֻ�����������R/r������һ�˵���");
		boolean flag = true;
		do {
			String num = input.next();
			switch(num){
			case"1":
				//�鿴�㱨��������
				Data.manager.displayReports();
				//������ʾ����˵�
				showManangerMenu();
				flag = false;
				break;
			case"2":
				//����Ա��
				break;
			case"3":
				//�鿴������Ϣ
				Data.manager.displayInfo();
				showManangerMenu();
				flag = false;
				break;
			case"4":
				//�޸ĸ����������
				System.out.println("�����������룺");
				String newPassword = input.next();
				Data.manager.modifyPassword(newPassword);
				showManangerMenu();
				flag = false;
				break;
			case"5":
				//�鿴���ʷ���
				break;
			case"6":
				//�鿴���չ���
				break;
			case"7":
				//���߹�������
				break;
			case"r":
			case"R":
				flag = false ;
				showLoginMenu();
				break;
			default:
				System.out.println("��������������������֣�");
			}
		} while (flag);
		returnLoginMenu(input);
	}
	/**
	 * ��ʾ����Ա���˵�
	 */
	public void showAdminMenu(){
		System.out.println("������Դ����ϵͳ=>����Ա");
		System.out.println("**********************************************************\n");
		System.out.println("\t\t\t1���鿴�����㱨\n");
		System.out.println("\t\t\t2������Ա��\n");
		System.out.println("\t\t\t3���鿴������Ϣ\n");
		System.out.println("\t\t\t4���޸�����\n");
		System.out.println("\t\t\t5�����ʷ���\n");
		System.out.println("\t\t\t6�����չ���\n");
	System.out.println("**********************************************************\n");
		System.out.println("������˵������ֻ�����������R/r������һ�˵���");
		boolean flag = true;
		do {
			String num = input.next();
			switch(num){
			case"1":
				//�鿴Ա����Ϣ
				showAdminMenu();
				flag = false;
				break;
			case"2":
				//�޸�Ա����ɫ
				System.out.println("������Ա����ţ�");
				String empNo = input.next();
				System.out.println("������Ա����ɫ����ɫֻ����Staff,Mananger,Admin");
				String role = input.next();
				Data.admin.modifyEmployeeRole(empNo, role);
				showAdminMenu();
				flag = false;
				break;
			case"3":
				//�鿴������Ϣ
				Data.admin.displayInfo();
				showAdminMenu();
				flag = false;
				break;
			case"4":
				//�޸ĸ����������
				System.out.println("�����������룺");
				String newPassword = input.next();
				Data.admin.modifyPassword(newPassword);
				showAdminMenu();
				flag = false;
				break;
			case"5":
				//�鿴���ʷ���
				break;
			case"6":	
				//�鿴���չ���
				break;
			case"7":
				//���߹�������
				break;
			case"r":
			case"R":
				flag = false;
				showLoginMenu();
				break;
			default:
				System.out.println("�������룬�������������֣�");
			}
		} while (flag);
		returnLoginMenu(input);
	}
}
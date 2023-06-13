package com.java.main;

import java.util.Scanner;

import com.java.dto.TechWebStudent;
import com.java.dto.WebStudent;
import com.java.session.Session;

public class Main_Session {
	
	public static void main(String[] args) {
		// �л�����(�й�, �̸�, �г�, �а�, �������, �ּ�, ����ó,����)

		WebStudent[] students; 
		final int STUDENT_NUM;

		Scanner scann = new Scanner(System.in);

		System.out.print("�л� ��>");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
		students = new WebStudent[STUDENT_NUM];
		for(int i=0;i<STUDENT_NUM;i++) {
			students[i]=new TechWebStudent();
		}
		
		String menu;

		do {
			
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������");
			if(Session.getSession().getStudent()==null) {
				System.out.println("��     1.�л����  ��  2.�л���ȸ  ��  3.�л�����  ��  4.�л�����  �� 5.�α���    ��");
			}else {
				System.out.println("��     1.�л����  ��  2.�л���ȸ  ��  3.�л�����  ��  4.�л�����  �� 5.�α׾ƿ�  ��");
			}
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������");
			System.out.print("�޴� (����:q)>");
			menu = scann.nextLine();

			switch (menu) {
			case "1": //�л����
				System.out.println("\n\n");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������");
				System.out.println("��  1.�л����                                               ��");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������");
				// �й�, �̸�, �г�, �а�, �������, �ּ�, ����ó,����
				for(int i=0;i<STUDENT_NUM;i++) {
					System.out.println("["+(i+1)+"��° �л� ���� �Է�]");
					
					System.out.print("���̵� >");
					students[i].setId(scann.nextLine());
					
					System.out.print("�н����� >");
					students[i].setPwd(scann.nextLine());
					
					System.out.print("�й� ex)2305889001 >");
					students[i].studentNum = scann.nextLine();
				
					System.out.print("�̸� ex)ȫ�浿 >");
					students[i].name = scann.nextLine();
					
					System.out.print("�г� >");
					students[i].grade = scann.nextInt();scann.nextLine();

					System.out.print("�а� ex)������Ű��� >");
					students[i].major = scann.nextLine();

					System.out.print("������� ex)2023-05-26 >");
					students[i].birth = scann.nextLine();

					System.out.print("�ּ� (��/�� ��/�� ��/��) >");
					students[i].address = scann.nextLine();

					System.out.print("����ó ex)010-1234-5678 >");
					students[i].contact = scann.nextLine();

					System.out.print("���� ex)����/����/����/���� >");
					students[i].state = scann.nextLine();
					
					System.out.println("\n\n\n");
					System.out.println("�л���� ��� ȭ��");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.printf("  01.���̵�     : %s\n", students[i].getId());
					System.out.printf("  02.�н�����     : %s\n", students[i].getPwd());
					System.out.printf("  03.�й�     : %s\n", students[i].studentNum);
					System.out.printf("  04.�̸�     : %s\n", students[i].name);
					System.out.printf("  05.�г�     : %d\n", students[i].grade);
					System.out.printf("  06.�а�     : %s\n", students[i].major);
					System.out.printf("  07.������� : %s\n", students[i].birth);
					System.out.printf("  08.�ּ�     : %s\n", students[i].address);
					System.out.printf("  09.����ó   : %s\n", students[i].contact);
					System.out.printf("  10.����     : %s\n", students[i].state);
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.print("�ƹ�Ű�� ��������.");
					scann.nextLine();
				}
				break;
			case "2": //�л���ȸ
				
				boolean flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i]!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("�Էµ� �л������� �����ϴ�.\n\n\n");
						break;
					}
					
					System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t����");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,
								students[i].grade,students[i].major,students[i].state);
					}
					System.out.print("�󼼺��� ��ȣ (������:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q":case "Q":
						flag=false;
						continue;
					}
					
					int index = Integer.parseInt(num);
					
					System.out.println("\n\n\n");
					System.out.println("�л���ȸ ��� ȭ��");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.printf("  1.�й�     : %s\n", students[index-1].studentNum);
					System.out.printf("  2.�̸�     : %s\n", students[index-1].name);
					System.out.printf("  3.�г�     : %d\n", students[index-1].grade);
					System.out.printf("  4.�а�     : %s\n", students[index-1].major);
					System.out.printf("  5.������� : %s\n", students[index-1].birth);
					System.out.printf("  6.�ּ�     : %s\n", students[index-1].address);
					System.out.printf("  7.����ó   : %s\n", students[index-1].contact);
					System.out.printf("  8.����     : %s\n", students[index-1].state);
					System.out.println("��������������������������������������������������������������������������������������������������������������������������");
					System.out.print("�ƹ�Ű�� ��������.");
					scann.nextLine();
					System.out.println("\n\n\n\n");
				}
				break;
			case "3": //�л�����

				flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("�Էµ� �л������� �����ϴ�.\n\n\n");
						break;
					}
					
					System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t����");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,
									  students[i].major,students[i].state);
					}
					System.out.print("�����л� ��ȣ (������:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q":case "Q":
						flag=false;
						continue;
					}
					
					boolean flag2=true;
					
					int index=Integer.parseInt(num)-1;
					
					do {
						System.out.println("\n\n\n");
						System.out.println("��������������������������������������������������������������������������������������������������������������������������");
						System.out.printf("  1.�й�     : %s\n", students[index].studentNum);
						System.out.printf("  2.�̸�     : %s\n", students[index].name);
						System.out.printf("  3.�г�     : %d\n", students[index].grade);
						System.out.printf("  4.�а�     : %s\n", students[index].major);
						System.out.printf("  5.������� : %s\n", students[index].birth);
						System.out.printf("  6.�ּ�     : %s\n", students[index].address);
						System.out.printf("  7.����ó   : %s\n", students[index].contact);
						System.out.printf("  8.����     : %s\n", students[index].state);
						System.out.println("��������������������������������������������������������������������������������������������������������������������������");
						System.out.print("���� �׸� ���� (������:q)>");
						menu = scann.nextLine();
						switch (menu) {
						case "1": //�й�
							System.out.print("�й�>");
							students[index].studentNum = scann.nextLine();
							break;
						case "2": //�̸�
							System.out.print("�̸�>");
							students[index].name = scann.nextLine();
							break;
						case "3": //�г�
							System.out.print("�г�>");
							students[index].grade = scann.nextInt();scann.nextLine();
							break;
						case "4": //�а�
							System.out.print("�а�>");
							students[index].major= scann.nextLine();
							break;
						case "5": //�������
							System.out.print("�������>");
							students[index].birth = scann.nextLine();
							break;
						case "6": //�ּ�
							System.out.print("�ּ�>");
							students[index].address = scann.nextLine();
							break;
						case "7": //����ó
							System.out.print("����ó>");
							students[index].contact = scann.nextLine();
							break;
						case "8": //����
							System.out.print("����>");
							students[index].state = scann.nextLine();
							break;
						case "q":
						case "Q":
							System.out.println("�л������� �����մϴ�.");
							flag2=false;
							continue;
						default:
						}
					}while(flag2);
				}
				break;
			case "4": //�л�����
				flag=true;
				while(flag) {
				
					boolean hasData = false;
					for(int i=0;i<STUDENT_NUM;i++) {
						hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
					}
					
					if (!hasData) {
						System.out.println("�Էµ� �л������� �����ϴ�.\n\n\n");
						break;
					}
					
					System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t����");
					for(int i=0;i<STUDENT_NUM;i++) {
						System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n",
								(i+1),students[i].studentNum,students[i].name,students[i].grade,
									  students[i].major,students[i].state);
					}
					System.out.print("�����л� ��ȣ (������:q)>");
					String num = scann.nextLine();
					
					switch(num) {
					case "q":case "Q":
						flag=false;
						continue;
					}
					
					int index = Integer.parseInt(num)-1;
					
					students[index].studentNum = "";
					students[index].name="";
					students[index].grade = 0;
					students[index].major = "";
					students[index].birth = "";
					students[index].address = "";
					students[index].contact = "";
					students[index].state = "";
					
					System.out.printf("\n%d�� �л��� �����߽��ϴ�.\n\n",(index+1));
					System.out.print("�ƹ�Ű�� ��������.");
					scann.nextLine();
				}
				break;
			case "5":
				boolean hasData = false;
				for(int i=0;i<STUDENT_NUM;i++) {
					hasData = hasData || (students[i].studentNum!=null && students[i].studentNum.length()>0);
				}
				
				if (!hasData) {
					System.out.println("�Էµ� �л������� �����ϴ�.\n\n\n");
					break;
				}
				
				if(Session.getSession().getStudent()!=null) {  // �α׾ƿ�
					Session.getSession().setStudent(null);
					break;
				}
				String id=null;
				String pwd=null;
				System.out.print("���̵� > ");
				id = scann.nextLine();
				System.out.print("�н����� > ");
				pwd = scann.nextLine();
				
				for(int i=0;i<STUDENT_NUM;i++) {
					if(students[i].login(id, pwd)) {
						Session.getSession().setStudent(students[i]);
						i=STUDENT_NUM;
						continue;
					}
				}
				
				
				break;
			case "q":case "Q": //����
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
			}

		} while (true);
	}

	
}

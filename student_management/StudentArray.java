package com.java.array;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] studentNum;
		String[] name;
		int[] grade;
		String[] major;
		String[] birth;
		String[] address;
		String[] contact;
		String[] state;
		String menu;
		final int STUDENT_NUM;
		System.out.print("�л� �� >");
		STUDENT_NUM = sc.nextInt();
		sc.nextLine();
		studentNum = new String[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		grade = new int[STUDENT_NUM];
		major = new String[STUDENT_NUM];
		birth = new String[STUDENT_NUM];
		address = new String[STUDENT_NUM];
		contact = new String[STUDENT_NUM];
		state = new String[STUDENT_NUM];

//		for (int i = 0; i < STUDENT_NUM; i++) {
//			;
//		}

		do {
			System.out.println("����������������������������������������������������������������������������������������������������������������������������������");
			System.out.println("����1. �л���ϡ�����2. �л���ȸ������3. �л�����������4. �л���������");
			System.out.println("����������������������������������������������������������������������������������������������������������������������������������");
			System.out.print("�޴� (���� : q)>");
			menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.println("\n\n");
				System.out.println("����������������������������������������������������������������������������������������������������������������������������������");
				System.out.println("����1. �л���ϡ���������������������������������������������������");
				System.out.println("����������������������������������������������������������������������������������������������������������������������������������");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.println(i + 1 + "��° �л� ���� �Է���");
					System.out.print("�й� ex)2305889001 >");
					studentNum[i] = sc.nextLine();
					System.out.print("�̸� ex)ȫ�浿 >");
					name[i] = sc.nextLine();
					System.out.print("�г� ex)1 >");
					grade[i] = sc.nextInt();
					sc.nextLine();
					System.out.print("�а� ex)������Ű��� >");
					major[i] = sc.nextLine();
					System.out.print("������� ex)2023-05-26 >");
					birth[i] = sc.nextLine();
					System.out.print("�ּ� (��/�� ��/�� ��/��) ex)����� ����� ������ >");
					address[i] = sc.nextLine();
					System.out.print("����ó ex)010-0000-0000 >");
					contact[i] = sc.nextLine();
					System.out.print("���� ex)����/����/����/���� >");
					state[i] = sc.nextLine();
					// ���
					System.out.println("\n");
					System.out.println("�л���� ��� ȭ��");
					System.out.println("����������������������������������������������������������������������������");
					System.out.printf("��1. �й� : %s\n", studentNum[i]);
					System.out.printf("��2. �̸� : %s\n", name[i]);
					System.out.printf("��3. �г� : %d�г�\n", grade[i]);
					System.out.printf("��4. �а� : %s\n", major[i]);
					System.out.printf("��5. ������� : %s\n", birth[i]);
					System.out.printf("��6. �ּ� : %s\n", address[i]);
					System.out.printf("��7. ����ó : %s\n", contact[i]);
					System.out.printf("��8. ���� : %s\n", state[i]);
					System.out.println("����������������������������������������������������������������������������");
				}
				break;

			case "2":
				boolean flag = true;

				boolean hasData = false;
				for (int i = 0; i < STUDENT_NUM; i++) {
					hasData = hasData || studentNum[i] != null && studentNum[i].length() > 0;
				}
				if (!hasData) {
					System.out.println("\n\n");
					System.out.println("�Էµ� �л������� �����ϴ�.");
					System.out.println("\n\n");
					break;
				}
				
				System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t����");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", i + 1, studentNum[i], name[i], grade[i], major[i],
							state[i]);
				}
				while (flag) {
					System.out.println("�󼼺��� ��ȣ (������ : q)");
					String num = sc.nextLine();
					
//					if (num == "q" || num == "Q")  nextLine���� �޾Ƽ� \n���� ������ �Ǿ ��ȣ ���� ������ ����
					switch (num) {
					case "q": case "Q":
						flag = false;
						continue;
					}

					// String�� int�� ����ȯ�ϴ� �޼ҵ�
					int index = Integer.parseInt(num) - 1;
					System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t�������\t�ּ�\t����ó\t����");
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\t\t%s\t%s\t%s\n", index + 1, studentNum[index], name[index], grade[index], major[index], birth[index], address[index], contact[index], state[index]);
				}
				break;

			case "3":
				flag = true;

				hasData = false;
				for (int i = 0; i < STUDENT_NUM; i++) {
					hasData = hasData || studentNum[i] != null && studentNum[i].length() > 0;
				}
				if (!hasData) {
					System.out.println("\n\n");
					System.out.println("�Էµ� �л������� �����ϴ�.");
					System.out.println("\n\n");
					break;
				}

				System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t����");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", i + 1, studentNum[i], name[i], grade[i], major[i],
							state[i]);
				}
				while (flag) {
					System.out.println("������ ���� ���� (������ : q)");
					String num = sc.nextLine();
					switch (num) {
					case "q": case "Q":
						System.out.println("\n\n");
						System.out.println("�л������� �����մϴ�.");
						System.out.println("\n\n");
						flag = false;
						continue; //return���� �ϸ� �ȵǳ�?
					}
					
					boolean flag2 = true;
					int index = Integer.parseInt(num) - 1;
					do {
						System.out.println("\n\n");
						System.out.println("��ϵ� �л�����");
						System.out.println("����������������������������������������������������������������������������");
						System.out.printf("��1. �й� : %s\n", studentNum[index]);
						System.out.printf("��2. �̸� : %s\n", name[index]);
						System.out.printf("��3. �г� : %d�г�\n", grade[index]);
						System.out.printf("��4. �а� : %s\n", major[index]);
						System.out.printf("��5. ������� : %s\n", birth[index]);
						System.out.printf("��6. �ּ� : %s\n", address[index]);
						System.out.printf("��7. ����ó : %s\n", contact[index]);
						System.out.printf("��8. ���� : %s\n", state[index]);
						System.out.println("����������������������������������������������������������������������������");
						System.out.print("���� �׸� ���� (������ : q)>");
						menu = sc.nextLine();
						
						switch(menu) {
						case "1": //�й�
							System.out.print("�й� ex)2305889001 >");
							studentNum[index] = sc.nextLine();
							break;
						case "2": //�̸�
							System.out.print("�̸� ex)ȫ�浿 >");
							name[index] = sc.nextLine();
							break;
						case "3": //�г�
							System.out.print("�г� ex)1 >");
							grade[index] = sc.nextInt();sc.nextLine();
							break;
						case "4": //�а�
							System.out.print("�а� ex)������Ű��� >");
							major[index] = sc.nextLine();
							break;
						case "5": //�������
							System.out.print("������� ex)2023-05-26 >");
							birth[index] = sc.nextLine();
							break;
						case "6": //�ּ�
							System.out.print("�ּ� (��/�� ��/�� ��/��) ex)����� ����� ������ >");
							address[index] = sc.nextLine();
							break;
						case "7": //����ó
							System.out.print("����ó ex)010-0000-0000 >");
							contact[index] = sc.nextLine();
							break;
						case "8": //����
							System.out.print("���� ex)����/����/����/���� >");
							state[index] = sc.nextLine();
							break;
						case "q": case"Q":
							System.out.println("\n\n");
							System.out.printf("%d�� �л������� �����մϴ�.", index + 1);
							System.out.println("\n\n");
							flag2 = false;
							continue;
						default:
							break;
						}
					}while(flag2);
				}
				break;
				
			case "4":
				flag = true;

				hasData = false;
				for (int i = 0; i < STUDENT_NUM; i++) {
					hasData = hasData || studentNum[i] != null && studentNum[i].length() > 0;
				}
				if (!hasData) {
					System.out.println("\n\n");
					System.out.println("�Էµ� �л������� �����ϴ�.");
					System.out.println("\n\n");
					break;
				}
				
				System.out.println("����\t�й�\t�̸�\t�г�\t�а�\t����");
				for (int i = 0; i < STUDENT_NUM; i++) {
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", i + 1, studentNum[i], name[i], grade[i], major[i],
							state[i]);
				}
				while (flag) {
					System.out.println("������ �л� ���� (������ : q)");
					String num = sc.nextLine();
					
					switch (num) {
					case "q": case "Q":
						flag = false;
						continue;
					}
					
					int index = Integer.parseInt(num) - 1;
					studentNum[index] = "";
					name[index] = "";
					grade[index] = 0;
					major[index] = "";
					birth[index] = "";
					address[index] = "";
					contact[index] = "";
					state[index] = "";
					
					System.out.printf("%d�� �л������� �����߽��ϴ�.\n", index + 1);
				}
				
				break;
				
			case "q": case "Q":
				break;
				
			default:
			}
			
			System.out.print("�̾ �����Ϸ��� �ƹ�Ű�� ��������.");
			sc.nextLine();
			System.out.println("\n\n");
			
		} while (true);
	}
}
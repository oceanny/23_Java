package com.java.quiz;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		char a = 'n'; //yes or no
		int num = 0; //�Է� �޴� ��
		
		System.out.print("******** ���ٿ� ���� ********\n\n");
		
		while(a == 'n') {
			
			int random = (int)(Math.random() * 100 + 1);
			int min = 1;
			int max = 100;
			int i = 1;
			
			System.out.print("��ǻ�ʹ� ���ڸ� �����߽��ϴ�.\n�����ϰڽ��ϴ�.\n\n");
			while(num != random) {
				System.out.printf("%d���� %d������ ���ڸ� �Է��ϼ���.\n\n", min, max);
				num = sc.nextInt();
				
				if ((num > max) || (num < min)) {System.out.printf("�Է��� �ùٸ��� �ʽ��ϴ�.\n");}
				else if (num > random) {
					max = num - 1;
					System.out.printf("�ٿ�!!!\n");
					}
				else if (num < random) {
					min = num + 1;
					System.out.printf("��!!!\n");
					}
				else {
					System.out.printf("�����մϴ�. �����Դϴ�.\n%d��° ������ϴ�.\n\n\n������ �����Ͻðڽ��ϱ�? (y/n)\n", i);
					a = sc.next().charAt(0);
					break;
					}
				i++;
				}
			
			while((a != 'y') || (a != 'n')) {
				if (a == 'y') {
					System.out.printf("%c\n������ �����մϴ�.\n", a);
					break;
					}
				else if (a != 'n') {
					System.out.printf("�޴������� �߸� �Ǿ����ϴ�\n\n������ �����Ͻðڽ��ϱ�? (y/n)");
					a = sc.next().charAt(0);
					}
				else {
					System.out.printf("%c\n������ ��� �����մϴ�.\n\n\n", a);
					break;
					}
				}
			}
	}
}

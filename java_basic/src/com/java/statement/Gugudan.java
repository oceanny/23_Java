package com.java.statement;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		/*for(int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "��");
			
			for(int gop = 1; gop < 10; gop++) {
				System.out.printf("%d * %d = %d\n", dan, gop, dan * gop);
			}
		}*/
		
		/*for(int dan = 2; dan < 10; dan++) {
			System.out.print(dan + "��\t\t");
		}
		
		System.out.print("\n");
		
		for(int gop = 1; gop < 10; gop++) {
			
			for(int dan = 2; dan < 10; dan++) {
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
			}
			
			System.out.print("\n");
		}*/
		
		//�Է� ó�� ��¿� ���� �ܰ躰 �ڵ� + �ܼ��� ������ �Է¹޴� �ڵ�
		
		Scanner sc = new Scanner(System.in);
		
		int dan = 2;
		int gop = 1;
		String output = "";
		
		System.out.println("�ܼ��� �Է��ϼ���.");
		int ddan = sc.nextInt();
		System.out.println("������ �Է��ϼ���.");
		int ggop = sc.nextInt();
		
		for(; dan < ddan + 1; dan++) {
			
			output = output + dan + "��\n";
			
			for(gop = 1; gop < ggop + 1; gop++) {
				
				output = output + dan + "*" + gop + "=" + dan * gop + "\n";
				
			}
			
			output = output + "\n";
			
		}
		
		System.out.print(output);
		
	}

}

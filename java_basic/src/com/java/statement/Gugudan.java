package com.java.statement;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		/*for(int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단");
			
			for(int gop = 1; gop < 10; gop++) {
				System.out.printf("%d * %d = %d\n", dan, gop, dan * gop);
			}
		}*/
		
		/*for(int dan = 2; dan < 10; dan++) {
			System.out.print(dan + "단\t\t");
		}
		
		System.out.print("\n");
		
		for(int gop = 1; gop < 10; gop++) {
			
			for(int dan = 2; dan < 10; dan++) {
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
			}
			
			System.out.print("\n");
		}*/
		
		//입력 처리 출력에 따른 단계별 코딩 + 단수와 곱수를 입력받는 코딩
		
		Scanner sc = new Scanner(System.in);
		
		int dan = 2;
		int gop = 1;
		String output = "";
		
		System.out.println("단수를 입력하세요.");
		int ddan = sc.nextInt();
		System.out.println("곱수를 입력하세요.");
		int ggop = sc.nextInt();
		
		for(; dan < ddan + 1; dan++) {
			
			output = output + dan + "단\n";
			
			for(gop = 1; gop < ggop + 1; gop++) {
				
				output = output + dan + "*" + gop + "=" + dan * gop + "\n";
				
			}
			
			output = output + "\n";
			
		}
		
		System.out.print(output);
		
	}

}

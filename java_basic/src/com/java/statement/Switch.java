package com.java.statement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 5) {
			System.out.println("============================================================");
			System.out.println("1. 회원조회\t2. 회원등록\t3. 회원수정\t4. 회원삭제");
			System.out.println("============================================================");
			System.out.print("메뉴를 입력하세요.");
			
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("회원조회를 시작합니다.");
				break;
			case 2:
				System.out.println("회원등록을 시작합니다.");
				break;
			case 3:
				System.out.println("회원수정을 시작합니다.");
				break;
			case 4:
				System.out.println("회원삭제를 시작합니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴선택이 올바르지 않습니다.");
			}
			
			sc.close();
			
		}
		
	}

}

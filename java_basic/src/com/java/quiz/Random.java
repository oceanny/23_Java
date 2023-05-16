package com.java.quiz;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		char a = 'n'; //yes or no
		int num = 0; //입력 받는 수
		
		System.out.print("******** 업다운 게임 ********\n\n");
		
		while(a == 'n') {
			
			int random = (int)(Math.random() * 100 + 1);
			int min = 1;
			int max = 100;
			int i = 1;
			
			System.out.print("컴퓨터는 숫자를 결정했습니다.\n시작하겠습니다.\n\n");
			while(num != random) {
				System.out.printf("%d부터 %d사이의 숫자를 입력하세요.\n\n", min, max);
				num = sc.nextInt();
				
				if ((num > max) || (num < min)) {System.out.printf("입력이 올바르지 않습니다.\n");}
				else if (num > random) {
					max = num - 1;
					System.out.printf("다운!!!\n");
					}
				else if (num < random) {
					min = num + 1;
					System.out.printf("업!!!\n");
					}
				else {
					System.out.printf("축하합니다. 정답입니다.\n%d번째 맞췄습니다.\n\n\n게임을 종료하시겠습니까? (y/n)\n", i);
					a = sc.next().charAt(0);
					break;
					}
				i++;
				}
			
			while((a != 'y') || (a != 'n')) {
				if (a == 'y') {
					System.out.printf("%c\n게임을 종료합니다.\n", a);
					break;
					}
				else if (a != 'n') {
					System.out.printf("메뉴선택이 잘못 되었습니다\n\n게임을 종료하시겠습니까? (y/n)");
					a = sc.next().charAt(0);
					}
				else {
					System.out.printf("%c\n게임을 계속 진행합니다.\n\n\n", a);
					break;
					}
				}
			}
	}
}

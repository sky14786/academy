package com.kh.controller;

import java.util.Scanner;

public class SwitchController {
	public void switchTest() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===당신의 취미는===");
		System.out.print("취미를 고르세요(1.코딩,2.독서,3.게임,4.유튜브) : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: System.out.println("거짓말!");
			break;
		case 2: System.out.println("인기서적 순위....");
			break;
		case 3:System.out.println("인기게임 순위....");
			break;
		case 4:System.out.println("인기동영상....");
			break;
		default:System.out.println("잘못입력하셨습니다.");
			break;
		}
	}
}

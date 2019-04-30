package com.kh.controller;

import java.util.Scanner;

public class SwitchController {
	public void switchTest() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===당신의 취미는===");
		System.out.print("취미를 고르세요(1.코딩,2.독서,3.게임,4.유튜브) : ");
//		int choice = sc.nextInt();
//		char choice  = sc.next().charAt(0);
		String choice = sc.nextLine();
		
//		switch (choice) {
//		case 1: System.out.println("거짓말!");
//			break;
//		case 2: System.out.println("인기서적 순위....");
//			break;
//		case 3:System.out.println("인기게임 순위....");
//			break;
//		case 4:System.out.println("인기동영상....");
//			break;
//		default:System.out.println("잘못입력하셨습니다.");
//			break;
		
//		switch (choice) {
//		case '가': System.out.println("거짓말!");
//			break;
//		case '나': System.out.println("인기서적 순위....");
//			break;
//		case '다':System.out.println("인기게임 순위....");
//			break;
//		case '라':System.out.println("인기동영상....");
//			break;
//		default:System.out.println("잘못입력하셨습니다.");
//			break;
//		}
		
		switch (choice) {
		case "코딩": System.out.println("거짓말!");
			break;
		case "독서": System.out.println("인기서적 순위....");
			break;
		case "게임":System.out.println("인기게임 순위....");
			break;
		case "유튜브":System.out.println("인기동영상....");
			break;
		default:System.out.println("잘못입력하셨습니다.");
			break;
		}
	}
}

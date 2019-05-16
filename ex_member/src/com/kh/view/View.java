package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;

public class View {
	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void menu() {
		while (true) {
			System.out.println("1. 멤버 생성");
			System.out.println("2. 멤버 수정");
			System.out.print("메뉴 입력 : ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				create();
				break;
			case 2:
				System.out.println("공사");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

	public void create() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("주소 : ");
		String address = sc.next();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		sc.nextLine();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("키 : ");
		double height = sc.nextDouble();

		mc.createMember(name, address, email, age, weight, height);
	}
}

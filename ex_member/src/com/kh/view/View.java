package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;

public class View {
	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void menu() {
		while (true) {
			System.out.println("1. ��� ����");
			System.out.println("2. ��� ����");
			System.out.print("�޴� �Է� : ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				create();
				break;
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}

	public void create() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("�ּ� : ");
		String address = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.nextLine();
		sc.nextLine();
		System.out.print("������ : ");
		double weight = sc.nextDouble();
		System.out.print("Ű : ");
		double height = sc.nextDouble();

		mc.createMember(name, address, email, age, weight, height);
	}
}

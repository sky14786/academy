package com.method.controller;

import java.util.Scanner;

import com.method.model.Member;

public class MemberController {

	public Member enrollMember() {
		Member m = new Member();
		m.setAge(19);
		m.setName("������");
		m.setEmail("prince0324@naver.com");
		m.setHeight(180.5);
		m.setWeight(65.5);

		return m;
	}

	public void memberUpdate(Member m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====ȸ����������====");
		System.out.print("�̸� : ");
		m.setName(sc.nextLine());
		sc.nextLine();
		System.out.print("�̸��� : ");
		m.setEmail(sc.nextLine());
		System.out.print("���� : ");
		m.setAge(sc.nextInt());
		System.out.print("Ű : ");
		m.setHeight(sc.nextDouble());
		System.out.print("������ : ");
		m.setWeight(sc.nextDouble());

	}
}

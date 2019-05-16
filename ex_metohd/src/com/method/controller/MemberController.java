package com.method.controller;

import java.util.Scanner;

import com.method.model.Member;

public class MemberController {

	public Member enrollMember() {
		Member m = new Member();
		m.setAge(19);
		m.setName("유병승");
		m.setEmail("prince0324@naver.com");
		m.setHeight(180.5);
		m.setWeight(65.5);

		return m;
	}

	public void memberUpdate(Member m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====회원정보수정====");
		System.out.print("이름 : ");
		m.setName(sc.nextLine());
		sc.nextLine();
		System.out.print("이메일 : ");
		m.setEmail(sc.nextLine());
		System.out.print("나이 : ");
		m.setAge(sc.nextInt());
		System.out.print("키 : ");
		m.setHeight(sc.nextDouble());
		System.out.print("몸무게 : ");
		m.setWeight(sc.nextDouble());

	}
}

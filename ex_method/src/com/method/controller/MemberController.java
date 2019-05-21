package com.method.controller;

import java.util.Scanner;

import com.method.model.Member;

public class MemberController {

	public Member enrollMember() {
		Member m=new Member();
		m.setName("유병승");
		m.setEmail("prince0324@naver.com");
		m.setAge(19);
		m.setHeight(180.5);
		m.setWeight(65.5);
		return m;		
	}
	
	
	public void memberUpdate(Member m) {
		Scanner sc=new Scanner(System.in);
		System.out.println("====회원정보수정====");
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("이메일 : ");
		String email=sc.nextLine();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight=sc.nextDouble();
		m.setName(name);
		m.setEmail(email);
		m.setAge(age);
		m.setHeight(height);
		m.setWeight(weight);	
	}
	public void memberUpdate(Member m, int age) {
		
	}
	public void memberUpdate() {
		
	}

}




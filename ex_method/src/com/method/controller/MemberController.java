package com.method.controller;

import java.util.Scanner;

import com.method.model.Member;

public class MemberController {

	public Member enrollMember() {
		Member m=new Member();
		m.setName("������");
		m.setEmail("prince0324@naver.com");
		m.setAge(19);
		m.setHeight(180.5);
		m.setWeight(65.5);
		return m;		
	}
	
	
	public void memberUpdate(Member m) {
		Scanner sc=new Scanner(System.in);
		System.out.println("====ȸ����������====");
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�̸��� : ");
		String email=sc.nextLine();
		System.out.print("���� : ");
		int age=sc.nextInt();
		System.out.print("Ű : ");
		double height=sc.nextDouble();
		System.out.print("������ : ");
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




package com.kh.var.example;

import java.util.Scanner;

public class Example {
	

	public void example1() {
		Scanner sc = new Scanner(System.in);
		int a, b, sum = 0, sub = 0, mul = 0, nmg = 0;
		double div;
		
		System.out.print("1번 정수 입력 : ");
		a = sc.nextInt();
		System.out.print("2번 정수 입력 : ");
		b = sc.nextInt();

		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		nmg = a % b;

		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " % " + b + " = " + nmg);

	}

	public void example2() {
		Scanner sc = new Scanner(System.in);
		double garo, sero, dul, myun;
		
		System.out.print("가로를 입력하시오 : ");
		garo = sc.nextDouble();
		System.out.print("세로를 입력하시오 : ");
		sero = sc.nextDouble();

		dul = (garo + sero) * 2;
		myun = garo * sero;

		System.out.println("면적 : " + myun);
		System.out.println("둘레 : " + dul);

	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요 : ");
		String word = sc.nextLine();
		
		System.out.println("첫번째 문자 : "+word.charAt(0));
		System.out.println("첫번째 문자 : "+word.charAt(1));
		System.out.println("첫번째 문자 : "+word.charAt(2));
	}
}

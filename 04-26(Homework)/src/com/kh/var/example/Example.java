package com.kh.var.example;

import java.util.Scanner;

public class Example {
	

	public void example1() {
		Scanner sc = new Scanner(System.in);
		int a, b, sum = 0, sub = 0, mul = 0, nmg = 0;
		double div;
		
		System.out.print("1�� ���� �Է� : ");
		a = sc.nextInt();
		System.out.print("2�� ���� �Է� : ");
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
		
		System.out.print("���θ� �Է��Ͻÿ� : ");
		garo = sc.nextDouble();
		System.out.print("���θ� �Է��Ͻÿ� : ");
		sero = sc.nextDouble();

		dul = (garo + sero) * 2;
		myun = garo * sero;

		System.out.println("���� : " + myun);
		System.out.println("�ѷ� : " + dul);

	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��ϼ��� : ");
		String word = sc.nextLine();
		
		System.out.println("ù��° ���� : "+word.charAt(0));
		System.out.println("ù��° ���� : "+word.charAt(1));
		System.out.println("ù��° ���� : "+word.charAt(2));
	}
}

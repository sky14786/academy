package com.ex.func;

import java.util.Scanner;

public class ExTest {
	public void cal() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수1번 입력하시오");
		int num = sc.nextInt();

		sc.nextLine();

		System.out.println("정수2번 입력하시오");
		int num2 = sc.nextInt();

		System.out.println(num + "+" + num2 + "=" + (num + num2));
		System.out.println(num + "-" + num2 + "=" + (num - num2));
		System.out.println(num + "*" + num2 + "=" + (num * num2));
		System.out.println(num + "/" + num2 + "=" + (num / num2));
		System.out.println(num + "%" + num2 + "=" + (num % num2));

	}

	public void cal2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("10을 입력하시오:");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("20을 입력하시오 :");
		int num2 = sc.nextInt();

		System.out.println(num + " < " + num2 + "은 " + (num < num2) + "이다.");
		System.out.println(num + " > " + num2 + "은 " + (num2 > num) + "이다.");
		System.out.println(num + " > " + num2 + "은 " + (num > num2) + "이다.");
		System.out.println(num + " < " + num2 + "은 " + (num2 < num) + "이다.");
	}

	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력하시오 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("숫자 하나 입력하시오 : ");
		int b = sc.nextInt();

		System.out.println((a % 2 == 0) ? a : "2의 배수가 아닙니다.");
		System.out.println((b % 3 == 0) ? b : "3의 배수가 아닙니다.");

	}

	public void cal4() {
		// 일반논리연산자
		// 비교연산자(논리값)를 두개이상 결합하는 결과!
		boolean flagC = true, flagD = false;
		System.out.println(flagC && flagD);
		System.out.println(flagC || flagD);

		int age = 19;
		char gender = '남';
		boolean flagMili = true;
		System.out.println(age > 19 && gender == '남' && flagMili == true);
		

	}
}

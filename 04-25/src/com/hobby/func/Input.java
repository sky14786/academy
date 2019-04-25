package com.hobby.func;

import java.util.Scanner;

public class Input {
	public void inputTest() {
		Scanner sc = new Scanner(System.in);

		System.out.print("취미를 입력하시오 : ");
		String hobby = sc.nextLine();
		System.out.print("사는곳을 입력하시오 : ");
		String hometown = sc.nextLine();
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("몸무게를 입력하시오 : ");
		float weight = sc.nextFloat();

		System.out.println("당신의 취미는 : " + hobby);
		System.out.println("당신의 사는곳은 : " + hometown);
		System.out.println("당신의 나이는 : " + age);
		System.out.println("당신의 몸무게는 : " + weight);
	}

}

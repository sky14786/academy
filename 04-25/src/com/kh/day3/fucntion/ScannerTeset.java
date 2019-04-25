package com.kh.day3.fucntion;

import java.util.Scanner;

public class ScannerTeset {
	public void inputTest() {
		// Scanner객체를 만들어줌
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		//
		System.out.print("\n당신의 이름 입력 : ");
		// sc.next(); 는 띄어쓰기 기준
		// sc.nextLine()을 사용할때는 위 코드에서 sc.next() / sc.nextInt()
		// sc.nextFFloat() / sc.nextDouble()이 있는지 확인하고 있으면 반드시 sc.nextLine()을 사용하여
		// buffer 를 비워주어야 한다.

		String name = sc.nextLine(); // 엔터를 기준으로 값을 받음

		System.out.print("당신의 키는 : ");
		float height = sc.nextFloat();
		System.out.println("당신의 나이는 : " + age);
		System.out.println("당신의 이름은 : " + name);
		System.out.println("당신의 키는 : " + height);

	}

}

package com.kh.day3.fucntion;

import java.util.Scanner;

public class ScannerTeset {
	public void inputTest() {
		// Scanner객체를 만들어줌
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한개를 입력하시오 : ");
		int age = sc.nextInt();
		System.out.println("입력한 값은 : "+age);
	}

}

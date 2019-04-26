package com.ex.func;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		thirdOper();
	}

	public static void thirdOper() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int first = sc.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int second = sc.nextInt();
		
		String msg = first > second ? "첫번째 수가 커" : "두번째 수가 커";

		System.out.println(msg);

	}
}

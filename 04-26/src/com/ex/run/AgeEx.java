package com.ex.run;

import java.util.Scanner;

public class AgeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		System.out.println(sc.nextInt() < 19 ? "미성년자 입니다." : "성인입니다 들어오세요");

		System.out.print("성별을 입력하세요 (ex. 남자 여자)");
		System.out.println(sc.nextLine().equals("남자") ? "왼쪽으로 가세요" : "오른쪽으로 가세요");

	}

}

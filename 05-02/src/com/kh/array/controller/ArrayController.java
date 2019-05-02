package com.kh.array.controller;

import java.util.Scanner;

public class ArrayController {
	public void arrayTest() {
		// 배열선언!
		// 자료형[] 변수명 ;
		int[] intArr;
		char[] charArr;

		intArr = new int[5];
		System.out.println(intArr[2]);

		System.out.println(intArr);

	}

	public void arrayTest2() {
		char[] ch = { '가', '나', '하', '라', '마', '바' };

		ch[2] = '다';
		System.out.println(ch[2]);
		System.out.println(ch);

	}

	public void arrayExample1() {
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}

	public void arrayExample2() {
		String[] str = { "딸기", "바나나", "복숭아", "키위", "사과" };
		str = new String[5];

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("복숭아")) {
				System.out.println("현재 위치 :" + i + " 현재 값 : " + str[i]);
			}
		}
	}

	public void arrayExample3() {
		char[] ch = new char[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ch.length; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			ch[i] = sc.next().charAt(0);
			if (i == 0) {
				System.out.println("첫번째 : " + ch[i]);
			} else if (i == 3) {
				System.out.println("네번째 : " + ch[i]);
			}
		}
		System.out.println(ch);
	}

	public void arrayExample4() {
		int[] arr = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("배열의 합은 " + sum + " 입니다.");
	}

	public void arrayExample5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		sc.nextLine();
		char[] ch = str.toCharArray();
		ch = new char[ch.length];
		System.out.print("찾으실 문자를 입력하시오 : ");
		char search = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == search) {
				count++;
			}
		}
		System.out.println("입력하신 문자열 " + ch + "에서 찾으시는 문자 " + search + "은 " + count + "개 입니다.");
	}

	public void arrayExample6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민 번호를 입력하시오(- 없이) : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		char[] chClone = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (i > 6) {
				chClone[i] = '*';
			} else {
				chClone[i] = ch[i];
			}
		}
		System.out.println("주민번호 : " + chClone);

	}

	public void arrayExample7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수를 입력하시오 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int temp = arr.length / 2;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > temp) {
				j--;
				arr[i] = j;
			} else {
				j++;
				arr[i] = j;

			}
			System.out.print(arr[i] + ", ");
		}

	}

	public void arrayExample8() {
		int[] arr = new int[7];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = (int) (Math.random() * 45) + 1;
			if (!arr.equals(temp)) {
				arr[i] = temp;
				System.out.print(arr[i] + " ");
			} else {
				temp = (int) (Math.random() * 45) + 1;
				arr[i] = temp;
				System.out.print(arr[i] + " ");
			}
		}
	}
}
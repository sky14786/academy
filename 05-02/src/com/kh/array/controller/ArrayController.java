package com.kh.array.controller;

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
}

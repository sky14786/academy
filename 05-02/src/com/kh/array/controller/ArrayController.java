package com.kh.array.controller;

public class ArrayController {
	public void arrayTest() {
		// �迭����!
		// �ڷ���[] ������ ;
		int[] intArr;
		char[] charArr;

		intArr = new int[5];
		System.out.println(intArr[2]);
		
		System.out.println(intArr);

	}

	public void arrayTest2() {
		char[] ch = { '��', '��', '��', '��', '��', '��' };

		ch[2] = '��';
		System.out.println(ch[2]);
		System.out.println(ch);
		
	}
}

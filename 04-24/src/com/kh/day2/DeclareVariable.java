package com.kh.day2;

public class DeclareVariable {
	public void addValue() {
		boolean flag;
		flag = true;
		System.out.println(flag);

		flag = false;
		System.out.println(flag);

		// 리터럴값과 변수의 자료형이 맞지 않아서 에러발생!
		// flag=1000;
		// flag=tRue;
		
		char gender;
		gender = 'A';
		System.out.println(gender);
		
		String msg;
		msg = "안녕하세요 저는 김준영 입니다.";
		System.out.println(msg);
	}

}

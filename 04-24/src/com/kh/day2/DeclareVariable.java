package com.kh.day2;

public class DeclareVariable {
	public void addValue() {
		boolean flag;
		flag = true;
//		System.out.println(flag);

		flag = false;
//		System.out.println(flag);

		// 리터럴값과 변수의 자료형이 맞지 않아서 에러발생!
		// flag=1000;
		// flag=tRue;

		char gender;
		gender = 'A';
//		System.out.println(gender);

		String msg;
		msg = "안녕하세요 저는 김준영 입니다.";
//		System.out.println(msg);

		// 숫자
		// 정수 / 실수
		byte bnum;
		short snum;
		int num;
		long lnum;

		bnum = 100;
		System.out.println(bnum);
		snum = 10000;
		// short가 표현할수 없는 범위를 벗어나는 리터럴값이기 때문에 자동형변환이 되지 않음
		// snum=90000;
		System.out.println(snum);
		
		num = 90000;
		System.out.println(num);

	}

}

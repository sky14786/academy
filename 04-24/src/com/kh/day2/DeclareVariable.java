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

//		bnum = 100;
//		System.out.println(bnum);
//		snum = 10000;
//		 short가 표현할수 없는 범위를 벗어나는 리터럴값이기 때문에 자동형변환이 되지 않음
//		 snum=90000;
//		System.out.println(snum);
//
//		num = 90000;
//		System.out.println(num);
//
//		lnum = 900000000000000000L;
//		System.out.println(lnum);

		// 실수
		// float, double
		float fnum;
		double dnum;
		fnum = 180.5f;
//		System.out.println(fnum);

		dnum = 65.5;
//		System.out.println(dnum);

		num = 8;
//
//		System.out.println(num * 10);
//		System.out.println(num * 20);
//		System.out.println(num * 30);
//		System.out.println(num * 40);
//		System.out.println(num * 50);
//		System.out.println(num * 60);
//		System.out.println(num * 70);
//		System.out.println(num * 80);		
//		상수의 선언 및 대입

		final int AGE;
		AGE = 19;
		System.out.println(AGE);

		String msg2 = "안녕! 나는 김준영이야.";
		System.out.println(msg2);
		msg2 = new String("안녕 난 준영이야");
		// 문자열에서 + 기호는 연결연산으로 사용
		msg2 = "유병승은" + 19 + "살 입니다.";
		System.out.println(msg2);
		msg2 = "유병승은" + 19 + 1 + "살입니다.";
		System.out.println(msg2);
		msg2 = 19 + 1 + "살 유병승!";
		System.out.println(msg2);

	}
}

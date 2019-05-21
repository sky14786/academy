package com.kh.day2;

public class DeclareVariable {

	public void addValue()
	{
		//변수 선언 후 값 대입하기
		//논리형, 문자형 값 대입하기
		boolean flag;
		flag=true;
		System.out.println(flag);
		flag=false;
		System.out.println(flag);
		//리터럴값과 변수의 자료형이 맞지 않아서 에러발생!
		//flag=1000;
		//flag=tRue;
		//단일문자
		char gender;
		gender='A';
		//gender="A";
		gender='B';
		gender='남';
		System.out.println(gender);
		//문자열을 대입해보자
		String msg;
		msg="안녕하세요 저는 유병승입니다";
		System.out.println(msg);
		
		//숫자 
		//정수 / 실수
		byte bnum;
		short snum;
		int num;
		long lnum;
		
		bnum=100;
		System.out.println(bnum);
		snum=10000;
		//short가 표현할수 있는 범위를 벗어나는 
		//리터럴값이기 때문에 자동형변환이 되지 않음		
		//snum=90000;에러!
		
		System.out.println(snum);
		
		num=900000;
		System.out.println(num);
		lnum=9000;
		System.out.println(lnum);
		
		//실수
		//float, double
		float fnum;//4byte
		double dnum;//8byte
		fnum=180.5f;//기본자료형이 double
		System.out.println(fnum);
		dnum=65.5;
		System.out.println(dnum);
		
		//
		System.out.println(65.5);
		
		System.out.println(800000*10);
		System.out.println(800000*20);
		System.out.println(800000*30);
		System.out.println(800000*40);
		System.out.println(800000*50);
		System.out.println(800000*60);
		System.out.println(800000*70);
		System.out.println(800000*80);
		
		num=900000;
		
		System.out.println(num*10);
		System.out.println(num*20);
		System.out.println(num*30);
		System.out.println(num*40);
		System.out.println(num*50);
		System.out.println(num*60);
		System.out.println(num*70);
		System.out.println(num*80);
		
		
		//상수의 선언 및 대입
		final int AGE;
		AGE=19;
		System.out.println(AGE);
		/* age=20; */
		//AGE=20;
		
		//문자열 변수 심화!
		String msg2="안녕! 나는 유병승이야";
		System.out.println(msg2);
		msg2=new String("안녕 난 병승이야");
		System.out.println(msg2);
		//문자열에서 +기호는 연결연산으로 사용
		msg2="유병승은"+19+"살 입니다.";
		System.out.println(msg2);
		msg2="유병승은"+(19+1)+"살입니다.";
		System.out.println(msg2);
		msg2=19+1+"살 유병승!";
		System.out.println(msg2);
		
		String name="유병승";
		int age=19;
		String address="경기도 시흥시";
		name="김준영";
		
		
		String msg3="나는 "+name+"이다."+"내 나이는 "
		+age+"이고 내가 사는곳은 "+address;
		
		System.out.println(msg3);
		
		String memberName=name;
		//String memberName="김준영";
		age=25;
		int plusAge=age+2;
		System.out.println(plusAge);
		
		//데이터 오버플로우 테스트
		bnum=127;
		for(int i=0;i<300;i++)
		{
			System.out.println(bnum++);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}






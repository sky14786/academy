package com.kh.day3.function;

public class CastingTest {

	public void castingTest()
	{
		//자동형변환
		int account=1000;
		long accountVip;
		accountVip=account;
		//account = int형(4b), accountVip = long(8b)
		//계산시에도 자동형변환이 됨
		int su=10;
		double height=180.5;
		double result=su+height;
		//int result2=su+height;
		char ch='A';
		int character=ch;
		System.out.println((character+1));
		byte bnum=100;
		byte bnum2=100;
		byte bresult=(byte)(bnum+bnum2);
		System.out.println(bresult);
		int a=19;
		int b=20;
		int c=a+b;
		System.out.println((double)a/b);
		double d=18.7;
		double e=20.0;
		double f=d+e;
		int cast=(int)d;
		System.out.println(cast);
		System.out.println("\"키\"\t몸무게\t나이\\");
		System.out.print((character+1));
		System.out.print("  "+bresult);
		System.out.print("   "+(double)a/b);
		System.out.print(cast);
		System.out.println();
		System.out.printf("%d값 %d이야 %f",character,bresult,(double)a/b);
		String name="유병승";
		char gender='남';
		int age=19;
		double weight=65.5;
		System.out.printf("내 이름은 %s이고, 나이는 %d임, "
				+ "성별은 %c 몸무게는 %.2f",name,age,gender,weight);
		System.out.println();
		System.out.println("이름\t나이\t성별\t몸무게");
		System.out.printf("%-5s\t%d\t%c\t%.2f",name,age,gender,weight);
		
		/*
		 * double g= weight+1; g;
		 */
		
	}
	
	
}









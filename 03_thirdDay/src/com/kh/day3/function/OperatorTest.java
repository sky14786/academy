package com.kh.day3.function;

public class OperatorTest {
	public void selfAdd() 
	{
		int num=10;
		//num++;//동일 num=num+1;
		//++num;
		//System.out.println(++num);
		num++;
		++num;
		++num;
		num++;
		int num2=++num+20;
		int num3=num+++20;
		System.out.println(num2);
		System.out.println(num3);
		/*
		 * System.out.println(num++); System.out.println(num);
		 */
		//논리부정연산
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println(!!flag);
		/*
		 * int a=10; int b=20; int c=30;
		 * 
		 * a++; b=(--a)+b; c=(a++)+(--b);
		 * 
		 * System.out.println(a); System.out.println(b); System.out.println(c);
		 */
		
		
	}
}






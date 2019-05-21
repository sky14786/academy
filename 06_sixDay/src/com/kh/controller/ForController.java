package com.kh.controller;

import java.util.Scanner;

public class ForController {

	public void forTest()
	{
		/*
		 * System.out.println("안녕하세요!1"); System.out.println("안녕하세요!2");
		 * System.out.println("안녕하세요!3"); System.out.println("안녕하세요!4");
		 * System.out.println("안녕하세요!5"); System.out.println("안녕하세요!6");
		 * System.out.println("안녕하세요!7"); System.out.println("안녕하세요!8");
		 * System.out.println("안녕하세요!9"); System.out.println("안녕하세요!10");
		 */
		for(int i=0;i<1000;i++)
		{
			System.out.println("안녕하세요!"+(i+1));
		}
		
		for(int i=100;i>0;i--)
		{
			System.out.print(i+" ");
		}
		int num=100;
		for(int i=0;i<100;i++)
		{
			System.out.println(num--);
		}
		System.out.println("======짝수출력======");
		for(int i=0;i<51;i++)
		{
			System.out.println(i*2);
			/*
			 * if((i+1)%2==0) { System.out.println((i+1)); }
			 */
		}
		System.out.println("======합출력======");
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			//int sum=0;
			//i : 1~100
			sum+=i;//== sum=0+1,sum=1+2,sum=3+3.....
			System.out.println(sum);
		}
		//System.out.println(sum);
		sum=0;
		for(int i=1;i<=100;i++)
		{	
			if(i%2==1)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		
		
		Scanner sc=new Scanner(System.in);
		int 입력받은정수=sc.nextInt();
		//입력받은 정수까지 for문 구성하기
		for(int i=0;i<=입력받은정수;i++)
		{
			if(i%2==0) System.out.println(i);
		}
	}
	
	public void exForTest()
	{
		for(int i=0;i<10;i++)
		{
			
		}
		int num=0;
		for(;num<10;num++)
		{
			System.out.println("여러분 힘내요! 우리는 근로자가 아니에요!");
		}
		int num2=10;
		for(;num2==10;)//== while
		{
			System.out.println(num);
			num++;
			if(num==20) num2=20;
		}
		/*
		 * for(;;) { System.out.println("재미없어요? ㅠㅠㅠㅠㅠㅠ"); }
		 */
		
		for(int n=0;n<10;n++,num+=2)
		{
			
		}
	}
	
	public void whileTest()
	{
		int i=0;
		while(i<100)
		{
			System.out.print((i+1)+" ");
			i++;
		}
		System.out.println();
		i=100;
		while(i>0)
		{
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		//i=sc.nextInt();
		int num=sc.nextInt();
		int j=1;
		while(j<=num)
		{
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		//홀수만 출력하기
		int num2=1;
		
		while(num2<100)
		{
			num2++;
			if(num2%2==1)
			{
				System.out.println(num2);
			}
			//System.out.println(num2);
		}
		//while과 do~while의 차이
		int num3=10;
//		while(num3<10)
//		{
//			System.out.println("이거실행되니?");
//		}
		do {
			System.out.println("이거 실행되니?");
			num3++;
		}while(num3<20);
	}
	
	public void stringMethod()
	{
		String name="apple";
		System.out.println(name.length());
		//name에 들어가 있는문자열의
		//길이(글자수)를 정수로 알려주는것	
	}
	
	public void checkChar(){
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열입력 : ");
		String str=sc.nextLine();
		System.out.print("찾을문자 : ");
		char searchChar=sc.next().charAt(0);
		int count=0;
		/*char a=' ';
		String b="";*/
//		if(str.charAt(0)==searchChar) {
//			count++;
//		}
//		if(str.charAt(1)==searchChar) {
//			count++;
//		}
//		if(str.charAt(2)==searchChar) {
//			count++;
//		}
		for(int i=0;i<str.length();i++) {
			//System.out.println("몇!"+i);
			//System.out.println(str.charAt(i)==searchChar);
			if(str.charAt(i)==searchChar)
			{
				count++;
			}			
		}
		System.out.println("찾은문자갯수 : "+count);
	}
	
	
}











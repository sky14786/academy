package com.kh.controller;

import java.util.Scanner;

public class ForController {

	public void forTest()
	{
		/*
		 * System.out.println("照括馬室推!1"); System.out.println("照括馬室推!2");
		 * System.out.println("照括馬室推!3"); System.out.println("照括馬室推!4");
		 * System.out.println("照括馬室推!5"); System.out.println("照括馬室推!6");
		 * System.out.println("照括馬室推!7"); System.out.println("照括馬室推!8");
		 * System.out.println("照括馬室推!9"); System.out.println("照括馬室推!10");
		 */
		for(int i=0;i<1000;i++)
		{
			System.out.println("照括馬室推!"+(i+1));
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
		System.out.println("======側呪窒径======");
		for(int i=0;i<51;i++)
		{
			System.out.println(i*2);
			/*
			 * if((i+1)%2==0) { System.out.println((i+1)); }
			 */
		}
		System.out.println("======杯窒径======");
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
		int 脊径閤精舛呪=sc.nextInt();
		//脊径閤精 舛呪猿走 for庚 姥失馬奄
		for(int i=0;i<=脊径閤精舛呪;i++)
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
			System.out.println("食君歳 毘鎧推! 酔軒澗 悦稽切亜 焼艦拭推!");
		}
		int num2=10;
		for(;num2==10;)//== while
		{
			System.out.println(num);
			num++;
			if(num==20) num2=20;
		}
		/*
		 * for(;;) { System.out.println("仙耕蒸嬢推? ばばばばばば"); }
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
		System.out.print("舛呪脊径 : ");
		//i=sc.nextInt();
		int num=sc.nextInt();
		int j=1;
		while(j<=num)
		{
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		//筈呪幻 窒径馬奄
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
		//while引 do~while税 託戚
		int num3=10;
//		while(num3<10)
//		{
//			System.out.println("戚暗叔楳鞠艦?");
//		}
		do {
			System.out.println("戚暗 叔楳鞠艦?");
			num3++;
		}while(num3<20);
	}
	
	public void stringMethod()
	{
		String name="apple";
		System.out.println(name.length());
		//name拭 級嬢亜 赤澗庚切伸税
		//掩戚(越切呪)研 舛呪稽 硝形爽澗依	
	}
	
	public void checkChar(){
		Scanner sc=new Scanner(System.in);
		System.out.print("庚切伸脊径 : ");
		String str=sc.nextLine();
		System.out.print("達聖庚切 : ");
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
			//System.out.println("護!"+i);
			//System.out.println(str.charAt(i)==searchChar);
			if(str.charAt(i)==searchChar)
			{
				count++;
			}			
		}
		System.out.println("達精庚切姐呪 : "+count);
	}
	
	
}











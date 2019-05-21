package com.kh.function;

import java.util.Scanner;

public class TestOperator {

	public void chageChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("영문자 한개를 입력하세요(대소문자 구별 없음) : ");
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		char msg=ch>='a'&&ch<='z'?(char)(ch-32)
				:ch>='A'&&ch<='Z'?(char)(ch+32):'*';
		msg=' ';
		if(ch>='a'&&ch<='z')
		{
			msg=(char)(ch-32);
		}
		else if(ch>='A'&&ch<='Z')
		{
			msg=(char)(ch+32);
		}
				
				
		System.out.println("변경값 : "+msg);
		
		//System.out.println("변경값  : "+(char)(ch^32));
		
		//입력받은 글자가 소문자일때 대문자로
//		  System.out.println("입력받은값 : "+ch+ "," 
//		  + " 변경 : "+(char)(ch-32));
//		//입력받은 글자가 대문자일때 소문자로
//		  System.out.println("입력받은값 : "+ch+ "," 
//				  + " 변경 : "+(char)(ch+32));
		 
		
	}
	
}








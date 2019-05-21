package com.kh.controller;

import java.util.Scanner;

public class SwitchController {

	public void switchTest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===당신의 취미는====");
		//System.out.print("취미를 고르세요(1.코딩,2.독서,3.게임,4.유투브) : ");
		//System.out.print("취미를 고르세요(가.코딩,나.독서,다.게임,라.유투브) : ");
		System.out.print("취미를 고르세요(코딩,독서,게임,유투브) : ");
		//숫자로 값 입력받아 처리하기!
		//int choice=sc.nextInt();
		
		//단일문자로 값 입력받아 처리하기!
		//char choice=sc.next().charAt(0);
		
		//문자열로 값 입력받아 처리하기!
		String choice=sc.nextLine();
		
//		switch(choice)
//		{
//			case 1 : System.out.println("거짓말!");break;
//			case 2 : System.out.println("인기서적순위......");break;
//			case 3 : System.out.println("인기게임순위......");break;
//			case 4 : System.out.println("인기동영상.....");break;
//			default : System.out.println("잘못입력하셨습니다.!\n1~4번까지만입력하세요");
//		}
		
		//break문이 없다면?
//		switch(choice)
//		{
//			case 1 : System.out.println("거짓말!");
//			case 2 : System.out.println("인기서적순위......");
//			case 3 : System.out.println("인기게임순위......");
//			case 4 : System.out.println("인기동영상.....");
//			default : System.out.println("잘못입력하셨습니다.!\n1~4번까지만입력하세요");
//		}
//		switch(choice)
//		{
//			case '가' : System.out.println("거짓말!");break;
//			case '나' : System.out.println("인기서적순위......");break;
//			case '다' : System.out.println("인기게임순위......");break;
//			case '라' : System.out.println("인기동영상.....");break;
//			default : System.out.println("잘못입력하셨습니다.!\n1~4번까지만입력하세요");
//		}
		switch(choice)
		{
			case "코딩" : return;
//						  if(1<0) 
//						  {
//							System.out.println("거짓말!"); 
//						  }
//						  else {
//							  System.out.println("화이팅!");
//						  }
						  //break;
			case "독서" : System.out.println("인기서적순위......");break;
			case "게임" : System.out.println("인기게임순위......");break;
			case "유투브" : System.out.println("인기동영상.....");break;
			default : System.out.println("잘못입력하셨습니다.!\n1~4번까지만입력하세요");
		}
		System.out.println("return이 없을때 출력이됨!");
		
	}
	
	
}





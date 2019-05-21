package com.ex.function;

import java.util.Scanner;

public class ExTest {

	public void cal()
	{
		//두개의 숫자를 입력받아!
		//필요코드 
		// 1. 숫자를 보관할 변수! 2개!
		// 2. 입력받을 수 있는 객체(Scanner)
		// 3. nextInt()매소드 활용한다.
		int su1, su2;
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 1번 입력 : ");
		su1=sc.nextInt();
		System.out.print("숫자 2번 입력 : ");
		su2=sc.nextInt();
		//System.out.println("1번"+su1+" : 2번"+su2);
			
		
		//더하기, 빼기, 나누기, 나머지, 곱하기 수행
		int addResult=su1+su2;
		int minusResult=su1-su2;
		double divideResult=(double)su1/su2;
		int namugeResult=su1%su2;
		int ggoupResult=su1*su2;
		
		//결과출력
		System.out.println("더하기결과 : "+su1+"+"+su2+"="+addResult+"입니다.");
		System.out.println("빼   기결과 : "+su1+"-"+su2+"="+minusResult+"입니다.");
		System.out.println("나누기결과 : "+su1+"/"+su2+"="+divideResult+"입니다.");
		System.out.println("나머지결과 : "+su1+"/"+su2+"의 나머지의 값 "+namugeResult+"입니다.");
		System.out.println("곱하기결과 : "+su1+"*"+su2+"="+ggoupResult+"입니다.");
		
		
	}
	

	
}

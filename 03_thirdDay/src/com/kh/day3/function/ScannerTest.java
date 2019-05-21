package com.kh.day3.function;

import java.util.Scanner;

public class ScannerTest {

	public void inputTest()
	{
		//Scanner객체를 만들어줌
		Scanner sc=new Scanner(System.in);
		System.out.print("당신의 나이 입력 : ");
		int age=sc.nextInt();
		System.out.println("당신의 이름 입력: ");
		//String name=sc.next();//띄어쓰기기준으로 값을 받아옴
		//sc.nextLine()을 사용할때는 
		//위 코드에서 sc.next() / sc.nextInt() 
		// / sc.nextFloat() / sc.nextDouble()이 있는지 확인하고
		//있으면 반드시 sc.nextLine()을 사용하여 buffer를 비워줌
		sc.nextLine();
		String name=sc.nextLine();//엔터를 기준으로 값을 받아오는것
		System.out.print("당신의 키 : ");
		float height=sc.nextFloat();
		
		System.out.println("당신의 이름은 "+name);
		System.out.println("당신의 나이는 "+age);
		System.out.println("일년이 지나면 너는 "+(age+1)+"이 되는거야!");
		System.out.println("당신의 키는 "+height);
		
	}
	
}







package com.hobby.func;
import java.util.Scanner;

public class Input {

	public void inputTest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("당신의 나이입력 : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("당신의 취미입력(다중값은 ,로 구분) : ");
		String hobby=sc.nextLine();
		System.out.print("당신의 주소입력 : ");
		//String address=sc.nextLine();
		char address=sc.nextLine().charAt(0);
		System.out.print("당신의 몸무게 : ");
		double weight=sc.nextDouble();
		/*
		 * sc.nextLine(); System.out.print("당신의 이상형은 : "); String adf=sc.nextLine();
		 */
		System.out.println("당신의 나이는 "+age+"이고, 취미는 "+hobby
				+" 주소는 "+address+" 몸무게는 "+weight);
	}
	
	
}




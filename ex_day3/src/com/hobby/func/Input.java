package com.hobby.func;
import java.util.Scanner;

public class Input {

	public void inputTest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("����� �����Է� : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("����� ����Է�(���߰��� ,�� ����) : ");
		String hobby=sc.nextLine();
		System.out.print("����� �ּ��Է� : ");
		//String address=sc.nextLine();
		char address=sc.nextLine().charAt(0);
		System.out.print("����� ������ : ");
		double weight=sc.nextDouble();
		/*
		 * sc.nextLine(); System.out.print("����� �̻����� : "); String adf=sc.nextLine();
		 */
		System.out.println("����� ���̴� "+age+"�̰�, ��̴� "+hobby
				+" �ּҴ� "+address+" �����Դ� "+weight);
	}
	
	
}




package com.kh.day3.function;

import java.util.Scanner;

public class ScannerTest {

	public void inputTest()
	{
		//Scanner��ü�� �������
		Scanner sc=new Scanner(System.in);
		System.out.print("����� ���� �Է� : ");
		int age=sc.nextInt();
		System.out.println("����� �̸� �Է�: ");
		//String name=sc.next();//����������� ���� �޾ƿ�
		//sc.nextLine()�� ����Ҷ��� 
		//�� �ڵ忡�� sc.next() / sc.nextInt() 
		// / sc.nextFloat() / sc.nextDouble()�� �ִ��� Ȯ���ϰ�
		//������ �ݵ�� sc.nextLine()�� ����Ͽ� buffer�� �����
		sc.nextLine();
		String name=sc.nextLine();//���͸� �������� ���� �޾ƿ��°�
		System.out.print("����� Ű : ");
		float height=sc.nextFloat();
		
		System.out.println("����� �̸��� "+name);
		System.out.println("����� ���̴� "+age);
		System.out.println("�ϳ��� ������ �ʴ� "+(age+1)+"�� �Ǵ°ž�!");
		System.out.println("����� Ű�� "+height);
		
	}
	
}







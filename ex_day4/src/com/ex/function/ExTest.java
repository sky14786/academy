package com.ex.function;

import java.util.Scanner;

public class ExTest {

	public void cal()
	{
		//�ΰ��� ���ڸ� �Է¹޾�!
		//�ʿ��ڵ� 
		// 1. ���ڸ� ������ ����! 2��!
		// 2. �Է¹��� �� �ִ� ��ü(Scanner)
		// 3. nextInt()�żҵ� Ȱ���Ѵ�.
		int su1, su2;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� 1�� �Է� : ");
		su1=sc.nextInt();
		System.out.print("���� 2�� �Է� : ");
		su2=sc.nextInt();
		//System.out.println("1��"+su1+" : 2��"+su2);
			
		
		//���ϱ�, ����, ������, ������, ���ϱ� ����
		int addResult=su1+su2;
		int minusResult=su1-su2;
		double divideResult=(double)su1/su2;
		int namugeResult=su1%su2;
		int ggoupResult=su1*su2;
		
		//������
		System.out.println("���ϱ��� : "+su1+"+"+su2+"="+addResult+"�Դϴ�.");
		System.out.println("��   ���� : "+su1+"-"+su2+"="+minusResult+"�Դϴ�.");
		System.out.println("�������� : "+su1+"/"+su2+"="+divideResult+"�Դϴ�.");
		System.out.println("��������� : "+su1+"/"+su2+"�� �������� �� "+namugeResult+"�Դϴ�.");
		System.out.println("���ϱ��� : "+su1+"*"+su2+"="+ggoupResult+"�Դϴ�.");
		
		
	}
	

	
}

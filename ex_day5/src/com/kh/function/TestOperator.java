package com.kh.function;

import java.util.Scanner;

public class TestOperator {

	public void chageChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Ѱ��� �Է��ϼ���(��ҹ��� ���� ����) : ");
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
				
				
		System.out.println("���氪 : "+msg);
		
		//System.out.println("���氪  : "+(char)(ch^32));
		
		//�Է¹��� ���ڰ� �ҹ����϶� �빮�ڷ�
//		  System.out.println("�Է¹����� : "+ch+ "," 
//		  + " ���� : "+(char)(ch-32));
//		//�Է¹��� ���ڰ� �빮���϶� �ҹ��ڷ�
//		  System.out.println("�Է¹����� : "+ch+ "," 
//				  + " ���� : "+(char)(ch+32));
		 
		
	}
	
}








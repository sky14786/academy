package com.kh.controller;

import java.util.Scanner;

public class SwitchController {

	public void switchTest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===����� ��̴�====");
		//System.out.print("��̸� ������(1.�ڵ�,2.����,3.����,4.������) : ");
		//System.out.print("��̸� ������(��.�ڵ�,��.����,��.����,��.������) : ");
		System.out.print("��̸� ������(�ڵ�,����,����,������) : ");
		//���ڷ� �� �Է¹޾� ó���ϱ�!
		//int choice=sc.nextInt();
		
		//���Ϲ��ڷ� �� �Է¹޾� ó���ϱ�!
		//char choice=sc.next().charAt(0);
		
		//���ڿ��� �� �Է¹޾� ó���ϱ�!
		String choice=sc.nextLine();
		
//		switch(choice)
//		{
//			case 1 : System.out.println("������!");break;
//			case 2 : System.out.println("�α⼭������......");break;
//			case 3 : System.out.println("�α���Ӽ���......");break;
//			case 4 : System.out.println("�α⵿����.....");break;
//			default : System.out.println("�߸��Է��ϼ̽��ϴ�.!\n1~4���������Է��ϼ���");
//		}
		
		//break���� ���ٸ�?
//		switch(choice)
//		{
//			case 1 : System.out.println("������!");
//			case 2 : System.out.println("�α⼭������......");
//			case 3 : System.out.println("�α���Ӽ���......");
//			case 4 : System.out.println("�α⵿����.....");
//			default : System.out.println("�߸��Է��ϼ̽��ϴ�.!\n1~4���������Է��ϼ���");
//		}
//		switch(choice)
//		{
//			case '��' : System.out.println("������!");break;
//			case '��' : System.out.println("�α⼭������......");break;
//			case '��' : System.out.println("�α���Ӽ���......");break;
//			case '��' : System.out.println("�α⵿����.....");break;
//			default : System.out.println("�߸��Է��ϼ̽��ϴ�.!\n1~4���������Է��ϼ���");
//		}
		switch(choice)
		{
			case "�ڵ�" : return;
//						  if(1<0) 
//						  {
//							System.out.println("������!"); 
//						  }
//						  else {
//							  System.out.println("ȭ����!");
//						  }
						  //break;
			case "����" : System.out.println("�α⼭������......");break;
			case "����" : System.out.println("�α���Ӽ���......");break;
			case "������" : System.out.println("�α⵿����.....");break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.!\n1~4���������Է��ϼ���");
		}
		System.out.println("return�� ������ ����̵�!");
		
	}
	
	
}





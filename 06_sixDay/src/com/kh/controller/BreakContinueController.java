package com.kh.controller;

import java.util.Scanner;

public class BreakContinueController {

	public void breakTest()
	{
		//break�� �ݺ����̳� �ش� �����ϴ� ������ ����
		//�ݺ���, switch���� ���
		for(int i=0;;i++)
		{
			System.out.println(i);
			if(i==20) {
				break;
			}
		}
		
		while(true){
			System.out.println("===�����ֹ����α׷�===");
			Scanner sc=new Scanner(System.in);
			System.out.println("1.�������");
			System.out.println("2.�ᳪ������");
			System.out.println("3.����");
			System.out.println("4.ȸ����");
			System.out.println("5.������ġ");
			System.out.println("0.����");
			System.out.print("�Է� : ");
			int input=sc.nextInt();
			
			switch(input){
				case 1 : System.out.println("������� �ֹ��Ϸ�");break;
				case 2 : System.out.println("�ᳪ������ �ֹ��Ϸ�");break;
				case 3 : System.out.println("���� �ֹ��Ϸ�");break;
				case 4 : System.out.println("ȸ���� �ֹ��Ϸ�");break;
				case 5 : System.out.println("������ġ �ֹ��Ϸ�");break;
				case 0 : System.out.println("���α׷��� �����մϴ�.");break;
				default : System.out.println("�߸������̽��ϴ�.");
			}
			if(input==0)
			{
				break;
			}
		}
			
	}
	public void continueTest(){
		
		for(int i=0;i<10;i++)
		{
			if(i%2==0) continue;
			System.out.println(i);
		}
		
		//�������� ����غ���
		for(int i=0;i<5;i++)
		{
			System.out.println((int)(Math.random()*60));
			//random*10 = 0~9������ ���� �ǹ�
			//0~59 ==random()*60
			
		}		
	}
	
	public void inputPerson()
	{
		Scanner sc=new Scanner(System.in);
		String person="";
		for(int i=0;i<5;i++)
		{
			System.out.print("�̸� : ");
			String name=sc.nextLine();
			System.out.print("���� : ");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.print("�ּ� : ");
			String address=sc.nextLine();
			System.out.print("Ű : ");
			double height=sc.nextDouble();
			System.out.print("������ : ");
			double weight=sc.nextDouble();
			sc.nextLine();
			System.out.print("����ó : ");
			String phone=sc.nextLine();
			person+=name+" "+age+" "+address+" "+height+" "+weight+" "+phone+"\n";
		}
		System.out.println("====�Է��������====");
		System.out.println(person);			
	}
	
	
	public void inputPerson2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===ȸ��������α׷�===");
		System.out.print("����� ȸ���� �Է� : ");
		int count=sc.nextInt();
		sc.nextLine();
		String members="";
		double avgAge=0.0,avgHeight=0.0, avgWeight=0.0;
		double sumAge=0,sumHeight=0,sumWeight=0;
				
		for(int i=0;i<count;i++)
		{
			System.out.print("�̸� : ");
			String name=sc.nextLine();
			System.out.print("���� : ");
			int age=sc.nextInt();
			sumAge+=age;
			sc.nextLine();
			System.out.print("�ּ� : ");
			String addr=sc.nextLine();
			System.out.print("Ű : ");
			double height=sc.nextDouble();
			sumHeight+=height;
			System.out.print("������ : ");
			double weight=sc.nextDouble();
			sumWeight+=weight;
			sc.nextLine();
			System.out.print("��ȭ��ȣ : ");
			String phone=sc.nextLine();
			members+=name+" "+age+"�� "+addr+" "+height+"cm "+weight+"kg "+phone+"\n";
		}
		System.out.println("====��ϵ� ȸ��=====");
		System.out.println(members);
		System.out.println("��ճ��� : "+sumAge/count+
				"�� ���Ű : "+sumHeight/count+
				"cm ��ո����� : "+sumWeight/count+"kg");
	}
	
	public void primeNum()
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�����Է� : ");
			int su=sc.nextInt();
			int count=0;//�������� 0�� ������ ���� ���� üũ
			if(su>=2){
				for(int i=0;i<su;i++)
				{
					if(su%(i+1)==0) {
						count++;
					}
				}
				if(count>2) {
					System.out.println("�Ҽ��� �ƴϴ�");
				}
				else {
					System.out.println("�Ҽ���");
				}
			}
			else{
				
				System.out.print("�߸��Է��ϼ̽��ϴ�.");
			}
			System.out.print("��������Ͻðڽ��ϱ�(Y/N)?");
			sc.nextLine();
			String go=sc.nextLine();
			//if(go.equals("N")||go.equals("n")){
			if(go.toUpperCase().equals("N")) {
				System.out.println("���α׷��� �����մϴ�.�𸮸���");
				break;
			}
		}
	}
	
	
}









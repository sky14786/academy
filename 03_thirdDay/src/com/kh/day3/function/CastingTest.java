package com.kh.day3.function;

public class CastingTest {

	public void castingTest()
	{
		//�ڵ�����ȯ
		int account=1000;
		long accountVip;
		accountVip=account;
		//account = int��(4b), accountVip = long(8b)
		//���ÿ��� �ڵ�����ȯ�� ��
		int su=10;
		double height=180.5;
		double result=su+height;
		//int result2=su+height;
		char ch='A';
		int character=ch;
		System.out.println((character+1));
		byte bnum=100;
		byte bnum2=100;
		byte bresult=(byte)(bnum+bnum2);
		System.out.println(bresult);
		int a=19;
		int b=20;
		int c=a+b;
		System.out.println((double)a/b);
		double d=18.7;
		double e=20.0;
		double f=d+e;
		int cast=(int)d;
		System.out.println(cast);
		System.out.println("\"Ű\"\t������\t����\\");
		System.out.print((character+1));
		System.out.print("  "+bresult);
		System.out.print("   "+(double)a/b);
		System.out.print(cast);
		System.out.println();
		System.out.printf("%d�� %d�̾� %f",character,bresult,(double)a/b);
		String name="������";
		char gender='��';
		int age=19;
		double weight=65.5;
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d��, "
				+ "������ %c �����Դ� %.2f",name,age,gender,weight);
		System.out.println();
		System.out.println("�̸�\t����\t����\t������");
		System.out.printf("%-5s\t%d\t%c\t%.2f",name,age,gender,weight);
		
		/*
		 * double g= weight+1; g;
		 */
		
	}
	
	
}









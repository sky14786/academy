package com.kh.day5.function;

import java.util.Scanner;

public class ConditionTest {

	public void condition()
	{
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		num=sc.nextInt();
		//���ǹ� if�� ����غ���!
		if(num>0)
		{
			System.out.println("���1");
		}
		System.out.print("���� �Է� : ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("���2");
		}
		System.out.print("���� �Է� : ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("���3");
		}
		
		System.out.println("{}�ۿ� �ִ°�!");
	}
	
	public void checkGender()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("����� ������(��,��) : ");
		char gender=sc.next().charAt(0);
		
		if(gender=='��')
		{
			System.out.println("���������� ������!");
		}
		if(gender=='��')
		{
			System.out.println("�������� ������!");
		}
		
	}
	
	
	public void checkNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("�����ϳ��� �Է��ϼ��� : ");
		int su=sc.nextInt();
		if(su%2==0)
		{
			System.out.println("¦���Դϴ�.");
		}
//		if(su%2!=0)//su%2==1
//		{
//			System.out.println("Ȧ���Դϴ�.");
//		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		//����, ����, ���� �������
		System.out.print("�������� : ");
		int math=sc.nextInt();
		System.out.print("�������� : ");
		int kor=sc.nextInt();
		System.out.print("�������� : ");
		int eng=sc.nextInt();
		int sum=math+kor+eng;
		double avg=sum/3.0;
		if(sum>250)
		{
			System.out.println("������Դϴ�");
		}
		if(avg>=90)
		{
			System.out.println("A");
		}
		if(avg<90&&avg>=80)
		{
			System.out.println("B");
		}
		if(avg<80&&avg>=70)
		{
			System.out.println("C");
		}
		
	}
	
	
	public void ifElseTest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("����� ���̴�?");
		int age=sc.nextInt();
		if(age>19) {
			System.out.println("������ ���Ƴ뼼��~~! ");
		}
		if(age<19||true)
		{
			System.out.println("�̰Ŵ� ������ �Ǵ�?");
		}
		/*else {
			System.out.println("�����ؾ�����! ");
		}*/
	}
	public void calGrade()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = sc.nextLine();
		System.out.println("�г� ");
		int grade= sc.nextInt();
		System.out.println("�� ");
		int group= sc.nextInt();
		System.out.println("��ȣ ");
		int num= sc.nextInt();
		System.out.println("����(M/F) ");
		char ch= sc.next().charAt(0);
		System.out.println("���� ");
		double score= sc.nextDouble();
		
		String gender = " ";
		
		if(ch=='M') {
			gender = "���л�";
		}/*else if(ch=='F') {
			gender = "���л�";
		}*/else {
			gender = "���л�";
		}
		
		System.out.println(grade+"�г� "+group+"�� "+num
				+"�� "+gender+" "+name+"�� ������ "+score+"�̴�.");
	}
	
	
	public void calGrade2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("���� : ");
		int kor=sc.nextInt();
		System.out.print("���� : ");
		int eng=sc.nextInt();
		System.out.print("���� : ");
		int math=sc.nextInt();
		int sum=kor+eng+math;
		double avg=sum/3.0;
		if((kor>=40&&eng>=40&&math>=40)||avg>60)
		{
			System.out.println("�հ��� ���ϵ帳�ϴ�!");
		}
		else {
			System.out.println("���հ��Դϴ�.!");
		}
	}
	
	public void ifElesIfTest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("���� : ");
		int age=sc.nextInt();
		if(age>19)
		{
			System.out.println("����� �����̳׿�! ����!?");
		}
		else if(age>=17)//== age<=19&&age>=17
		{
			System.out.println("����� ����л�!");
		}
		else if(age>=14)
		{
			System.out.println("����� ���л�");
		}
		else if(age<=0)
		{
			System.out.println("���̴� ������ �����!");
		}
		else {
		  
			System.out.println("�ư��� �ȵ�!!!");
		}
		 
	}
	
	public void calProgram()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("����1 : ");
		int num1=sc.nextInt();
		System.out.print("���� 2 : ");
		int num2=sc.nextInt();
		System.out.println("�������Է�(+,-,/,*) : ");
		char op=sc.next().charAt(0);
		if(num1>0&&num2>0&&
				(op=='+'||op=='-'||op=='*'||op=='/'))
		{
			if(op=='+')
			{
				
			}
			else if(op=='-')
			{
				
			}
			else if(op=='*')
			{
				
			}
			else if(op=='/')
			{
				
			}
		}
		
		else {//op!='+'&&op!='-'&&op!='*'&&op!='/'
			System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void login()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵��Է� : ");
		String id=sc.nextLine();
		System.out.println("�е�����Է� : ");
		String pw=sc.nextLine();
		if(id.equals("admin"))
		{
			if(pw.equals("1234"))
			{
				System.out.println("�α��� ����");
				System.out.println("====ȸ������====");
				System.out.println("1.ȸ�����");
				System.out.println("2.ȸ���˻�");
				System.out.println("3.ȸ������");
			}
			else
			{
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
}











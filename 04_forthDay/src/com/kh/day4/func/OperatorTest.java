package com.kh.day4.func;
import java.util.Scanner;
public class OperatorTest {

	public void cal() {
		//�⺻���� ��Ģ�����ϱ�
		int num=3;
		int num2=20;
		int num3=30;
		System.out.println(num+"+"+num2+"="+(num+num2));
		System.out.println(num2+num3);
		System.out.println(num+num2+num3);
		System.out.println(num2-num3);
		System.out.println(20-10);
		System.out.println(3*2);
		System.out.println(num*num3);
		System.out.println((double)(5/4));
		System.out.println(5.0/4);
		System.out.println((double)num3/num2);
		System.out.println(5%2);
		System.out.println(4%2);
		System.out.println(num3%num2);
		
		int result=num2+num3;
		double result2=(double)num2/num;
		
		double total=result+result2;
		int total1=(int)(result+result2);
		
		System.out.println(result2);
	}
	public void compare()
	{
		int a=25;
		int b=20;
		int c=25;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a!=b);
		System.out.println(a!=c);
		System.out.println(a>c);
		System.out.println(a>=c);
		
		double dnum=12.34,dnum2=34.5;
		System.out.println(dnum==dnum2);
		System.out.println(dnum!=dnum2);
		System.out.println(dnum>dnum2);
		
		//���Ϲ��ں�
		char ch='a', ch1='b', ch2='a';
		System.out.println(ch==ch1);
		System.out.println(ch==ch2);
		//��Һ�? ����?
		System.out.println(ch<ch1);//���� ����
		//String�� ��Һ񱳰���?
		String name="������",name2="����ö";
		//System.out.println(name>name2);
		
		//�μ��� �Է¹ް�
		// �ΰ��� ������ �ʿ�!
		int inputNum1,inputNum2;
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Ѱ��Է�(��1/2/3) : ");
		//inputNum1=sc.nextInt();
		System.out.print("���� �Ѱ� �� �Է�(�� 1) : ");
		//inputNum2=sc.nextInt();
		//inputNum1�� 2�� ����ΰ�?
		/*
		 * boolean flagA=inputNum1%2==0; boolean flagB=inputNum2%3==0;
		 * System.out.println(flagA); System.out.println(flagB);
		 */
		//System.out.println(inputNum1%2==0);
		
		
		//�Ϲݳ�������
		//�񱳿�����(����)�� �ΰ��̻� �����ϴ� ���!
		System.out.println();
		System.out.println("===�Ϲݳ�������====");
		boolean flagC=true, flagD=false;
		System.out.println(flagC&&flagD);
		System.out.println(flagC||flagD);
		int age=19;
		char gender='��';
		boolean flagMili=true;
		System.out.println(age>19&&gender=='��'&&flagMili==true);
		System.out.println(age>19||gender=='��'||flagMili==true);
		///
		System.out.println("���������????");
		System.out.println(age>19||gender=='��'&&flagMili==true);
		System.out.println(age>19&&(gender=='��'||flagMili==true));	
		
	}
	public void bitOper()
	{
		int a=10, b=22;
		String basic="00000000000000000000000000000000";
		String bit=basic+Integer.toBinaryString(a);
		//a��Ʈ��
		bit=bit.substring(bit.length()-32);
		System.out.println("a��Ʈ�� : "+bit);
		//b��Ʈ��
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println("b��Ʈ�� : "+bit);
		
		//a&b�����
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println("a&b��Ʈ�� : "+bit);
		//a|b�����
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println("a|b��Ʈ�� : "+bit);
		//a^b�����
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println("a^b��Ʈ�� : "+bit);
		//~a�����
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println("~a��Ʈ�� : "+bit);
		//a<<2
		bit=basic+Integer.toBinaryString(a<<2);
		bit=bit.substring(bit.length()-32);
		System.out.println("a<<2��Ʈ�� : "+bit);
		//a>>2
		bit=basic+Integer.toBinaryString(a>>2);
		bit=bit.substring(bit.length()-32);
		System.out.println("a>>2��Ʈ�� : "+bit);
	}
	public void complexTest()
	{
		int a=10, b=20, c=30;
		double d=0;
		a+=3;//a=a+3
		System.out.println(a);
		a+=b;//a=a+b
		System.out.println(a);
		a-=c;//a=a-c;
		System.out.println(a);
		a/=b;//a=a/b
		System.out.println(a);
		System.out.println((double)3/10);
		a%=b;//a=a%b
		System.out.println(a);
		//����ڿ��� ���� 3���� �Է¹ް�
		//�Է¹��� ������ ������ ���ϴ� ���α׷�
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("1�������Է� : ");
		sum+=sc.nextInt();//sum=sum+�Է°�
		System.out.print("2�������Է� : ");
		sum+=sc.nextInt();
		System.out.print("3�������Է� : ");
		sum+=sc.nextInt();
		System.out.println(sum);
		
	}
	public void thirdOper()
	{
		int a=20, b=30;
		
		/* String msg=a>b?"a�� b����Ŀ":"b�� a���� Ŀ"; */
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° �� �Է�(10�̻��� �� �Է�) : ");
		int first=sc.nextInt();
		System.out.print("�ι�° �� �Է�(10�̻��� �� �Է�) : ");
		int second=sc.nextInt();
		
		String msg=first>=10&&second>=10?
				first>second?"ù��°���� Ŀ":"�ι�°���� Ŀ"
					:"�� ���� 10���� ū���Է��Ϸ���!!";
		System.out.println(msg);
		
		String name="������";
		System.out.println(name.equals("������"));
		System.out.println(name.equals("����ö"));
		System.out.println("���ؿ�".equals("������"));
		
		
		
		
	}
	
	
	
	
	
}







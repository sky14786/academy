package com.kh.day4.func;
import java.util.Scanner;
public class OperatorTest {

	public void cal() {
		//기본적인 사칙연산하기
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
		
		//단일문자비교
		char ch='a', ch1='b', ch2='a';
		System.out.println(ch==ch1);
		System.out.println(ch==ch2);
		//대소비교? 가능?
		System.out.println(ch<ch1);//가능 ㅇㅈ
		//String은 대소비교가능?
		String name="유병승",name2="문은철";
		//System.out.println(name>name2);
		
		//두수를 입력받고
		// 두개의 변수가 필요!
		int inputNum1,inputNum2;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 한개입력(예1/2/3) : ");
		//inputNum1=sc.nextInt();
		System.out.print("정수 한개 더 입력(예 1) : ");
		//inputNum2=sc.nextInt();
		//inputNum1이 2의 배수인가?
		/*
		 * boolean flagA=inputNum1%2==0; boolean flagB=inputNum2%3==0;
		 * System.out.println(flagA); System.out.println(flagB);
		 */
		//System.out.println(inputNum1%2==0);
		
		
		//일반논리연산자
		//비교연산자(논리값)를 두개이상 결합하는 결과!
		System.out.println();
		System.out.println("===일반논리연산자====");
		boolean flagC=true, flagD=false;
		System.out.println(flagC&&flagD);
		System.out.println(flagC||flagD);
		int age=19;
		char gender='남';
		boolean flagMili=true;
		System.out.println(age>19&&gender=='남'&&flagMili==true);
		System.out.println(age>19||gender=='남'||flagMili==true);
		///
		System.out.println("과연결과는????");
		System.out.println(age>19||gender=='남'&&flagMili==true);
		System.out.println(age>19&&(gender=='남'||flagMili==true));	
		
	}
	public void bitOper()
	{
		int a=10, b=22;
		String basic="00000000000000000000000000000000";
		String bit=basic+Integer.toBinaryString(a);
		//a비트값
		bit=bit.substring(bit.length()-32);
		System.out.println("a비트값 : "+bit);
		//b비트값
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println("b비트값 : "+bit);
		
		//a&b결과값
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println("a&b비트값 : "+bit);
		//a|b결과값
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println("a|b비트값 : "+bit);
		//a^b결과값
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println("a^b비트값 : "+bit);
		//~a결과값
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println("~a비트값 : "+bit);
		//a<<2
		bit=basic+Integer.toBinaryString(a<<2);
		bit=bit.substring(bit.length()-32);
		System.out.println("a<<2비트값 : "+bit);
		//a>>2
		bit=basic+Integer.toBinaryString(a>>2);
		bit=bit.substring(bit.length()-32);
		System.out.println("a>>2비트값 : "+bit);
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
		//사용자에게 정수 3개를 입력받고
		//입력받은 정수의 총합을 구하는 프로그램
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("1번정수입력 : ");
		sum+=sc.nextInt();//sum=sum+입력값
		System.out.print("2번정수입력 : ");
		sum+=sc.nextInt();
		System.out.print("3번정수입력 : ");
		sum+=sc.nextInt();
		System.out.println(sum);
		
	}
	public void thirdOper()
	{
		int a=20, b=30;
		
		/* String msg=a>b?"a가 b보다커":"b가 a보다 커"; */
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 수 입력(10이상의 수 입력) : ");
		int first=sc.nextInt();
		System.out.print("두번째 수 입력(10이상의 수 입력) : ");
		int second=sc.nextInt();
		
		String msg=first>=10&&second>=10?
				first>second?"첫번째수가 커":"두번째수가 커"
					:"야 내가 10보다 큰수입력하랬찌!!";
		System.out.println(msg);
		
		String name="유병승";
		System.out.println(name.equals("유병승"));
		System.out.println(name.equals("오건철"));
		System.out.println("김준영".equals("서현희"));
		
		
		
		
	}
	
	
	
	
	
}







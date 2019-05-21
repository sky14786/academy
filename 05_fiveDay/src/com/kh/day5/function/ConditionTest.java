package com.kh.day5.function;

import java.util.Scanner;

public class ConditionTest {

	public void condition()
	{
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력 : ");
		num=sc.nextInt();
		//조건문 if를 사용해보자!
		if(num>0)
		{
			System.out.println("출력1");
		}
		System.out.print("수를 입력 : ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("출력2");
		}
		System.out.print("수를 입력 : ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("출력3");
		}
		
		System.out.println("{}밖에 있는것!");
	}
	
	public void checkGender()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("당신의 성별은(남,여) : ");
		char gender=sc.next().charAt(0);
		
		if(gender=='남')
		{
			System.out.println("오른쪽으로 가세요!");
		}
		if(gender=='여')
		{
			System.out.println("왼쪽으로 가세요!");
		}
		
	}
	
	
	public void checkNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("정수하나를 입력하세요 : ");
		int su=sc.nextInt();
		if(su%2==0)
		{
			System.out.println("짝수입니다.");
		}
//		if(su%2!=0)//su%2==1
//		{
//			System.out.println("홀수입니다.");
//		}
		else {
			System.out.println("홀수입니다.");
		}
		//수학, 국어, 영어 성적계산
		System.out.print("수학점수 : ");
		int math=sc.nextInt();
		System.out.print("국어점수 : ");
		int kor=sc.nextInt();
		System.out.print("영어점수 : ");
		int eng=sc.nextInt();
		int sum=math+kor+eng;
		double avg=sum/3.0;
		if(sum>250)
		{
			System.out.println("우수생입니다");
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
		System.out.println("당신의 나이는?");
		int age=sc.nextInt();
		if(age>19) {
			System.out.println("젊을때 실컷노세요~~! ");
		}
		if(age<19||true)
		{
			System.out.println("이거는 실행이 되니?");
		}
		/*else {
			System.out.println("공부해야지요! ");
		}*/
	}
	public void calGrade()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("학년 ");
		int grade= sc.nextInt();
		System.out.println("반 ");
		int group= sc.nextInt();
		System.out.println("번호 ");
		int num= sc.nextInt();
		System.out.println("성별(M/F) ");
		char ch= sc.next().charAt(0);
		System.out.println("성적 ");
		double score= sc.nextDouble();
		
		String gender = " ";
		
		if(ch=='M') {
			gender = "남학생";
		}/*else if(ch=='F') {
			gender = "여학생";
		}*/else {
			gender = "여학생";
		}
		
		System.out.println(grade+"학년 "+group+"반 "+num
				+"번 "+gender+" "+name+"은 성적이 "+score+"이다.");
	}
	
	
	public void calGrade2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 : ");
		int kor=sc.nextInt();
		System.out.print("영어 : ");
		int eng=sc.nextInt();
		System.out.print("수학 : ");
		int math=sc.nextInt();
		int sum=kor+eng+math;
		double avg=sum/3.0;
		if((kor>=40&&eng>=40&&math>=40)||avg>60)
		{
			System.out.println("합격을 축하드립니다!");
		}
		else {
			System.out.println("불합격입니다.!");
		}
	}
	
	public void ifElesIfTest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("나이 : ");
		int age=sc.nextInt();
		if(age>19)
		{
			System.out.println("당신은 성인이네요! 한잔!?");
		}
		else if(age>=17)//== age<=19&&age>=17
		{
			System.out.println("당신은 고등학생!");
		}
		else if(age>=14)
		{
			System.out.println("당신은 중학생");
		}
		else if(age<=0)
		{
			System.out.println("나이는 음수가 없어요!");
		}
		else {
		  
			System.out.println("아가는 안돼!!!");
		}
		 
	}
	
	public void calProgram()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1=sc.nextInt();
		System.out.print("정수 2 : ");
		int num2=sc.nextInt();
		System.out.println("연산자입력(+,-,/,*) : ");
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
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
	}
	
	public void login()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디입력 : ");
		String id=sc.nextLine();
		System.out.println("패드워드입력 : ");
		String pw=sc.nextLine();
		if(id.equals("admin"))
		{
			if(pw.equals("1234"))
			{
				System.out.println("로그인 성공");
				System.out.println("====회원관리====");
				System.out.println("1.회원등록");
				System.out.println("2.회원검색");
				System.out.println("3.회원삭제");
			}
			else
			{
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
}











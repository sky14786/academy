package com.kh.controller;

import java.util.Scanner;

public class BreakContinueController {

	public void breakTest()
	{
		//break는 반복문이나 해당 실행하는 구문을 종료
		//반복문, switch문에 사용
		for(int i=0;;i++)
		{
			System.out.println(i);
			if(i==20) {
				break;
			}
		}
		
		while(true){
			System.out.println("===음식주문프로그램===");
			Scanner sc=new Scanner(System.in);
			System.out.println("1.돈까스덮밥");
			System.out.println("2.콩나물국밥");
			System.out.println("3.알탕");
			System.out.println("4.회덮밥");
			System.out.println("5.샌드위치");
			System.out.println("0.종료");
			System.out.print("입력 : ");
			int input=sc.nextInt();
			
			switch(input){
				case 1 : System.out.println("돈까스덮밥 주문완료");break;
				case 2 : System.out.println("콩나물국밥 주문완료");break;
				case 3 : System.out.println("알탕 주문완료");break;
				case 4 : System.out.println("회덮밥 주문완료");break;
				case 5 : System.out.println("샌드위치 주문완료");break;
				case 0 : System.out.println("프로그램을 종료합니다.");break;
				default : System.out.println("잘못누르셨습니다.");
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
		
		//랜덤값을 출력해보자
		for(int i=0;i<5;i++)
		{
			System.out.println((int)(Math.random()*60));
			//random*10 = 0~9임의의 수를 의미
			//0~59 ==random()*60
			
		}		
	}
	
	public void inputPerson()
	{
		Scanner sc=new Scanner(System.in);
		String person="";
		for(int i=0;i<5;i++)
		{
			System.out.print("이름 : ");
			String name=sc.nextLine();
			System.out.print("나이 : ");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.print("주소 : ");
			String address=sc.nextLine();
			System.out.print("키 : ");
			double height=sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight=sc.nextDouble();
			sc.nextLine();
			System.out.print("연락처 : ");
			String phone=sc.nextLine();
			person+=name+" "+age+" "+address+" "+height+" "+weight+" "+phone+"\n";
		}
		System.out.println("====입력정보출력====");
		System.out.println(person);			
	}
	
	
	public void inputPerson2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===회원등록프로그램===");
		System.out.print("등록할 회원수 입력 : ");
		int count=sc.nextInt();
		sc.nextLine();
		String members="";
		double avgAge=0.0,avgHeight=0.0, avgWeight=0.0;
		double sumAge=0,sumHeight=0,sumWeight=0;
				
		for(int i=0;i<count;i++)
		{
			System.out.print("이름 : ");
			String name=sc.nextLine();
			System.out.print("나이 : ");
			int age=sc.nextInt();
			sumAge+=age;
			sc.nextLine();
			System.out.print("주소 : ");
			String addr=sc.nextLine();
			System.out.print("키 : ");
			double height=sc.nextDouble();
			sumHeight+=height;
			System.out.print("몸무게 : ");
			double weight=sc.nextDouble();
			sumWeight+=weight;
			sc.nextLine();
			System.out.print("전화번호 : ");
			String phone=sc.nextLine();
			members+=name+" "+age+"살 "+addr+" "+height+"cm "+weight+"kg "+phone+"\n";
		}
		System.out.println("====등록된 회원=====");
		System.out.println(members);
		System.out.println("평균나이 : "+sumAge/count+
				"살 평균키 : "+sumHeight/count+
				"cm 평균몸무게 : "+sumWeight/count+"kg");
	}
	
	public void primeNum()
	{
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("정수입력 : ");
			int su=sc.nextInt();
			int count=0;//나머지가 0이 나오는 수의 갯수 체크
			if(su>=2){
				for(int i=0;i<su;i++)
				{
					if(su%(i+1)==0) {
						count++;
					}
				}
				if(count>2) {
					System.out.println("소수가 아니다");
				}
				else {
					System.out.println("소수다");
				}
			}
			else{
				
				System.out.print("잘못입력하셨습니다.");
			}
			System.out.print("계속진행하시겠습니까(Y/N)?");
			sc.nextLine();
			String go=sc.nextLine();
			//if(go.equals("N")||go.equals("n")){
			if(go.toUpperCase().equals("N")) {
				System.out.println("프로그램을 종료합니다.디리리링");
				break;
			}
		}
	}
	
	
}









package com.kh.array.Controller;

import java.util.Scanner;

public class ArrayController {

	public void arrayTest() {
		//배열선언!
		// 자료형[] 변수명;
		int[] intArr;
		char[] charArr;
		intArr=new int[5];
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
		int age=19;
		intArr[0]=age;
		intArr[1]=24;
		intArr[2]=27;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
		//System.out.println(intArr[5]);
				
		/*
		 * int a; System.out.println(a);
		 */
		//배열 선언과 동시에 초기화
		char[] ch= {'가','나','다','라','마','바'};
		System.out.println(ch[4]);
		ch[2]='하';
		System.out.println(ch[2]);
		System.out.println(ch);
		System.out.println(intArr);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(++intArr[i]);
		}
		
		/* for(int i=0;i<5;i++) */
		System.out.println("배열의 갯수 : "+intArr.length);
		System.out.println("배열의 갯수 : "+ch.length);
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=(i+1)*10;
			System.out.println(intArr[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<intArr.length;i++)
		{
			System.out.print("입력값은?");
			intArr[i]=sc.nextInt();
		}
		
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]);
		}
		
	}
	
	public void copy()
	{
		int[] intArr={1,2,3,4};
		int[] intCopy=intArr;
		System.out.println(intArr);
		System.out.println(intCopy);
		System.out.println("====intArr====");
		intArr[0]=100;
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]);
		}
		System.out.println("====intCopy====");
		for(int i=0;i<intCopy.length;i++)
		{
			System.out.println(intCopy[i]);
		}
	}
	
	public void test1(){
		//길이가 10인 배열을 선언하고
		int[] intArr=new int[10];
		//int[] intArr2={1,2,3,4,5,6,7,8,9,10};
		/*
		 * intArr[0]=1; intArr[1]=2; intArr[2]=3; intArr[3]=4; . . intArr[9]=10;
		 */
		//대입
//		int temp=1;
//		for(int i=0;i<10;i++)
//		{
//			intArr[i]=i++;//i+1, i*2;
//			temp++;//temp=temp+1;temp+=1;
//			//temp*=2;
//		}
		
		//출력
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(intArr[i]);
//		}
		
		
		/* System.out.println(intArr[0]); */
		
		
		String[] fruits= {"딸기","바나나","복숭아","키위","사과"};
		System.out.println(fruits[1]);
		//랜덤으로 값들이 들어갔다고 하고 
		//복숭아 위치와 값을 찾으세요
		String[] fruits2= {"바나나","딸기","키위","사과","복숭아"};
		Scanner sc=new Scanner(System.in);
		System.out.print("찾을 과일을 선택(바나나,딸기,복숭아,키위,사과) : ");
		String inputFruit=sc.next();
		
		for(int i=0;i<fruits2.length;i++)
		{
			//System.out.println(fruits2[i].equals("복숭아"));
			if(fruits2[i].equals(inputFruit))
			{
				System.out.println("위치 : "+i+" 값 : "+fruits2[i]);
			}
		}
		
		//5개 문자을 입력받을 배열선언
		char[] charaters=new char[5];
		charaters=new char[3];
		charaters=new char[8];
//		System.out.print("문자입력 : ");
//		charaters[0]=sc.next().charAt(0);
//		System.out.print("문자입력 : ");
//		charaters[1]=sc.next().charAt(0);
//		System.out.print("문자입력 : ");
//		charaters[2]=sc.next().charAt(0);
//		System.out.print("문자입력 : ");
//		charaters[3]=sc.next().charAt(0);
//		System.out.print("문자입력 : ");
//		charaters[4]=sc.next().charAt(0);
		for(int i=0;i<charaters.length;i++)
		{
			System.out.print("문자입력 : ");
			charaters[i]=sc.next().charAt(0);
		}
//		for(int i=0;i<charaters.length;i++)
		for(int i=(charaters.length-1);i>=0;i--)
		{
			System.out.println(charaters[i]);
		}
		//String name="유병승";
	}
	
	public void deepCopy() {
		int[] intArr= {1,2,3,4,5};
		//int[] copyArr=new int[8];
		int[] copyArr=new int[intArr.length];
		for(int i=0;i<intArr.length;i++)
		{
			copyArr[i]=intArr[i];
		}
		
		copyArr[3]=100;
		
		for(int i=0;i<intArr.length;i++)
		{
			System.out.print(intArr[i]);
			
		}
		System.out.print(" 주소 : "+intArr.hashCode());
		System.out.println();
		for(int i=0;i<copyArr.length;i++)
		{
			System.out.print(copyArr[i]);
		}
		System.out.print(" 주소 : "+copyArr.hashCode());
		
		System.out.println();
		// ArryCopy를 이용한 복사
		int[] copy2=new int[intArr.length];
		
		System.arraycopy(intArr, 3, copy2, 2, 2);
		
		for(int i=0;i<copy2.length;i++)
		{
			System.out.print(copy2[i]);
		}
		System.out.println("======clone cpoy=====");
		//clone()을 이용한 copy
		int[] copyArr3=new int[intArr.length];
		copyArr3=intArr.clone();
		for(int i=0;i<copyArr3.length;i++)
		{
			System.out.println(copyArr3[i]);
		}
		
		
		
		
	}
	
	
}









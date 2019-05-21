package com.kh.forinfor.controller;

public class ForInForController {

	public void basicTest()
	{
		//구구단
		for(int i=2;i<=9;i++)
		{
			System.out.println(i+"\t");
			for(int n=1;n<=9;n++)
			{
				System.out.print(i+"*"+n+"="+i*n+"\t");	
			}		
			System.out.println();
		}
		
		System.out.println("역순으로 출력하기");
		//역순으로 출력하기
		for(int i=9;i>1;i--)
		{
			for(int j=9;j>1;j--)
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("배열에서 중복값 확인하기");
		//각 인덱스에 있는값이 배열에 몇개나 중복되는지 확인
		int[] intArr= {1,1,2,3,4,5,5,6,6,6,6,3,2,1};
		for(int i=0;i<intArr.length;i++)
		{
			int value=intArr[i];
			int count=0;
			for(int j=0;j<intArr.length;j++)
			{
				if(value==intArr[j])
				{
					count++;
				}
			}
			System.out.print(count);
			if(count==1) {
				System.out.println();
				System.out.println(intArr[i]);
			}
		}
		System.out.println("forEach문!!");
		//for each문!
		//배열, Collection(List,Set, HashMap...)
		//for(int a : 배열)
//		for(int val : intArr)
//		{
//			//int value=val;
//			int count=0;
//			for(int val2 : intArr)
//			{
//				if(val==val2)
//				{
//					
//					count++;
//				}
//			}
//			System.out.print(count);
//		}
	}
	
	public void breakTest()
	{
		stop:
		for(int i=2;i<10;i++)
		{
			
			for(int j=1;j<10;j++)
			{
				if(j%2==0) break stop;
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println("여긴??");
		}
		System.out.println("이건출력");
	}
	
	
	
	
}






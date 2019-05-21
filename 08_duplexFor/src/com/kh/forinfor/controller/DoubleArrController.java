package com.kh.forinfor.controller;

import java.util.Scanner;

public class DoubleArrController {

	public void basicTest(){
		
		int[][] arr2=new int[5][5];
		/*
		 * arr2[0][0]=10; arr2[0][1]=20; arr2[0][2]=30; arr2[1][0]=40; arr2[1][1]=50;
		 * arr2[1][2]=60; arr2[2][0]=70; arr2[2][1]=80; arr2[2][2]=90;
		 */
		
		int value=1;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				arr2[i][j]=value++;
				
			}
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int n=0;n<arr2[i].length;n++)
			{
				System.out.print(arr2[i][n]+" ");
			}
			System.out.println();
		}
		
//		System.out.println(arr2[0][0]);
//		System.out.println(arr2[0][1]);
//		System.out.println(arr2[0][2]);
//		System.out.println(arr2[1][0]);
//		System.out.println(arr2[1][1]);
//		System.out.println(arr2[1][2]);
		
		
		
		System.out.println("연습하기!");
		int val=16;
		int[][] nums=new int[4][4];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++){
				nums[i][j]=val--;
			}
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++)
			{
				if(nums[i][j]<10)
					System.out.print(" "+nums[i][j]+" ");
				else System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void printStudent()
	{
		String[] students= {"홍길동","이순신","유관순","윤봉길"
				,"장영실","임걱정","장보고","이태백","김정희",
				"대조영","김유신","이사부"};
		
		String[][] bundan=new String[students.length/2][2];
		int num=0;
		//입력
		for(int i=0;i<bundan.length;i++)
		{
			for(int j=0;j<bundan[i].length;j++){
		
				bundan[i][j]=students[num++];
			}
		}
		//출력구문
		for(int i=0;i<bundan.length;i++)
		{
			if(i==0) System.out.println("=====1분단====");
			else if(i==3) System.out.println("====2분단====");
			for(int j=0;j<bundan[i].length;j++){
				System.out.print(bundan[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void variArr()
	{
		String[][] anmals=new String[3][];
		anmals[0]=new String[3];
		anmals[1]=new String[2];
		anmals[2]=new String[1];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<anmals.length;i++)
		{
			String anmal="";
			switch(i)
			{
				case 0 : anmal="포유류";break;
				case 1 : anmal="조류";break;
				case 2 : anmal="파충류";break;				
			}
			for(int j=0;j<anmals[i].length;j++)
			{
				System.out.print(anmal+"입력 : ");
				anmals[i][j]=sc.nextLine();
			}
			System.out.println();
		}
		System.out.print("출력을 원하는 동물(0.포유류 1.조류 3.파충류) : ");
		int choice=sc.nextInt();
		
		//출력
		for(int i=0;i<anmals.length;i++)
		{
			for(int j=0;j<anmals[i].length;j++)
			{
				if(i==choice)
				System.out.print(anmals[i][j]);
			}
		}
		
	}
	
	
}











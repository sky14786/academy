package com.kh.array.Controller;

import java.util.Scanner;

public class ArrayController {

	public void arrayTest() {
		//�迭����!
		// �ڷ���[] ������;
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
		//�迭 ����� ���ÿ� �ʱ�ȭ
		char[] ch= {'��','��','��','��','��','��'};
		System.out.println(ch[4]);
		ch[2]='��';
		System.out.println(ch[2]);
		System.out.println(ch);
		System.out.println(intArr);
		
		for(int i=0;i<5;i++)
		{
			System.out.println(++intArr[i]);
		}
		
		/* for(int i=0;i<5;i++) */
		System.out.println("�迭�� ���� : "+intArr.length);
		System.out.println("�迭�� ���� : "+ch.length);
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=(i+1)*10;
			System.out.println(intArr[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<intArr.length;i++)
		{
			System.out.print("�Է°���?");
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
		//���̰� 10�� �迭�� �����ϰ�
		int[] intArr=new int[10];
		//int[] intArr2={1,2,3,4,5,6,7,8,9,10};
		/*
		 * intArr[0]=1; intArr[1]=2; intArr[2]=3; intArr[3]=4; . . intArr[9]=10;
		 */
		//����
//		int temp=1;
//		for(int i=0;i<10;i++)
//		{
//			intArr[i]=i++;//i+1, i*2;
//			temp++;//temp=temp+1;temp+=1;
//			//temp*=2;
//		}
		
		//���
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(intArr[i]);
//		}
		
		
		/* System.out.println(intArr[0]); */
		
		
		String[] fruits= {"����","�ٳ���","������","Ű��","���"};
		System.out.println(fruits[1]);
		//�������� ������ ���ٰ� �ϰ� 
		//������ ��ġ�� ���� ã������
		String[] fruits2= {"�ٳ���","����","Ű��","���","������"};
		Scanner sc=new Scanner(System.in);
		System.out.print("ã�� ������ ����(�ٳ���,����,������,Ű��,���) : ");
		String inputFruit=sc.next();
		
		for(int i=0;i<fruits2.length;i++)
		{
			//System.out.println(fruits2[i].equals("������"));
			if(fruits2[i].equals(inputFruit))
			{
				System.out.println("��ġ : "+i+" �� : "+fruits2[i]);
			}
		}
		
		//5�� ������ �Է¹��� �迭����
		char[] charaters=new char[5];
		charaters=new char[3];
		charaters=new char[8];
//		System.out.print("�����Է� : ");
//		charaters[0]=sc.next().charAt(0);
//		System.out.print("�����Է� : ");
//		charaters[1]=sc.next().charAt(0);
//		System.out.print("�����Է� : ");
//		charaters[2]=sc.next().charAt(0);
//		System.out.print("�����Է� : ");
//		charaters[3]=sc.next().charAt(0);
//		System.out.print("�����Է� : ");
//		charaters[4]=sc.next().charAt(0);
		for(int i=0;i<charaters.length;i++)
		{
			System.out.print("�����Է� : ");
			charaters[i]=sc.next().charAt(0);
		}
//		for(int i=0;i<charaters.length;i++)
		for(int i=(charaters.length-1);i>=0;i--)
		{
			System.out.println(charaters[i]);
		}
		//String name="������";
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
		System.out.print(" �ּ� : "+intArr.hashCode());
		System.out.println();
		for(int i=0;i<copyArr.length;i++)
		{
			System.out.print(copyArr[i]);
		}
		System.out.print(" �ּ� : "+copyArr.hashCode());
		
		System.out.println();
		// ArryCopy�� �̿��� ����
		int[] copy2=new int[intArr.length];
		
		System.arraycopy(intArr, 3, copy2, 2, 2);
		
		for(int i=0;i<copy2.length;i++)
		{
			System.out.print(copy2[i]);
		}
		System.out.println("======clone cpoy=====");
		//clone()�� �̿��� copy
		int[] copyArr3=new int[intArr.length];
		copyArr3=intArr.clone();
		for(int i=0;i<copyArr3.length;i++)
		{
			System.out.println(copyArr3[i]);
		}
		
		
		
		
	}
	
	
}









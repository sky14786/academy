package com.kh.day2;

public class DeclareVariable {

	public void addValue()
	{
		//���� ���� �� �� �����ϱ�
		//����, ������ �� �����ϱ�
		boolean flag;
		flag=true;
		System.out.println(flag);
		flag=false;
		System.out.println(flag);
		//���ͷ����� ������ �ڷ����� ���� �ʾƼ� �����߻�!
		//flag=1000;
		//flag=tRue;
		//���Ϲ���
		char gender;
		gender='A';
		//gender="A";
		gender='B';
		gender='��';
		System.out.println(gender);
		//���ڿ��� �����غ���
		String msg;
		msg="�ȳ��ϼ��� ���� �������Դϴ�";
		System.out.println(msg);
		
		//���� 
		//���� / �Ǽ�
		byte bnum;
		short snum;
		int num;
		long lnum;
		
		bnum=100;
		System.out.println(bnum);
		snum=10000;
		//short�� ǥ���Ҽ� �ִ� ������ ����� 
		//���ͷ����̱� ������ �ڵ�����ȯ�� ���� ����		
		//snum=90000;����!
		
		System.out.println(snum);
		
		num=900000;
		System.out.println(num);
		lnum=9000;
		System.out.println(lnum);
		
		//�Ǽ�
		//float, double
		float fnum;//4byte
		double dnum;//8byte
		fnum=180.5f;//�⺻�ڷ����� double
		System.out.println(fnum);
		dnum=65.5;
		System.out.println(dnum);
		
		//
		System.out.println(65.5);
		
		System.out.println(800000*10);
		System.out.println(800000*20);
		System.out.println(800000*30);
		System.out.println(800000*40);
		System.out.println(800000*50);
		System.out.println(800000*60);
		System.out.println(800000*70);
		System.out.println(800000*80);
		
		num=900000;
		
		System.out.println(num*10);
		System.out.println(num*20);
		System.out.println(num*30);
		System.out.println(num*40);
		System.out.println(num*50);
		System.out.println(num*60);
		System.out.println(num*70);
		System.out.println(num*80);
		
		
		//����� ���� �� ����
		final int AGE;
		AGE=19;
		System.out.println(AGE);
		/* age=20; */
		//AGE=20;
		
		//���ڿ� ���� ��ȭ!
		String msg2="�ȳ�! ���� �������̾�";
		System.out.println(msg2);
		msg2=new String("�ȳ� �� �����̾�");
		System.out.println(msg2);
		//���ڿ����� +��ȣ�� ���Ῥ������ ���
		msg2="��������"+19+"�� �Դϴ�.";
		System.out.println(msg2);
		msg2="��������"+(19+1)+"���Դϴ�.";
		System.out.println(msg2);
		msg2=19+1+"�� ������!";
		System.out.println(msg2);
		
		String name="������";
		int age=19;
		String address="��⵵ �����";
		name="���ؿ�";
		
		
		String msg3="���� "+name+"�̴�."+"�� ���̴� "
		+age+"�̰� ���� ��°��� "+address;
		
		System.out.println(msg3);
		
		String memberName=name;
		//String memberName="���ؿ�";
		age=25;
		int plusAge=age+2;
		System.out.println(plusAge);
		
		//������ �����÷ο� �׽�Ʈ
		bnum=127;
		for(int i=0;i<300;i++)
		{
			System.out.println(bnum++);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}






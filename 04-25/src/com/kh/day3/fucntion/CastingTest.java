package com.kh.day3.fucntion;

public class CastingTest {
	public void castingTest() {
		// �ڵ�����ȯ
		int account = 1000;
		long accountVip;

		accountVip = account;
		// account �� int���̰� accountVip�� long������ �ڷ����� �ٸ���
		// accountVip�� ���ԵǾ����� account�� accountVip���� ũ�Ⱑ ���� �ڷ����̱� ������
		// �����Ϸ��� �ڵ����� ����ȯ�� ���ֱ� ������ ������ �����ϰ� �ȴ�.
		// ���ÿ��� �ڵ�����ȯ�� �ȴ�.
		int su = 10;
		double height = 180.5;
		double result = su + height;
		
		char ch='A';
		int character =ch;
		System.out.println(character);

	}
}

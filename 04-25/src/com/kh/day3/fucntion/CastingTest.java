package com.kh.day3.fucntion;

public class CastingTest {
	public void castingTest() {
		// 자동형변환
		int account = 1000;
		long accountVip;

		accountVip = account;
		// account 는 int형이고 accountVip는 long형으로 자료형이 다르나
		// accountVip에 대입되어지는 account는 accountVip보다 크기가 작은 자료형이기 때문에
		// 컴파일러가 자동으로 형변환을 해주기 때문에 대입이 가능하게 된다.
		// 계산시에도 자동형변환이 된다.
		int su = 10;
		double height = 180.5;
		double result = su + height;
		
		char ch='A';
		int character =ch;
		System.out.println(character);

	}
}

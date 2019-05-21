package com.kh.day2;

public class Run {

	public static void main(String[] args)
	{
		//변수선언
		//메소드내부(중괄호안), 클래스내부(중괄호안)
		//논리형 선언
		//이름 : boolean
		boolean flag;
		//단일문자
		//이름 : char
		char gender;
		
		//문자열
		//이름 : String
		String name;
		
		//숫자형(정수,실수)
		//정수
		//byte, short, int, long
		byte data;
		short num;
		int age;//default 자료형
		long account;
		
		//실수(소수점이 있는 숫자보관)
		//float, double
		float height;
		double weight;
		
		//아이디, 패스워드, 이름, 나이, 성별, 주소, 몸무게
		//키, 결혼여부
		String id;
		String password;
		String nAme;
		int memberAge;
		char memberGender;//'남','여','양'
		String address;
		float memberWeight;
		float memberHeight;
		boolean isMarried;
		//변수명 숫자 사용할수 없음 첫번째자리!
		//int 1num;
		//int 2num;
		int num1;
		//String 1name;
		String name1;
		float wei222ght;
		//특수문자는 _,$만 사용가능
		String name_member;
		int _height;
		double weight_;
		String name$member;
		int $height;
		double weight$;
		//다른 특수기호는 안됨
		/*String name!member;
		int !height;
		double weight!;
		*/
		
		//한글도 가능하다. 권장하지 않음!
		String 유병승;
		int 나이;
		
		//예약어는 안됨
		/*String class;
		int if;
		char break;*/
		
		new DeclareVariable().addValue();
		
	}
	
}








import java.util.Scanner;

public class Test(){
	public static void main(String[] args) {
		//두 수를 입력받아 두 수 사이의 합을 구하고, 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 1 입력 : ");
		int num = sc.nextInt();
		
		//첫번째수가 작음
		
		System.out.print("수 2 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0 ;
			
			
		
		for (int i = num  ; num <num2 ; num++  )
		{
			
		sum += i ;
			
		
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
////		System.out.print("문자열 하나를 입력하시오 : ");
////		String str = sc.nextLine();
//		System.out.print("0보다 큰 정수 하나 입력 : ");
//		int num = sc.nextInt();
//
////		String temp = "i am hungry";
////		temp.charAt(0);
//		// -> i
//
//		// 지정된 문자 aBz - > bCa 로 출력이 되야함.
//		// 소문자는 소문자로 대문자는 대문자로 되야대여
//		String str = "aBz";
//
////		int temp1 = word1+num;
//
//		for (int i = 0; i <= 2; i++) {
//			char word1 = str.charAt(i);
//			System.out.println((char) (i + 1));
//		System.out.println(149 % 25);
		
//		System.out.print("문자열 입력");
//		String a=sc.nextLine();
//		System.out.print("정수 입력");
//		int b=sc.nextInt();
//		for(int i=0;i<=a.length();i++) {
//			char num=a.charAt(i);
//			char newNum=(char)(num+b);
//			System.out.print(newNum+" ");
//			continue;
//	}
//	}
}
}
import java.util.Scanner;

public class Test(){
	public static void main(String[] args) {
		//�� ���� �Է¹޾� �� �� ������ ���� ���ϰ�, ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� 1 �Է� : ");
		int num = sc.nextInt();
		
		//ù��°���� ����
		
		System.out.print("�� 2 �Է� : ");
		int num2 = sc.nextInt();
		
		int sum = 0 ;
			
			
		
		for (int i = num  ; num <num2 ; num++  )
		{
			
		sum += i ;
			
		
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
////		System.out.print("���ڿ� �ϳ��� �Է��Ͻÿ� : ");
////		String str = sc.nextLine();
//		System.out.print("0���� ū ���� �ϳ� �Է� : ");
//		int num = sc.nextInt();
//
////		String temp = "i am hungry";
////		temp.charAt(0);
//		// -> i
//
//		// ������ ���� aBz - > bCa �� ����� �Ǿ���.
//		// �ҹ��ڴ� �ҹ��ڷ� �빮�ڴ� �빮�ڷ� �Ǿߴ뿩
//		String str = "aBz";
//
////		int temp1 = word1+num;
//
//		for (int i = 0; i <= 2; i++) {
//			char word1 = str.charAt(i);
//			System.out.println((char) (i + 1));
//		System.out.println(149 % 25);
		
//		System.out.print("���ڿ� �Է�");
//		String a=sc.nextLine();
//		System.out.print("���� �Է�");
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
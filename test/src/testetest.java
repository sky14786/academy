import java.util.Scanner;

public class testetest {

	// 2개의 정수를 입력받아 해당 정수 사이의 값들을 더하되 정수가 2의 배수일 경우 합하지 마시오
	// ex) 정수1 : 2 정수2 : 7 3+5+7 sum=15

	public static void main(String[] args) {
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력해주세요 : ");
		a = sc.nextInt();
		System.out.print("정수 하나를 입력해주세요 : ");
		b = sc.nextInt();
		sum = 0;

		for (int i = a; i <= b; i++) {
			for(int j=1;j<=9;j++) {
				if((i*j)%2!=0) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
		}
	}

}

import java.util.Scanner;

public class MoneyEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("A의 연봉을 입력하세요 : ");
		a = sc.nextInt();
		System.out.print("B의 연봉을 입력하세요 : ");
		b = sc.nextInt();
		System.out.print("C의 연봉을 입력하세요 : ");
		c = sc.nextInt();

		System.out.println("회사 연봉의 총합은 : " + (a + b + c) + "만원");
		System.out.println("회사 연봉의 평균은 : " + (double) ((a + b + c) / 3) + "만원");

		a += a * 0.05;
		c += c * 0.01;

		System.out.println("A의 인센티브 포함 급여는 : " + a + "만원" + (a >= 3000 ? "한턱쏴" : "내가살게!"));
		System.out.println("B의 인센티브 포함 급여는 : " + b + "만원" + (b >= 3000 ? "한턱쏴" : "내가살게!"));
		System.out.println("C의 인센티브 포함 급여는 : " + c + "만원" + (c >= 3000 ? "한턱쏴" : "내가살게!"));
 
	}

}

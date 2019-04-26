import java.util.Scanner;

public class AgeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println(age < 19 ? "미성년자 입니다." : "성인입니다 들어오세요");
		
		sc.nextLine();

		System.out.print(age>19?"성별을 입력하세요 (ex. 남자 여자)":"프로그램을 종료합니다.");
		System.out.println(age>19?(sc.nextLine().equals("남자") ? "왼쪽으로 가세요" : "오른쪽으로 가세요"):"프로그램을 종료합니다");

	}

}

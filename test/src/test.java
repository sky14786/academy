import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		login();
	}

	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("패스워드 입력 : ");
		String pw = sc.nextLine();
		if (id.equals("admin")) {
			if (pw.equals("1234")) {
				System.out.println("로그인 성공");
				System.out.println("====회원관리====");
				System.out.println("1.회원등록");
				System.out.println("2.회원검색");
				System.out.println("3.회원삭제");
			} else {
				System.out.println("비밀번호가 틀렸스니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}

	}
}
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		login();
	}

	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine();
		System.out.print("�н����� �Է� : ");
		String pw = sc.nextLine();
		if (id.equals("admin")) {
			if (pw.equals("1234")) {
				System.out.println("�α��� ����");
				System.out.println("====ȸ������====");
				System.out.println("1.ȸ�����");
				System.out.println("2.ȸ���˻�");
				System.out.println("3.ȸ������");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}

	}
}
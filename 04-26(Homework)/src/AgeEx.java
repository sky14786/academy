import java.util.Scanner;

public class AgeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.println(age < 19 ? "�̼����� �Դϴ�." : "�����Դϴ� ��������");
		
		sc.nextLine();

		System.out.print(age>19?"������ �Է��ϼ��� (ex. ���� ����)":"���α׷��� �����մϴ�.");
		System.out.println(age>19?(sc.nextLine().equals("����") ? "�������� ������" : "���������� ������"):"���α׷��� �����մϴ�");

	}

}

import java.util.Scanner;

public class MoneyEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("A�� ������ �Է��ϼ��� : ");
		a = sc.nextInt();
		System.out.print("B�� ������ �Է��ϼ��� : ");
		b = sc.nextInt();
		System.out.print("C�� ������ �Է��ϼ��� : ");
		c = sc.nextInt();

		System.out.println("ȸ�� ������ ������ : " + (a + b + c) + "����");
		System.out.println("ȸ�� ������ ����� : " + (double) ((a + b + c) / 3) + "����");

		a += a * 0.05;
		c += c * 0.01;

		System.out.println("A�� �μ�Ƽ�� ���� �޿��� : " + a + "����" + (a >= 3000 ? "���ν�" : "�������!"));
		System.out.println("B�� �μ�Ƽ�� ���� �޿��� : " + b + "����" + (b >= 3000 ? "���ν�" : "�������!"));
		System.out.println("C�� �μ�Ƽ�� ���� �޿��� : " + c + "����" + (c >= 3000 ? "���ν�" : "�������!"));
 
	}

}

import java.util.Scanner;

public class testetest {

	// 2���� ������ �Է¹޾� �ش� ���� ������ ������ ���ϵ� ������ 2�� ����� ��� ������ ���ÿ�
	// ex) ����1 : 2 ����2 : 7 3+5+7 sum=15

	public static void main(String[] args) {
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է����ּ��� : ");
		a = sc.nextInt();
		System.out.print("���� �ϳ��� �Է����ּ��� : ");
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

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();

		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			// �ҹ��� 97 ~ 122 (a~z) �빮�� 65 ~ 90 A~Z
			if (str.charAt(i) != ' ') {
				num %= 26;
				if (temp >= 65 && temp <= 90) {
					temp += num;
					if (temp > 90) {
						temp -= 26;
					}
				} else if (temp >= 97 && temp <= 122) {
					temp += num;
					if (temp > 122) {
						temp -= 26;
					}
				}
				System.out.print((char) temp);
			} else {
				System.out.print(str.charAt(i));
			}

		}
	}
	  public void prac01() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("������ �Է��ϼ��� : ");
	      String str = sc.nextLine();
	      System.out.println("�󸶳� �а�? ");
	      int plus = sc.nextInt();
	      int nmg = plus%26;
	      int result = 0;
	      
	      for(int i=0; i<str.length(); i++) {
	         int strCh = str.charAt(i);
	         if((char)strCh!=' ') {
	            if((strCh>=65&&strCh<=90)||(strCh>=97&&strCh<=122)) {
	               result = str.charAt(i)+nmg;
	               if((result>=65&&result<=90)||(result>=97&&result<=122)){
	                  System.out.print((char)(result));
	               }else {
	                  result=result-26;
	                  System.out.println((char)(result));
	               }
	            }else {
	               System.out.println("���ĺ��� �Է��ϼ���.");
	            }
	         }else{
	            System.out.print((char)(strCh));
	         }
	      }
	   }

}
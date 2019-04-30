import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();

		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			// 소문자 97 ~ 122 (a~z) 대문자 65 ~ 90 A~Z
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
	      System.out.println("문장을 입력하세요 : ");
	      String str = sc.nextLine();
	      System.out.println("얼마나 밀거? ");
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
	               System.out.println("알파벳만 입력하세요.");
	            }
	         }else{
	            System.out.print((char)(strCh));
	         }
	      }
	   }

}
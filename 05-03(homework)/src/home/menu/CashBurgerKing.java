package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		int input, input2, result = 0;
		String list = "";

		System.out.println("햄버거 ***************");
		System.out.println("1. 불고기버거	3500원");
		System.out.println("2. 치킨버거	3200원");
		System.out.println("추가 ****************");
		System.out.println("3. 감자튀김	1000원");
		System.out.println("4. 치즈스틱	400원");
		System.out.println("5. 샐러드		2000원");
		System.out.println("음료수 ***************");
		System.out.println("6. 콜라		700원");
		System.out.println("7. 에이드		1200원");
		System.out.println("8. 커피		1000원");
		System.out.println("********************");

		while (true) {
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();

			switch (input) {
			case 1: {
				System.out.println("불고기버거를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 3500);
				list += "불고기버거 : " + input2 + "개 - " + (input2 * 3500) + "원 \n";
				break;
			}
			case 2: {
				System.out.println("치킨버거를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 3200);
				list += "치킨버거 : " + input2 + "개 - " + (input2 * 3200) + "원 \n";
				break;
			}
			case 3: {
				System.out.println("감자튀김를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 1000);
				list += "감자튀김 : " + input2 + "개 - " + (input2 * 1000) + "원 \n";
				break;
			}
			case 4: {
				System.out.println("치즈스틱를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 400);
				list += "치즈스틱 : " + input2 + "개 - " + (input2 * 400) + "원 \n";
				break;
			}
			case 5: {
				System.out.println("샐러드를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 2000);
				list += "샐러드 : " + input2 + "개 - " + (input2 * 2000) + "원 \n";
				break;
			}
			case 6: {
				System.out.println("콜라를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 700);
				list += "콜라 : " + input2 + "개 - " + (input2 * 700) + "원 \n";
				break;
			}
			case 7: {
				System.out.println("에이드를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 1200);
				list += "에이드 : " + input2 + "개 - " + (input2 * 1200) + "원 \n";
				break;
			}
			case 8: {
				System.out.println("커피를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				input2 = sc.nextInt();
				System.out.println(input2 + "개 주문하셨습니다.");
				result += (input2 * 1000);
				list += "커피 : " + input2 + "개 - " + (input2 * 1000) + "원 \n";
				break;
			}
			}

			System.out.print("추가 주문 하시겠습니까?(y/n)");
			char go = sc.next().charAt(0);
			if (go == 'n' || go == 'n') {
				break;
			}
		}

		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("--------------------------------------");
		System.out.print(list);
		System.out.println("----------------------------------------");
		System.out.println("총 가격 : " + result + "원");
	}
}

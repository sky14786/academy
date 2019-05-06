package test.array.permitive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		int[] arr = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}

	public void test2() {
		int[] arr = new int[10];
		int min = 0, max = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
	}

	public void test3() {
		byte[] arr = new byte[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (byte) ((byte) (Math.random() * 127) + 1);
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}

		}
		System.out.println("합계 : " + sum);

	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		int[] arr = new int[str.length()];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str.substring(i, (i + 1)));
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		int sum = 0;
		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			System.out.println((int)str.charAt(i));
			arr[i] = str.charAt(i) - '0';
			sum += arr[i];
		}
		System.out.println("합계 :" + sum);
	}

	public void test6() throws ParseException {
		String day = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하시오 : ");
		String input = sc.nextLine();
		String[] info = new String[4];

		info[0] = input.substring(0, 2); // 생년
		info[1] = input.substring(2, 4); // 생월
		info[2] = input.substring(4, 6); // 생일
		info[3] = input.substring(8, 9); // 성별
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date nDate = dateFormat.parse(19 + info[0] + info[1] + info[2]);
		Calendar cal = Calendar.getInstance();
		cal.setTime(nDate);
		Calendar cal2 = Calendar.getInstance();

		int dayNum = cal.get(Calendar.DAY_OF_WEEK);

		switch (dayNum) {
		case 1:
			day = "일";
			break;
		case 2:
			day = "월";
			break;
		case 3:
			day = "화";
			break;
		case 4:
			day = "수";
			break;
		case 5:
			day = "목";
			break;
		case 6:
			day = "금";
			break;
		case 7:
			day = "토";
			break;
		}
		System.out.println("생일의 요일은 : " + day + "요일");
		System.out.println("성별 : " + (info[3].equals("1") ? "남자" : "여자"));
		System.out.println("나이 : " + (cal2.get(Calendar.YEAR) - cal.get(Calendar.YEAR) + 1));

	}
}

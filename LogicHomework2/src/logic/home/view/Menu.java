package logic.home.view;

import java.util.Scanner;

import logic.home.model.*;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	static int inputNumber = 0;

	public static void mainMenu() {
		char checkExit = 'n';
		do {
			System.out.println("***** ���α׷��� �⺻ ��� �׽�Ʈ ���α׷� *****\n");
			System.out.println("1. ���� �׽�Ʈ");
			System.out.println("2. �⺻ �ڷ��� �׽�Ʈ");
			System.out.println("3. if�� �׽�Ʈ");
			System.out.println("4. switch�� �׽�Ʈ");
			System.out.println("5. for�� �׽�Ʈ");
			System.out.println("6. while�� �׽�Ʈ");
			System.out.println("7. do~while�� �׽�Ʈ");
			System.out.println("8. break�� �׽�Ʈ");
			System.out.println("9. continue�� �׽�Ʈ");
			System.out.println("10. static �޼ҵ� ��� �׽�Ʈ");
			System.out.println("11. non-static �޼ҵ� ��� �׽�Ʈ");
			System.out.println("12. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			inputNumber = sc.nextInt();

			switch (inputNumber) {
			case 1:
				subVarMenu();
				break;
			case 2:
				subPTypeMenu();
				break;
			case 3:
				subIfMenu();
				break;
			case 4:
				subSwitchMenu();
				break;
			case 5:
				subForMenu();
				break;
			case 6:
				subWhileMenu();
				break;
			case 7:
				subDoWhileMenu();
				break;
			case 8:
				subBreakMenu();
				break;
			case 9:
				subContinueMenu();
				break;
			case 10:
				subStaticMethodMenu();
				break;
			case 11:
				subNonStaticMethodMenu();
				break;
			case 12:
				System.out.print("������ ���� �Ͻðڽ��ϱ�? (y/n) : ");
				checkExit = sc.next().charAt(0);
				break;
			}
		} while (checkExit == 'n' || checkExit == 'n');
	}

	public static void subVarMenu() {
		VariableSample variableSample = new VariableSample();
		int input = 0;
		do {
			System.out.println("*** ���� �׽�Ʈ �θ޴� ***");
			System.out.println("1. �� �Ż����� ������ ��� ����ϱ�");
			System.out.println("2. ��������� Ű����� �Է¹޾� ����ϱ�");
			System.out.println("3. �⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				variableSample.myProfile();
				break;
			case 2:
				variableSample.empInformation();
				break;
			case 3:
				variableSample.defaultValue();
				break;
			}

		} while (input != 4);
	}

	public static void subPTypeMenu() {
		PrimitiveTypeSample primitiveTypeSample = new PrimitiveTypeSample();
		int input = 0;
		do {
			System.out.println("*** �⺻�ڷ��� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. �⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ�");
			System.out.println("2. �⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ�");
			System.out.println("3. �⺻�ڷ��� ��Ʈ���� Ȯ���ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				primitiveTypeSample.typeSize();
				break;
			case 2:
				primitiveTypeSample.minMaxValue();
				break;
			case 3:
				primitiveTypeSample.bitSize();
				break;
			}
		} while (input != 4);
	}

	public static void subIfMenu() {
		IfSample ifSample = new IfSample();
		int input = 0;
		do {
			System.out.println("*** if�� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. �� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�");
			System.out.println("2. �� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�");
			System.out.println("3. �� ���� ������ �Է¹޾�, �� ���� ���� ū���� ���� ������ ����ϱ�");
			System.out.println("4. �� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�");
			System.out.println("5. ��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�");
			System.out.println("6. ������ �Է¹޾�, ���� Ȯ���ϱ�");
			System.out.println("7. �� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�");
			System.out.println("8. ���� �ϳ��� �Է¹޾�, ����빮������ �ҹ������� ���ڹ������� ��Ÿ�������� Ȯ���ϱ�");
			System.out.println("9. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				ifSample.maxNumber();
				break;
			case 2:
				ifSample.minNumber();
				break;
			case 3:
				ifSample.threeMaxMin();
				break;
			case 4:
				ifSample.checkEven();
				break;
			case 5:
				ifSample.isPassFail();
				break;
			case 6:
				ifSample.scoreGrade();
				break;
			case 7:
				ifSample.checkPlusMinusZero();
				break;
			case 8:
				ifSample.whatCharacter();
				break;
			}
		} while (input != 9);
	}

	public static void subSwitchMenu() {
		SwitchSample switchSample = new SwitchSample();
		int input = 0;
		do {
			System.out.println("*** switch�� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. �� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�");
			System.out.println("2. �����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�");
			System.out.println("3. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				switchSample.calculator();
				break;
			case 2:
				switchSample.fruitPrice();
				break;
			}
		} while (input != 3);
	}

	public static void subForMenu() {
		ForSample forSample = new ForSample();
		int input = 0;
		do {
			System.out.println("*** for�� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. 1~10���� �������� �հ� ���ϱ�");
			System.out.println("2. 1~100������ ¦������ �հ� ���ϱ�");
			System.out.println("3. ���� �ϳ� �Է¹޾�, �� ���� ������ ����ϱ�");
			System.out.println("4. �� ���� ������ �Է¹޾�, �� ���� ���� ������ ū �������� �հ� ���ϱ�");
			System.out.println("5. �ټ��� ĭ�� �Է¹޾�, �Էµ� �ټ�/ĭ����ŭ ��ǥ���� ����ϱ�");
			System.out.println("6. 7�ٿ� 7ĭ�� ��ǥ���� ����ϵ�, �� �ٿ� �ٹ�ȣ�� ���� ĭ�� ���� ����ϱ�");
			System.out.println("7. �ټ��� �Է¹޾�, �ﰢ�� ������� ��ǥ���� ����ϱ�(���:�����ﰢ��, ����:���ﰢ��)");
			System.out.println("8. ������ 2�ܺ��� 9�ܱ��� ����ϱ�");
			System.out.println("9. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				forSample.sum1To10();
				break;
			case 2:
				forSample.sumEven1To100();
				break;
			case 3:
				forSample.oneGugudan();
				break;
			case 4:
				forSample.sumMinToMax();
				break;
			case 5:
				forSample.printStart();
				break;
			case 6:
				forSample.printNumberStar();
				break;
			case 7:
				forSample.printTriangleStar();
				break;
			case 8:
				forSample.guguDan();
				break;

			}

		} while (input != 9);
	}

	public static void subWhileMenu() {
		WhileSample whileSample = new WhileSample();
		int input = 0;
		do {
			System.out.println("*** while�� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. ���� �ϳ� �Է¹޾�, �� ������ �����ڵ� ��� �ݺ�(\'0\' �ԷµǸ� �ݺ�����");
			System.out.println("2. 1~100���� �������� �հ� ����ϱ�(while������ �ۼ�)");
			System.out.println("3. 1~100������ ������ ������ �߻�����, ���� �˾Ƹ��߱�");
			System.out.println("4. ���ڿ��� �Է¹޾�, ���� ���� �˾Ƴ��� ����ϱ�");
			System.out.println("5. ���ڿ����� ���� �ϳ��� �Է¹޾�, ���ڿ��� ���ڰ� �� �� �ִ��� Ȯ���ϱ�");
			System.out.println("6. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				whileSample.printUniCode();
				break;
			case 2:
				whileSample.sum1To100();
				break;
			case 3:
				whileSample.numberGame();
				break;
			case 4:
				whileSample.countCharacter();
				break;
			case 5:
				whileSample.countInChar();
				break;
			}
		} while (input != 6);
	}

	public static void subDoWhileMenu() {
		DoWhileSample doWhileSample = new DoWhileSample();
		int input = 0;
		do {
			System.out.println("*** do~while�� �׽�Ʈ �θ޴�***\n");
			System.out.println("1. ���ڿ��� �Է¹޾�, ���� ���̿� \'-\'�����־� ����ϱ�");
			System.out.println("2. ����ŷ �޴� �ֹ� �׽�Ʈ");
			System.out.println("3. ���ڿ� �Է¹޾�, \"��� ���� �����ڴ�\"\\\"������ �ƴϴ�.\"����ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				doWhileSample.addDashToken();
				break;
			case 2:
				doWhileSample.burgerKingMenu();
				break;
			case 3:
				doWhileSample.isStringAlphabet();
				break;
			}
		} while (input != 4);
	}

	public static void subBreakMenu() {
		BreakSample breakSample = new BreakSample();
		int input = 0;
		do {
			System.out.println("*** break�� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. 1~100���� �������� �հ� ����ϱ�(break�� ���)");
			System.out.println("2. ������ 1��~9�ܱ��� ����ϵ�, * 5 ��꿡�� �ݺ��� ������(break �̸� ���)");
			System.out.println("3. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				breakSample.sumBreak();
				break;
			case 2:
				breakSample.guguDanBreak();
				break;

			}
		} while (input != 3);
	}

	public static void subContinueMenu() {
		ContinueSample continueSample = new ContinueSample();
		int input = 0;
		do {
			System.out.println("*** continue�� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. 1~100������ ���� �� 3�� ����� �� �������� �հ� ����ϱ�");
			System.out.println("2. 3�� 5���� �࿭�� ����ϵ�, 1�� 3������ 1�� 5������ �����ϰ� ����ϱ�");
			System.out.println("3. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				continueSample.sumJumpThree();
				break;
			case 2:
				continueSample.rowColJump();
				break;

			}
		} while (input != 3);
	}

	public static void subStaticMethodMenu() {
		StaticMethodSample staticMetohdSample = new StaticMethodSample();
		int input = 0;
		do {
			System.out.println("*** static �޼ҵ� ��� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. Math Ŭ������ ������ ���ϴ� �޼ҵ� : 1~45������ ������ ���� ���");
			System.out.println("2. Math Ŭ������ �Ǽ����� ���� ���밪 ���ϴ� �޼ҵ� : -12.77 ���밪 ����ϱ�");
			System.out.println("3. Math Ŭ������ �� ������ ū�� ���ϴ� �޼ҵ� : 120, 54 �� ū�� ����ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				staticMetohdSample.testMathRandom();
				break;
			case 2:
				staticMetohdSample.testMathAbs();
				break;
			case 3:
				staticMetohdSample.testMathMax();
				break;

			}
		} while (input != 4);
	}

	public static void subNonStaticMethodMenu() {
		NonStaticMethodSample nonStaticMethodSample = new NonStaticMethodSample();
		int input = 0;
		do {
			System.out.println("*** non-static �޼ҵ� ��� �׽�Ʈ �θ޴� ***\n");
			System.out.println("1. Scanner Ŭ���� ��� : �ڷ��� ��������  �� �Է¹޾� ����ϱ�");
			System.out.println("2. Date Ŭ���� ��� : ���� ��¥, ���� �ð� ���� ����ϱ� ");
			System.out.println("3. Random Ŭ���� ��� : ������ �Ǽ��� ���� ���� ����ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				nonStaticMethodSample.testScanner();
				break;
			case 2:
				nonStaticMethodSample.testDate();
				break;
			case 3:
				nonStaticMethodSample.testRandom();
				break;

			}
		} while (input != 4);
	}
}

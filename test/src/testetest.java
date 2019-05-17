import java.util.ArrayList;

public class testetest {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(n) > strings[j].charAt(n)) {
					String temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				} else if (strings[i].charAt(n) == strings[j].charAt(n)) {
					if (strings[i].compareTo(strings[j]) < 0) {
						String temp = strings[i];
						strings[i] = strings[j];
						strings[j] = temp;
					}
				}
			}
		}

		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i];
		}

		return answer;
	}

	public String solution(String s) {
		String answer = "";

		String[] aaa = s.split(" ");

		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[i].length(); j++) {
				if (j % 2 == 0) {
					answer += String.valueOf(aaa[i].charAt(j)).toUpperCase();
				} else {
					answer += String.valueOf(aaa[i].charAt(j)).toLowerCase();
				}
			}
			answer += " ";
		}
		answer = answer.substring(0, answer.length() - 1);
		return answer;
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = new int[(commands[i][1] - commands[i][0]) + 1];
			int count = 0;
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++, count++) {
				temp[count] = array[j];
			}
			for (int a = 0; a < temp.length; a++) {
				for (int b = a; b < temp.length; b++) {
					if (temp[a] < temp[b]) {
						int tt = temp[a];
						temp[a] = temp[b];
						temp[b] = tt;
					}
				}
			}
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}
}

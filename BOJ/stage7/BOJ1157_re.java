package stage7;

import java.util.Scanner;
//단어 공부
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
public class BOJ1157_re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];

		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 65]++;
			} else {
				arr[s.charAt(i) - 97]++;
			}
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}

		System.out.println(ch);
	}

}

package stage7;

import java.util.Scanner;

public class BOJ10809_re {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		String S = sc.nextLine();

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			
			// 동일한 문자가 포함되어있을 경우 -> 처음 나타난 위치로
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}

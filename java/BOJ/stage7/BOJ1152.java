package stage7;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

//단어의 개수
public class BOJ1152 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		sc.close();

		// 1. StringTokenizer의 토큰 개수
		StringTokenizer st = new StringTokenizer(s, " ");

		System.out.println(st.countTokens());

		// 2. charAt통한 공백검사(원시입력)
		int count = 0;
		int blank = 32;
		int str;

		while (true) {
			str = System.in.read();

			// 입력받은 문자가 공백이면
			if (blank == 32) {
				if (blank != 32)
					count++;
			}

			// 입력받은 문자가 개행이면('\n')
			else if (str == 10) {

				if (blank != 32)
					count++;
				break;
			}
		}

		System.out.println(count);

		// 3. spilt, trim 사용

	}
}

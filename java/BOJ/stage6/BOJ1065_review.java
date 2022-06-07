package stage6;

import java.util.Scanner;

public class BOJ1065_review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(seq(sc.nextInt()));
		sc.close();
	}

	public static int seq(int num) {
		int count = 0;

		if (num < 100) {
			return num;
		}

		else {

			count = 99;
			if (num == 1000) {
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}

		return count;

	}

}

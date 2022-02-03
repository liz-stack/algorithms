package stage2;

import java.util.Scanner;

//윤년이면 1, 아니면 0을 출력한다.
//윤년은 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일 때를 의미
public class BOJ2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// 답안
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

		// 풀어쓴 것
		if (year%4 == 0) {
			if (year%400 == 0 ) {
				System.out.println(1);
			} else if (year%100 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		} else {
			System.out.println(0);
		}

	}
}

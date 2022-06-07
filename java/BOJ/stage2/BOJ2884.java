package stage2;

import java.util.Scanner;

//알람 시계
public class BOJ2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		/*
		 * if (m < 45) { if (h < 1) { h = 23; System.out.println(h + " " + (60 - (45 -
		 * m))); } else { System.out.print((h - 1) + " " + (60 - (45 - m))); }
		 * 
		 * } else if (m >= 45) { System.out.print(h + " " + (m - 45)); }
		 */

		// 코드최적화
		if (m < 45) {
			h--;
			m = 60 - (45 - m);
			
			if (h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);

		} else {
			System.out.print(h + " " + (m - 45));
		}

	}
}

package stage3;

import java.util.Scanner;

//A + B -3
public class BOJ10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
	
		
		for (int i = 1; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}
		
		sc.close();
	}

}

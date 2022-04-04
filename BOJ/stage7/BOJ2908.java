package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2908 {
	public static void main(String[] args) throws IOException {

		// 1.Scanner + StringBuilder.reverse()

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		StringBuilder sb = new StringBuilder();

		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		// toString() : StringBuilder타입을 문자열로 반환 B= Integer.parseInt(new

		System.out.println((A > B) ? A : B);

		// 2. BufferedReader, StringBuilder.reverse()

		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 * 
		 * int A = Integer.parseInt(new
		 * StringBuilder(st.nextToken()).reverse().toString()); int B =
		 * Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 * 
		 * System.out.println(A > B ? A : B);
		 */

	}
}

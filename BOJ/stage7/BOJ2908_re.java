package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//상수_다시풀기
public class BOJ2908_re {

	public static void main(String[] args) throws IOException {
		// 1. scanner + Stringbuilder.reverse()
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int A = sc.nextInt(); int B = sc.nextInt();
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * A = Integer.parseInt(new StringBuilder().append(A).reverse().toString()); B =
		 * Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		 * 
		 * System.out.println(A > B ? A : B);
		 */

		// 2. bufferedReader + Stringbuilder.reverse() + Stringtokenizer()
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

		System.out.println(A > B ? A : B);

	}

}

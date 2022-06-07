package stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//더하기 사이클
public class BOJ1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int N = sc.nextInt(); int copy = N; int count = 0;
		 * 
		 * while (true) { N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10; count++;
		 * 
		 * if (copy == N) { break; } } System.out.println(count);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int copy = N;

		do {
			N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
			count++;
		} while (copy != N);
		System.out.println(count);

	}
}

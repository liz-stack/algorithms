package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//별찍기 -2
public class BOJ2439 {

	public static void main(String[] args) throws IOException {

		// 1.Scanner사용
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt();
		 * 
		 * for (int i = 1; i <= n; i++) { for (int j = n; j > i; j--) {
		 * System.out.print(" "); } for(int k=1;k<=i;k++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

		// 2.BufferedReader사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				bw.write(" ");
			}
			for (int k = 1; k <= i; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

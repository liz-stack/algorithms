package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//A+B-7
public class BOJ11021 {

	public static void main(String[] args) throws IOException {
		// 1.Scanner사용
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int T = sc.nextInt();
		 * 
		 * for (int i = 1; i <= T; i++) { int A = sc.nextInt(); int B = sc.nextInt();
		 * System.out.println("Case #" + i + ": " + (A + B)); }
		 */

		// 2.BufferedReader,Writer 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			
			st= new StringTokenizer(br.readLine(), " ");

			bw.write("Case #" + i + ": "
			+( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
		}

		bw.flush();
	}

}

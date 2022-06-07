package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//빠른 A+B
public class BOJ15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		/* 1. StringTokenizer 사용시
		 * for(int i=1;i<=T;i++){ st = new StringTokenizer(br.readLine());
		 * bw.write(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())
		 * +"\n");; }
		 */

		// 2.spilt 사용시
		for (int i = 1; i <= T; i++) {
			String[] s = br.readLine().split(" ");

			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			bw.write(a+b+"\n");
		}

		br.close();
		bw.flush();
		bw.close();

	}

}

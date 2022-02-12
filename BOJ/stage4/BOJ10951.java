package stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A+B -4 while문 사용
public class BOJ10951 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;

		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append((a + b)).append("\n");
		}
		System.out.println(sb);
	} //에러나는데 이유를 못찾았음. Scanner 방식으로 내일 해볼 것 + 지우고 다시풀어보기

}

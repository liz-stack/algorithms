package stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//X보다 작은 수
public class BOJ10871 {

	public static void main(String[] args) throws IOException {
		// 1.Scanner, 배열

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt(); int x = sc.nextInt(); int[] arr = new int[n];
		 * 
		 * for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); } sc.close(); for (int i
		 * = 0; i < n; i++) { if (arr[i] < x) { System.out.print(arr[i] + " "); } }
		 */

		// 2.BufferedReader, StringBuilder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine() + " ");

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st= new StringTokenizer(br.readLine() + " ");
		//새 st 인스턴스 생성하지 않으면 NoSuchElementException 발생! 
		
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			//why? nextToken()메소드로 토큰을 하나 꺼내오면 토커나이저 객체에는 해당 토큰이 없어짐, n,x에서 이미 꺼내씀!
			if (a < x) {
				sb.append(a).append(' ');
			}
		}
		System.out.println(sb);

	}

}

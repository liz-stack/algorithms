package stage5;

import java.io.IOException;
import java.util.Scanner;

//숫자의 개수, 다시 풀어보기
public class BOJ2577_review {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[9];
		int val = sc.nextInt() * sc.nextInt() * sc.nextInt();
		
		String str = Integer.toString(val);
		
		
		for(int i=0;i<arr.length;i++) {
			arr[str.charAt(i) - '0']++;
		}
		for(int v : arr) {
			System.out.println(v);
		}
		
	}
}

package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//나머지
public class BOJ3052 {

	public static void main(String[] args) throws IOException {

		// 1.Scanner, array
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * boolean arr[] = new boolean[42]; // 나머지가 나올 수 있는 수는 0~41
		 * 
		 * int count = 0;
		 * 
		 * for (int i = 0; i < 10; i++) { arr[sc.nextInt() % 42] = true; }
		 * 
		 * for (boolean value : arr) { if (value) { // value가 true라면 count++; } }
		 * System.out.println(count);
		 */

		// 2.BufferedReader, Hashset
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.println(hs.size());
	}

}

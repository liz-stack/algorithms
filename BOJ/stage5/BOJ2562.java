package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//최대값
public class BOJ2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//1-1. Scanner, for문
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int[] arr = new int[9];
		 * 
		 * for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt(); }
		 * 
		 * int max = 0; int index = 0;
		 */
		/*
		 * for (int i = 0; i < arr.length; i++) { if (arr[i] > max) { max = arr[i];
		 * index = i; } }
		 */
		
		// 1-2.Scanner, for each문(count변수추가)
		/*
		 * int count = 0;
		 * 
		 * for(int val : arr) { count++; if(val>max) { max=val; index = count; }
		 * 
		 * System.out.println(max);	System.out.println(index);
		 * }
		 */
		
		//2. BufferedReader, 배열X, 하나씩 집어넣어비교
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max=0;
		int index=0;
		
		for(int i=0;i<9;i++){
			int val = Integer.parseInt(br.readLine());
			if(val>max) {
				max=val;
				index=i+1;
			}
		}
		System.out.println(max+"\n"+index);
		
	}

}

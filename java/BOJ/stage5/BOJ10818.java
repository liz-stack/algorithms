package stage5;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//최소, 최대
public class BOJ10818 {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N-1]);
	
	}
	

}

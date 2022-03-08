package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10818_re {
	
	public static void main(String[] args) throws IOException {
		//배열, br사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int index=0;
		int arr[]= new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[index]= Integer.parseInt(st.nextToken());
			index++;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[N-1]);
	}

}

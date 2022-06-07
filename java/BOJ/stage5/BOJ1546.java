package stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//평균
public class BOJ1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//배열, array.sort 사용
		/*
		 * double[] arr = new double[Integer.parseInt(br.readLine())]; StringTokenizer
		 * st = new StringTokenizer(br.readLine(), " ");
		 * 
		 * for (int i = 0; i < arr.length; i++) { arr[i] =
		 * Double.parseDouble(st.nextToken()); }
		 * 
		 * double sum = 0; Arrays.sort(arr); //오름차순 정렬
		 * 
		 * for (int i = 0; i < arr.length; i++) { sum += ((arr[i] / arr[arr.length - 1])
		 * * 100); } System.out.println(sum / arr.length);
		 */
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1; //입력값이 0이상이기 때문
		double sum = 0.0;
		
		for(int i=0;i<N;i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value>max) {
				max = value;
			}
			sum += value;
		}
		
		System.out.println((sum/max)*100.0 /N);
	}

}

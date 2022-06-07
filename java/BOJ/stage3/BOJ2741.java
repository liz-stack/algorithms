package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//n찍기
public class BOJ2741 {

	public static void main(String[] args) throws IOException {
		 
		/*
		 * //1. 간편한 Scanner 방식 Scanner sc = new Scanner(System.in);
		 * 
		 * int N = sc.nextInt(); sc.close();
		 * 
		 * for(int i=1;i<=N;i++) { System.out.println(i); }
		 */
		
		//2. bufferedReader&Writer사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); 
		
		for(int i=1;i<=N;i++) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}

package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//기찍 N
public class BOJ2742 {

	public static void main(String[] args) throws IOException {
//		//1. scanner입력
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		sc.close();
//		for(int i=0;i<N;i++) {
//			System.out.println(N-i);
//		}
		//2.Bufferdreader 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			bw.write(N-i+"\n");
		}
		
		bw.flush();
		
	}

}

package stage7;

import java.util.Scanner;

//문자열 반복
public class BOJ2675_re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트테이스 개수
		int T= sc.nextInt();

		for(int i=0;i<T;i++) {
			
			//반복횟수 R
			int R= sc.nextInt();
			String S = sc.next();
			
			for(int j=0;j<S.length();j++) {
				for(int k=0;k<R;k++) {
					System.out.print(S.charAt(j));
				}
			}
		}
		
		
		
		
	}

}

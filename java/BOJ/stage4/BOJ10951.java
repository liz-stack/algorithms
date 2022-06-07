package stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//A+B -4 while문 사용
public class BOJ10951 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		StringBuilder sb = new StringBuilder();
		
		
		while((str=br.readLine()) !=null) {
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		} 
		System.out.println(sb);
		// NoSuchElement발생이유
		// 백준 서버는 \n(우분투) 개행, 윈도우는 \r\n 
		// => 한 라인을 읽을 때마다 \n까지 읽음. EOF는 데이터가 아예 없는것이고, \n은 데이터이기 떄문에 엔터입력 = 데이터 입력
		
		//br.readLine()으로 한 줄을 읽고, StringToknizer에 해당 문자열을 넣음
		//그런데 마지막에 엔터만 입력하면 ""문자열이 str에 들어가고 str=""; 빈문자열 상태
		//그 다음에 st에 문자열을 넣고, ""(공백) 단위로 구분되도록 만든다.
		//이 때, st 객체 안에는 ""(공백없는 빈문자열) 자체에서 검사할 수 있는 문자가 없기 때문에 토큰이 없음 => NoSuchElementException 발생
		
		// 해결: EOF 단축키 ctrl+z 사용하자
		
		
		/* //2. Scanner_ hasNext사용
		 * Scanner sc = new Scanner(System.in);
		 * 
		 *  while(sc.hasNextInt()) { int a = sc.nextInt(); int b =
		 * sc.nextInt(); System.out.println((a+b)); }
		 */
		
	} 

}

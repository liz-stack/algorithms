package stage5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
//숫자의 개수
public class BOJ2577 {

	public static void main(String[] args) throws IOException {
		/*//1.Scanner
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		 * 
		 * String str = Integer.toString(value); // int-> String
		 * 
		 * for (int i = 0; i < 10; i++) { int count=0; for(int j=0; j<str.length();j++)
		 * { if((str.charAt(j) - '0' )==i) { //-'0'이나 -48을 연산하지 않으면 아스키코드에 대응하는 문자가 출력됨
		 * count++; } } System.out.println(count); }
		 */
		
		//2. bufferedReder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[10];
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt( br.readLine()) * Integer.parseInt(br.readLine());
		
		String str = String.valueOf(val); //val에 해당하는 값을 String으로 반환
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i) -'0']++;
		}
		for(int v : arr) {
			System.out.println(v);
		}
		
	}
}

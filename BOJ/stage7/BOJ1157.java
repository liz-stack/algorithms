package stage7;

import java.util.Scanner;

//단어 공부
public class BOJ1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[26];
		String st = sc.nextLine();
		
		
		for(int i=0;i<st.length();i++) {
			
			if(65 <=st.charAt(i) && st.charAt(i)<=90 ) {
				arr[st.charAt(i)-65]++;
			}
			else {
				arr[st.charAt(i)-97]++;
			}
		}
		
		int max=-1;
		char ch='?';
		
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max =arr[i];
				ch = (char) (i+65);
			} else if(arr[i]==max) {
				ch='?';
			}
		}
		System.out.println(ch);
	}
}

package stage7;

import java.io.IOException;
import java.util.Scanner;

// 그룹단어체커
public class BOJ1316 {
    public static void main(String[] args) throws IOException {

        //각 문자가 연속해서 나타나는 경우만
        //k i n 은 그룹단어
        //aabbbccb는 b가 떨어져 나가기 떄문에 아님.
        //단어 N개를 입력받아 자동으로 그룹 단어 개수 출력하는 프로그램 짜기

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0;i<=N;i++){
            //N번만큼 반복해서 입력
            String str = sc.next();
            int cnt = 0;

        for(int j=0;j<str.length();j++){
            char ch = str.charAt(j);
        }

            //연속되면 +1

            //앞에 나온 문자가 또 나오면 -1

            System.out.println(str);
        }
       //
    }

}

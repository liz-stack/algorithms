package stage8;

import java.io.IOException;
import java.util.Scanner;

//벌집
public class BOJ2292 {
    /* 육각형으로 이루어진 벌집에서, 중앙의 방을 1로두고 1씩 증가하는 번호를 매긴다.
    *  숫자 N이 주어졌을때, 벌집의 중앙 1에서 N번까지의 최소 개수의 방을 지나서 가는 경우 몇개의 방을 지나가는지를 구하기
    * (시작과 끝 포함) */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int n = 0;
        //계차수열 1+(6+6n)/2

        while(1+n*(3+3*n)<num){
            n++;
        }
        System.out.println(n+1);
//        System.out.println( (int)Math.ceil((a-1)/6));
    }
}

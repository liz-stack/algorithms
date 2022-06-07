package stage8;

import java.io.IOException;
import java.util.Scanner;

//분수찾기
//TODO 220601 홀수일때 알고리즘 생각해보기
public class BOJ1193 {
    /* 무한히 큰 배열에 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 .. 와 같은 순서로 분수들이 있다.
     * X가 주어졌을때 X번째 분수를 구하는 프로그램을 작성하라.
     * 분자와 분모 합에서 규칙 찾을 수 있음. */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int upperNum = 0; //분자
        int lowerNum = 0; //분모
        int countSum = upperNum+lowerNum; //몇 번째(합)인지


        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                if ( i%2 != 1) { //
                    // 3/1 2/2 1/3형태, 분자에서 -1 분모에 +1


                } else { //짝수일때

                }
            }
        }

        System.out.println(upperNum + "/" + lowerNum);
    }
}

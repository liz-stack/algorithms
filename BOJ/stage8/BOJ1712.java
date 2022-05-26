package stage8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//손익분기점
public class BOJ1712 {
    /* 노트북 판매회사의 매년 고정비용은 A, 판매 대수당 지출은 가변비용 B
     * A:1000, B: 70이라면 한 대 생산시에 1070만원, 열 대 생산시에 1700만원
     * 노트북 가격은 C만원 일때,  총 수입 > 총 비용이 되는 판매 대수?를 구하기
     * 존재하지 않으면 -1을 출력한다.
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(C-B <= 0){
            System.out.println(-1);
        } else{
            System.out.println((A / ( C - B)) +1);
        }

    }
}

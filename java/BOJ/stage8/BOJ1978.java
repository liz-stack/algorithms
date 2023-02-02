package stage8;

import java.util.Scanner;

// 소수 찾기
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
    /* 입력 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
    다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
    출력 주어진 수들 중 소수의 개수를 출력한다.*/
public class BOJ1978 {
    /* 무한히 큰 배열에 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 .. 와 같은 순서로 분수들이 있다.
     * X가 주어졌을때 X번째 분수를 구하는 프로그램을 작성하라.
     * 분자와 분모 합에서 규칙 찾을 수 있음. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int count = 0;
        for(int i=0; i<N; i++){ // N까지 num을 대입 받고 반복한다.
            num = sc.nextInt(); // num을 받는다.
            for(int j=2; j<=num; j++){// 2부터 num까지 나눈다.
                if(j==num) { // 만약 j하고 num이 같으면 자기 자신까지 온 거니까 count++ 한다.
                    count++; // j가 num하고 같지 않으면 밑으로 내려간다.
                }
                if(num%j==0){// 만약 num을 j나눈 나머지가 0이되면 빠져 나온다.
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
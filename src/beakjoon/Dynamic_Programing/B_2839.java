package beakjoon.Dynamic_Programing;

/* 설명
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다
 * */

/* 아이디어
 * 일단 5로 나눌 수 없다면 3으로 뺀다.
 * 위와 같은 N을 반복하고 N이 0이 된다면 수행횟수를 리턴
 * N이 음수가 된다면 -1을
 * */

    /* 해결법
     *
     * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2839 {
    static int res = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        while (N > 0) {
            if(N % 5 == 0){
                res += N/5;
                break;
            }

            N -= 3;
            res++;
        }
        System.out.println(N < 0 ? -1 : res);
    }
}

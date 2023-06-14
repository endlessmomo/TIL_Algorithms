package programmers.Lv1;

import java.util.stream.IntStream;

public class Knights {
    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
    }

    public static int solution(int number, int limit, int power) {
        // 기사의 수
        // 제한된 무기의 파워
        // 제한된 무기 이상의 파워를 가진 기사들이 갖게될 무기의 파워
        return IntStream.rangeClosed(1, number)
                .map(Knights::getDivisorCnt)
                .map(i -> i > limit ? power : i)
                .reduce(Integer::sum)
                .getAsInt();

    }

    public static int getDivisorCnt(int value) {
        int cnt = 0;
        for (int i = 1; i * i <= value; i++) {
            if (i * i == value) cnt++;
            else if (value % i == 0) cnt += 2;
        }

        return cnt;
    }
}

package programmers.Lv1;

import java.util.stream.IntStream;

public class DivisorCountAdd {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public static int solution(int left, int right){
        return IntStream.rangeClosed(left, right).map(v -> findDivisorCnt(v) % 2 == 0 ? v : -v).sum();
    }

    public static int findDivisorCnt(int n){
        return (int) IntStream.rangeClosed(1, n).filter(v -> n % v == 0).count();
    }
}

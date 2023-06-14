package programmers.Lv1;

import java.util.stream.IntStream;

public class remindOne {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }
    public static int solution(int n){
       return IntStream.range(3, n).filter(x -> n % x == 1).findFirst().orElse(0);
    }
}

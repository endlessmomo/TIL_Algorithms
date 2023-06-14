package programmers.Lv1;

import java.util.stream.IntStream;

public class TwoIntegerBetweenValueSum {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
    }

    public static int solution(int x, int y){
        if(x > y){
            int tmp = x;
            x = y;
            y = tmp;
        }

        return IntStream.rangeClosed(x,y).sum();
    }
}

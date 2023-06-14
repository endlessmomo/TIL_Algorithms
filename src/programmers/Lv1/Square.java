package programmers.Lv1;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        int[][] size = {{60,50}, {30,70}, {60,30}, {80,40}};
        System.out.println(solution(size));
    }

    public static int solution(int[][] size){
        return Arrays.stream(size).reduce((a,b) -> new int[]{
                Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0],a[1]), Math.min(b[0],b[1]))
        }).map(it -> it[0] * it[1]).get();
    }
}

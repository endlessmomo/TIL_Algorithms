package Programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCut {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 2, 5)));
    }

    public static int[] solution(int n, long left, long right){
        List <Long> list = new ArrayList <>();

        for(long i = left; i <= right; i++) {
            list.add(Math.max(i/n, i%n )+1);
        }

        return list.stream().mapToInt(e -> e.intValue()).toArray();
    }
}

package Programmers.Lv1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class DotProduct {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(solution(a,b));
    }

    public static int solution(int[] a, int[] b){
        AtomicInteger idx = new AtomicInteger();

        return Arrays.stream(a).map(i-> i * b[idx.getAndIncrement()]).sum();
    }
}

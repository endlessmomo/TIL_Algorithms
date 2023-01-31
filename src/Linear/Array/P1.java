package Linear.Array;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.printf("짝수 평균 : %.1f, 홀수 평균 : %.1f", EvenAvg(arr), OddAvg(arr));
    }

    private static double EvenAvg(int[] arr) {
        return Arrays.stream(arr).filter(v -> v % 2 == 0).average().getAsDouble();
    }

    private static double OddAvg(int[] arr) {
        return Arrays.stream(arr).filter(v -> v % 2 == 1).average().getAsDouble();
    }
}

package Programmers;

import java.util.Arrays;

public class DivideArrayValue {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 7, 10};
        int divisor = 5;

        System.out.println(solution(arr, divisor).toString());
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] findArr = Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();
        return findArr.length < 1 ? new int[]{-1} : findArr;
    }
}

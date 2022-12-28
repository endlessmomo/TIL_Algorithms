package Programmers;

import java.util.Arrays;

public class RemoveMinValue {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1};

        solution(arr);
    }

    public static int[] solution(int[] arr) {
        if(arr.length <= 1) { return new int[] {-1};}
        int minValue = Arrays.stream(arr).min().orElse(-1);
        return Arrays.stream(arr).filter(value -> value > minValue).toArray();
    }
}

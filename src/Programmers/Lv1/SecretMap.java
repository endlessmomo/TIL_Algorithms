package Programmers.Lv1;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
             map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
             map[i].replaceAll("1", "#");
             map[i].replaceAll("0", " ");
        }

        return map;
    }
}

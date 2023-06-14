package programmers.Lv1;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
        System.out.println(Integer.toBinaryString(22 | 14));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
             map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
             if(map[i].length() != n){
                 map[i] = "0".repeat(n - map[i].length()) + map[i];
             }
             map[i] = map[i].replaceAll("1", "#");
             map[i] = map[i].replaceAll("0", " ");
        }

        return map;
    }
}

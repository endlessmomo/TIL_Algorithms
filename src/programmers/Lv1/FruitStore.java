package programmers.Lv1;

import java.util.Arrays;

public class FruitStore {
    public static void main(String[] args) {
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(4, 3, score));
    }

    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int start = score.length % m;
        int res = 0;

        for (int i = start; i < score.length; i += m) {
            res += score[i] * m;
        }

        return res;
    }
}

package Programmers.Lv1;

import java.util.Arrays;

public class Trio {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
    }

    public static boolean[] checked;
    public static int res = 0;

    public static int solution(int[] numbers) {
        checked = new boolean[numbers.length];
        isTrio(0, 0, 0, numbers);

        return res;
    }

    public static void isTrio(int start, int sum, int count, int[] numbers) {
        if (count == 3) {
            if (sum == 0) res++;
            return;
        }

        for (int i = start; i < numbers.length; i++) {
            if (!checked[i]) {
                checked[i] = true;
                isTrio(i + 1, sum + numbers[i], count + 1, numbers);
                checked[i] = false;
            }
        }
    }
}

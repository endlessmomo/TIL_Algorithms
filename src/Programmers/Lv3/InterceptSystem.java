package Programmers.Lv3;

import java.util.Arrays;

public class InterceptSystem {
    public static void main(String[] args) {
        int[][] targets = new int[][]{{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};
        System.out.println(solution(targets));
    }

    public static int solution(int[][] targets) {
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        int res = 0;
        int last = -1;

        for (int[] target : targets) {
            if (last == -1) {
                res++;
                last = target[1] - 1;
                continue;
            }

            if (last >= target[0] && last <= target[1]) continue;

            res++;
            last = target[1] - 1;
        }
        return res;
    }
}

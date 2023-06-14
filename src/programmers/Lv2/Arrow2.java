package programmers.Lv2;

import java.util.Arrays;

class Solution {
    static int[] res = {-1};
    static int[] lion;
    static int max = -1000;

    public static void main(String[] args) {
        /*int[] apeach = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        int n = 5;*/

        /*int[] apeach = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};
        int n = 9;*/

        int[] apeach = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int n = 10;
        Long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution(n, apeach)));
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int[] solution(int n, int[] info) {
        lion = new int[11];
        dfs(info, 1, n);
        return res;
    }

    public static void dfs(int[] info, int cnt, int n) {
        if (cnt == n + 1) {
            int apeach_point = 0;
            int lion_point = 0;
            for (int i = 0; i <= 10; i++) {
                if (info[i] != 0 || lion[i] != 0) {
                    if (info[i] < lion[i])
                        lion_point += 10 - i;
                    else
                        apeach_point += 10 - i;
                }
            }
            if (lion_point > apeach_point) {
                if (lion_point - apeach_point >= max) {
                    res = lion.clone();
                    max = lion_point - apeach_point;
                }
            }
            return;
        }
        for (int j = 0; j <= 10 && lion[j] <= info[j]; j++) {
            lion[j]++;
            dfs(info, cnt + 1, n);
            lion[j]--;
        }
    }
}
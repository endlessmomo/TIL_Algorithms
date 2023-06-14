package Programmers.Lv2;

import java.util.Arrays;

class Arrow {
    static int[] lion;
    static int[] res;
    static int max = -1000;

    public static void main(String[] args) {
        /*int[] apeach = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        int n = 5;*/

        /*int[] apeach = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};
        int n = 9;*/

        int[] apeach = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
        int n = 10;


        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution(n, apeach)));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        /*
         * [2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0]
         * 13215
         * */
    }

    public static int[] solution(int n, int[] info) {
        lion = new int[11];
        dfs(info, 0, n);
        return res;
    }

    public static void dfs(int[] apeach, int cnt, int arrowCnt) {
        if (cnt == arrowCnt) {
            int apeach_point = 0;
            int lion_point = 0;

            for (int i = 0; i <= 10; i++) {
                if (lion[i] == 0 || apeach[i] == 0)
                    continue;

                    if (lion[i] > apeach[i])
                        lion_point += (10 - i);
                    else
                        apeach_point += (10 - i);
            }


            if (lion_point > apeach_point) {
                int diff = lion_point - apeach_point;
                if (diff >= max) {
                    res = lion.clone();
                    max = diff;
                }
            }
            return;
        }

        for (int i = 0; i <= 10 && lion[i] <= apeach[i]; i++) {
            lion[i]++;
            dfs(apeach, cnt + 1, arrowCnt);
            lion[i]--;
        }
    }
}
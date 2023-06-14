package programmers.Lv2;

import java.util.Arrays;

class ArrowH {
    public static void main(String[] args) {
        int[] apeach = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        int n = 5;

        /*int[] apeach = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};
        int n = 9;*/

       /* int[] apeach = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int n = 10;*/
        Long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution(n, apeach)));
        Long end = System.currentTimeMillis();

        System.out.println("시간 " + (end - start) + "ms");
    }

    static int max = -1;
    static int[] finalArr;

    public static int[] solution(int n, int[] info) {
        finalArr = new int[info.length];
        int[] result = new int[info.length];
        DFS(0, n, info, result);
        if (max == -1) {
            return new int[]{-1};
        }
        return finalArr;
    }

    public static void DFS(int cnt, int n, int[] info, int[] result) {
        if (cnt == n) { // n으로 바꾸자
            int score = compare(info, result);
            if (score > max) {
                max = score;
                finalArr = result.clone();
            }
        } else {
            for (int i = 10; i >= 0; i--) {
                if (result[i] > info[i]) {
                    continue;
                } else {
                    result[i] += 1;
                    DFS(cnt + 1, n, info, result);
                    result[i] -= 1;
                }
            }
        }
    }

    public static int compare(int[] info, int[] result) {
        int rionScore = 0; // result
        int apeachScore = 0; // info

        for (int i = 0; i <= 10; i++) {
            if (info[i] != 0 || result[i] == 0) {
                if (info[i] >= result[i]) {
                    apeachScore += 10 - i;
                } else {
                    rionScore += 10 - i;
                }
            }
        }

        return rionScore > apeachScore ? rionScore - apeachScore : -1;
    }
}
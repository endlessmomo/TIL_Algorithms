package Programmers.lv3;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        System.out.println(solution(triangle));
    }

    /*
     * 7
     * 3 8
     * 8 1 0
     * 2 7 4 4
     * 4 5 2 6 5
     *
     * 움직일 수 있는 경우는 현 위치에서 아래, 오른쪽
     * 최고의 수를 찾아라
     * */
    public static int solution(int[][] triangle) {
        int[] dp = new int[triangle.length];
        dp[0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for(int j = triangle[i].length - 1; j >= 0; j--){
                if(j == 0) {
                    dp[j] += triangle[i][0];
                } else if ( j == triangle[i].length - 1){
                    dp[j] = dp[j-1] + triangle[i][j];
                } else{
                    dp[j] = Math.max(dp[j -1] + triangle[i][j], dp[j] + triangle[i][j]);
                }
            }
        }

        return Arrays.stream(dp).reduce(Integer::max).orElseThrow();
    }
}

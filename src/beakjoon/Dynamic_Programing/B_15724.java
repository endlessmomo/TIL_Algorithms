package beakjoon.Dynamic_Programing;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class B_15724 {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(in.readLine());
            for(int j = 1; j <= M; j++){
                dp[i][j] = Integer.parseInt(st.nextToken())+ dp[i-1][j];
            }
        }

        int pointC = Integer.parseInt(in.readLine());

        for (int i = 0; i < pointC; i++) {
            int[] point = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;

            for (int y = point[1]; y <= point[3]; y++) {
                sum += dp[point[2]][y] - dp[point[0] - 1][y];
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}

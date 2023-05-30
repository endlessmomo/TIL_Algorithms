package Backjoon.Dynamic_Programing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9095 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Integer tc = Integer.parseInt(in.readLine());

        for (int t = 0; t < tc; t++) {
            Integer N = Integer.parseInt(in.readLine());
            dp = new int[N + 1];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i < dp.length; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            sb.append(dp[N]).append("\n");
        }
        System.out.println(sb.toString());
    }
}

package Backjoon.Dynamic_Programing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(in.readLine());
        int[] dp = new int[N+2];
        int[] value = new int[N+2];

        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 1; i <= N; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = value[1];

        for (int i = 2; i <= N; i++) {
            dp[i] = value[i];

            for (int j = 1; j < i; j++) {
                if (value[i] > value[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + value[i]);
                }
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}

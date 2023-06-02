package Backjoon.Dynamic_Programing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1106 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        Integer customerC = Integer.parseInt(st.nextToken());
        Integer cityC = Integer.parseInt(st.nextToken());

        int[] dp = new int[customerC + 101];
        Arrays.fill(dp, 10000);
        dp[0] = 0;

        for (int i = 0; i < cityC; i++) {
            st = new StringTokenizer(in.readLine());

            int cost = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());

            for (int j = people; j < customerC + 101; j++) {
                dp[j] = Math.min(dp[j], cost + dp[j - people]);
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = customerC; i < customerC + 101; i++) {
            res = Math.min(dp[i], res);
        }

        System.out.println(res);
    }
}

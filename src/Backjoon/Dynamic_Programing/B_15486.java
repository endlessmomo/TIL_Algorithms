package Backjoon.Dynamic_Programing;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_15486 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(in.readLine());

        // 마지막날 상담이 완료하면 그 다음날 돈을 받기 때문에 해당일자까지 확인할 필요성이 있다.
        int[] dp = new int[N+2];
        int[] T = new int[N+2];
        int[] P = new int[N+2];

        for(int i=1; i <= N; i++) {
            st = new StringTokenizer(in.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        for (int i=1; i < T.length; i++) {
            max = Math.max(max, dp[i]);

            int day = i + T[i];
            if(day < dp.length){
                dp[day] = Math.max(dp[day], max + P[i]);
            }
        }
        System.out.println(Arrays.stream(dp).max().orElse(0));
    }
}

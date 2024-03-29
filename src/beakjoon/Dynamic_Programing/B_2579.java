package beakjoon.Dynamic_Programing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer floorCnt = Integer.parseInt(in.readLine());

        int[] dp = new int[floorCnt + 1];
        int[] values = new int[floorCnt + 1];

        for (int i = 1; i <= floorCnt; i++) {
            values[i] = Integer.parseInt(in.readLine());
        }

        dp[0] = 0;
        dp[1] = values[1];

        if(floorCnt >= 2){
            dp[1] = values[1] + values[2];
        }

        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 3] + values[i - 1] + values[i], dp[i - 2] + values[i]);
        }
        System.out.println(dp[floorCnt]);
    }
}
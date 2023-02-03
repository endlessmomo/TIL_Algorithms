package Backjoon;

import java.util.stream.IntStream;

public class Coin {
    public static void main(String[] args) {
        System.out.println(coin(new int[]{1, 2, 5}, 10));
    }

    public static int coin(int[] coins, int goals) {
        int[] dp = new int[goals + 1];

        for (int coin : coins) {
            for (int i = 1; i <= goals; i++) {
                if (i - coin > 0) {
                    dp[i] = dp[i] + dp[i-coin];
                } else if ( i - coin == 0){
                    dp[i]++;
                }
            }
        }

        return dp[goals ];
    }
}

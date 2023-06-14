package programmers.Lv2;

public class TwoByNTiling {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    static int[] dp;

    public static int solution(int n) {
        dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }

        return dp[n];
    }
}

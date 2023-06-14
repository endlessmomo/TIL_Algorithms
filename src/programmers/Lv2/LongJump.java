package programmers.Lv2;

public class LongJump {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int[] dp = new int[2001];
    public static int solution(int n){
        makeDpTable();
        return dp[n];
    }

    public static void makeDpTable(){
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
    }
}

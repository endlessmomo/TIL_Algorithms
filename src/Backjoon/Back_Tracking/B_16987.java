package Backjoon.Back_Tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_16987 {
    static int N, ans = 0;
    static int[] durability, weight;
    static boolean[] visited;

    /* 최대한 깰 수 있는 계란의 수 구하기
     * 조건 1. 첫 시작은 가장 왼쪽 계란을 들고 시작할 것
     * 조건 2. 무언가 깨진 후 계란은 랜덤하게 골라도 상관없다.
     * 조건 3. 들고 있는 계란이 동시에 깨졌다면, 해당 위치에서 종료된다.
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        durability = new int[N];
        weight = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            String[] values = br.readLine().split(" ");
            durability[i] = Integer.parseInt(values[0]);
            weight[i] = Integer.parseInt(values[1]);
        }

        visited[0] = true;
        dfs(0, 0);

        System.out.println(ans);
    }

    public static void dfs(int cur, int cnt){
        if (cur == N) {
            ans = Math.max(ans, cnt);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {

            }
        }
    }
}

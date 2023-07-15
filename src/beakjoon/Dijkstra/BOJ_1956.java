package beakjoon.Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1956 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int INF = 1000000000;
    static int res = 1000000000;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] route = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    route[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine());
            // 출발 도시, 도착 도시, 비용
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int cost = Integer.parseInt(st.nextToken());

            route[a][b] = Math.min(route[a][b], cost);
        }

        for (int k = 0; k < N; k++) { // 경유
            for (int i = 0; i < N; i++) { // 출발
                for (int j = 0; j < N; j++) { // 도착
                    if(i == j ) continue;

                    if (route[i][j] > route[i][k] + route[k][j]) {
                        route[i][j] = route[i][k] + route[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (route[i][j] != INF && route[j][i] != INF) {
                    res = Math.min(res, route[i][j] + route[j][i]);
                }
            }
        }
        System.out.println(res == INF ? -1 : res);
    }
}

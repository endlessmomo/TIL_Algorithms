package Backjoon.Back_Tracking;

import java.io.*;

public class B_10971 {
    static int[][] map;
    static boolean[] visited;
    static long minCost = Integer.MAX_VALUE;
    static int vertexCnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        vertexCnt = Integer.parseInt(br.readLine());
        map = new int[vertexCnt][vertexCnt];
        visited = new boolean[vertexCnt];

        for (int i = 0; i < map.length; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        visited[0] = true;
        dfs( 0, 1, 0);
        System.out.println(minCost);
    }


    public static void dfs(int cur, int cnt, long cost) {
        if (cnt == vertexCnt) {
            if(map[cur][0] != 0) {
                minCost = Math.min(cost + map[cur][0], minCost);
            }
            return;
        }

        for (int i = 0; i < vertexCnt; i++) {
            if (!visited[i] && map[cur][i] != 0) {
                visited[i] = true;
                dfs(i, cnt + 1, cost + map[cur][i]);
                visited[i] = false;
            }
        }
    }
}




/* 반례
4
0 0 3 0
1 0 0 0
0 6 0 4
0 2 0 0

4
1 10 15 20
5 2 9 10
6 13 3 12
8 8 9 4

5
0 4 3 2 1
5 0 3 2 1
5 4 0 3 2
5 4 3 0 1
5 4 3 2 0

4
0 5 1 99
99 0 5 1
1 99 0 5
5 1 99 0
20

4
0 10 15 20
5 0 9 0
6 13 0 12
8 8 9 0
*/

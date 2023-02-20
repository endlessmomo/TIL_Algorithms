package Backjoon.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p7568 {
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        graph = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            graph[i][0] = Integer.parseInt(st.nextToken());
            graph[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i != j) {
                    if (graph[i][0] > graph[j][0] && graph[i][1] > graph[j][1]) {
                        graph[j][2]++;
                    } else if (graph[i][0] < graph[j][0] && graph[i][1] < graph[j][1]) {
                        graph[i][2]++;
                    } else
                        continue;
                }
        }

        for (int[] row : graph) {
            System.out.print((row[2] / 2) + 1 + " ");
        }
    }
}

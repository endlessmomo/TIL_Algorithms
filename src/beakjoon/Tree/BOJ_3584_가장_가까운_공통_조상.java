package beakjoon.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_3584_가장_가까운_공통_조상 {
    static int a, b;
    static int vertexNum;
    static int[] parent;
    static List<List<Integer>> child = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());

        for (int i = 0; i < tc; i++) {
            int N = Integer.parseInt(in.readLine());
            for (int j = 0; j <= N; j++) {
                child.add(new ArrayList<>());
            }

        }
    }
}

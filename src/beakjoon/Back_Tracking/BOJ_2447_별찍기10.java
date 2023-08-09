package beakjoon.Back_Tracking;

import java.io.*;
import java.util.Arrays;

public class BOJ_2447_별찍기10 {
    static String[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int row = Integer.parseInt(in.readLine());
        map = new String[row][row];
        for (String[] strings : map) {
            Arrays.fill(strings, " ");
        }

        draw(0, 0, row);
        for (String[] strings : map) {
            for (String value : strings) {
                sb.append(value.isBlank() ? " " : value);
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void draw(int x, int y, int size) {
        if (size == 1) {
            map[x][y] = "*";
            return;
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (!(row == 1 && col == 1)) {
                    draw(x + row * size / 3, y + col * size / 3, size / 3);
                }
            }
        }
    }
}

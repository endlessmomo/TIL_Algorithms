package Backjoon.recursion;

import java.util.Scanner;

public class p2447 {
    /*
     * Math.pow(3, n) 인 경우 가로 n/3
     * */
    public static char[][] map;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        map = new char[n][n];

        makeStar(0, 0, n, false);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void makeStar(int x, int y, int n, boolean blank) {
        // 공백칸일 경우
        if (blank) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    map[i][j] = ' ';
                }
            }
            return;
        }

        // 더이상 쪼갤 수 없는 블록일 때
        // 27 -> 9 -> 3 -> 1로 와서 N이 1일때
        if (n == 1) {
            map[x][y] = '*';
            return;
        }

        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;

                if (count == 5) {
                    makeStar(i, j, size, true);
                } else {
                    makeStar(i, j, size, false);
                }
            }
        }
    }
}

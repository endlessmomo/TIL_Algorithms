package Backjoon.recursion;

import java.util.Scanner;

public class p11729 {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();

        hanoi(n, 1, 3, 2);

        System.out.println(count);
        System.out.println(sb);
    }

    public static void hanoi(int n, int start, int to, int via) {
        if (n == 1) {
            move(1, start, to);
        } else {
            hanoi(n - 1, start, via, to);
            move(n, start, to);
            hanoi(n - 1, via, to, start);
        }
    }

    public static void move(int n, int start, int to) {
        sb.append(start + " " + to + "\n");
        count++;
    }
}

package Backjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        for (int i = 1; i <= n; i++) {
            int[] res = isPalindrome(in.readLine());
            System.out.printf("%d %d\n", res[0], res[1]);
        }

    }

    public static int[] isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1, 1);
    }

    public static int[] recursion(String s, int l, int r, int count) {
        if (l >= r) return new int[]{1, count};
        else if (s.charAt(l) != s.charAt(r)) return new int[]{0, count};
        else return recursion(s, l + 1, r - 1, count + 1);
    }
}

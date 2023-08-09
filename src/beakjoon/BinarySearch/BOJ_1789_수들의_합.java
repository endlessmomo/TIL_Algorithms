package beakjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1789_수들의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long target = Long.parseLong(in.readLine());
        long sum = 0;
        int count = 0;

        for (int i = 1; ; i++) {
            if (sum > target) break;
            sum += i;
            count++;
        }
        System.out.println(count - 1);
    }
}

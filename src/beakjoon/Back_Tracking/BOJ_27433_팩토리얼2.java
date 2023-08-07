package beakjoon.Back_Tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27433_팩토리얼2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());

        System.out.println(factorial(N));
    }

    public static int factorial(int N) {
        if (N <= 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}

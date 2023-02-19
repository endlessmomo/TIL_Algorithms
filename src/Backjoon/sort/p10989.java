package Backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 메모리 절약을 위한 counting sort 활용

public class p10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        int[] count = new int[10001];

        for(int i = 0; i < n; i++){
            count[Integer.parseInt(in.readLine())]++;
        }

        for(int i = 1; i < 10001; i++) {
            while(count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}

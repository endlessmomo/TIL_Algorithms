package Backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        List <Integer> list = new ArrayList <>();

        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(in.readLine()));
        }

        Collections.sort(list);
        list.forEach(e -> sb.append(e).append("\n"));

        /** foreach vs 향상된 for
         *  ArrayList인 경우 향상된 for 경우가 빠르다.
         *  LinkedList인 경우 foreach 경우가 빠르다.
         */
        System.out.println(sb);
    }
}

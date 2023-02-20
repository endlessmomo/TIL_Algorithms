package Backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        List <Integer> list = new ArrayList <>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(in.readLine()));
        }

        Collections.sort(list);

        // 1번 상황
        System.out.println(Math.round(list.stream().mapToInt(Integer::valueOf).average().getAsDouble()));

        // 2번 상황
        System.out.println(list.get(list.size() / 2));

        // 3번 상황
        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (list.get(i - 1) == list.get(i) || list.get(i) == list.get(i + 1) ) {
                    continue;
                } else {
                    System.out.println(list.get(i));
                }
            }
        }

        // 4번 상황
    }
}

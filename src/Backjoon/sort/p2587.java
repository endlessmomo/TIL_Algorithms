package Backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List <Integer> list = new ArrayList <>();

        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(in.readLine()));
        }

        Collections.sort(list);

        System.out.println(Math.round(list.stream().mapToInt(Integer::intValue).average().getAsDouble()));
        System.out.println(list.get((int)list.size()/2));
    }
}

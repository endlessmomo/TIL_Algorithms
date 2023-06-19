package beakjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        Deque<Character> deque = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] values = in.readLine().toCharArray();

        for (int i = 0; i < values.length; i++) {
            while (K > 0 && !deque.isEmpty() && deque.getLast() < values[i]) {
                deque.removeLast();
                K--;
            }
            deque.add(values[i]);
        }

        while(K > 0) {
            deque.removeLast();
            K--;
        }

        while(!deque.isEmpty()){
            sb.append(deque.poll());
        }

        System.out.println(sb.toString());
    }
}

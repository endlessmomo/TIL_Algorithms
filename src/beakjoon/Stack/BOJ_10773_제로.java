package beakjoon.Stack;

import java.io.*;
import java.util.Stack;

public class BOJ_10773_제로 {
    static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(br.readLine());
        for (int t = 0; t < row; t++) {
            int val = Integer.parseInt(br.readLine());

            if (val == 0 ) {
                if(!st.isEmpty()) st.pop();
                continue;
            }

            st.push(val);
        }
        System.out.println(st.stream().reduce(0, Integer::sum));
    }
}

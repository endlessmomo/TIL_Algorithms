package beakjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import static java.lang.Integer.parseInt;

public class BOJ_1874_스택_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        int row = parseInt(in.readLine());
        int cur = 1;

        for (int t = 0; t < row; t++) {
            int val = parseInt(in.readLine());

            while (cur <= val) {
                st.add(cur++);
                sb.append("+").append("\n");
            }

            if (st.peek() == val) {
                st.pop();
                sb.append("-").append("\n");
            } else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}

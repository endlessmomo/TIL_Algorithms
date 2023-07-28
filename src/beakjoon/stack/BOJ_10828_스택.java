package beakjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10828_스택 {
    static Stack<String> st = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(in.readLine());
        for (int i = 0; i < row; i++) {
            String[] val = in.readLine().split(" ");
            command(val);
        }

        System.out.println(sb.toString());
    }

    public static void command(String[] val) {
        switch (val[0]) {
            case "push":
                st.add(val[1]);
                break;
            case "empty":
                sb.append(st.isEmpty() ? 1 : 0).append("\n");
                break;
            case "pop":
                sb.append(!st.isEmpty() ? st.pop() : -1).append("\n");
                break;
            case "size":
                sb.append(st.size()).append("\n");
                break;
            case "top":
                sb.append(!st.isEmpty() ? st.peek() : -1).append("\n");
                break;
        }
    }
}

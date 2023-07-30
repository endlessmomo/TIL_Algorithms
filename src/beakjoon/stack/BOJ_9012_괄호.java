package beakjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class BOJ_9012_괄호 {
    static Stack<String> st = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(in.readLine());

        for (int t = 0; t < row; t++) {
            boolean flag = true;
            st.clear();

            for (String val : in.readLine().split("")) {
                if (val.equals("(")) {
                    st.add("(");
                } else {
                    if(st.isEmpty()) {
                        flag = false;
                        break;
                    }
                    st.pop();
                }
            }
            System.out.println(flag && st.isEmpty() ? "YES" : "NO");
        }
    }
}

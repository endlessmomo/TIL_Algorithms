package beakjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949_균형잡힌_세상 {
    static Stack<Character> st = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String val = in.readLine();

            if(val.equals(".")) {break;}

            val = val.replaceAll("[^\\[\\]\\(\\).]", "");
            st.clear();

            if (val.endsWith(".")) {
                for (char bracket : val.toCharArray()) {
                    if (bracket == '(' || bracket == '[') {
                        st.push(bracket);
                    } else if (bracket == ']') {
                        if(st.isEmpty() || st.peek() != '['){
                            st.push(bracket);
                            break;
                        }
                        st.pop();
                    } else if (bracket == ')') {
                        if(st.isEmpty() || st.peek() != '('){
                            st.push(bracket);
                            break;
                        }
                        st.pop();
                    }
                }

                if (st.isEmpty()) {
                    sb.append("yes").append("\n");
                } else {
                    sb.append("no").append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}

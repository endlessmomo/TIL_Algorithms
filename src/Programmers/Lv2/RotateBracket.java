package Programmers.Lv2;

import java.util.Objects;
import java.util.Stack;

public class RotateBracket {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }

    public static int solution(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (checking(s)) {
                res++;
            }
            s = s.substring(1, s.length()) + s.charAt(0);
        }

        return res;
    }

    public static boolean checking(String s) {
        Stack <String> st = new Stack <>();

        for (String value : s.split("")) {
            try {
                switch (value) {
                    case "{":
                    case "[":
                    case "(":
                        st.add(value);
                        break;
                    case "}":
                        if (!Objects.equals(st.peek(), "{")) return false;
                        st.pop();
                        break;
                    case "]":
                        if (!Objects.equals(st.peek(), "[")) return false;
                        st.pop();
                        break;
                    case ")":
                        if (!Objects.equals(st.peek(), "(")) return false;
                        st.pop();
                        break;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return st.isEmpty();
    }
}

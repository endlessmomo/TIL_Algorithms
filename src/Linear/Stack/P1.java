package Linear.Stack;

import java.util.Stack;

public class P1 {
    public static void main(String[] args) {
        System.out.println(isParenthesis("(()()())"));
        System.out.println(isParenthesis("((()()()))"));
        System.out.println(isParenthesis("((()()())"));
    }

    public static boolean isParenthesis(String str) {
        Stack <Character> stack = new Stack <>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.add(ch);
            } else
                stack.pop();
        }
        return stack.isEmpty();
    }
}

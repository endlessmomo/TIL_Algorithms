package DataStructure.Linear.Stack;

import java.util.Stack;

public class P2 {
    public static void main(String[] args) {
        System.out.println(postfixCalculate("2 2 +"));                             // 4
        System.out.println(postfixCalculate("1 1 + 2 * 3 * 2 / 5 -"));             // 1
    }

    public static Double postfixCalculate(String formula) {
        Stack <Double> nStack = new Stack <>();

        for (String str : formula.split(" ")) {
            if(str.equals("+")) {
                nStack.push(nStack.pop() + nStack.pop());
            } else if(str.equals("-")) {
                nStack.push(-nStack.pop() + nStack.pop());
            } else if(str.equals("*")) {
                nStack.push(nStack.pop() * nStack.pop());
            } else if(str.equals("/")) {
                nStack.push(1 / nStack.pop() * nStack.pop());
            } else {
                nStack.push(Double.parseDouble(str));
            }
        }

        return nStack.pop();
    }
}

package linear.Stack;

import java.util.Stack;

public class P3 {
    public static void main(String[] args) {
        System.out.println(stringCompare("tree", "th#ree"));        // true
        System.out.println(stringCompare("wo#w", "ww#o"));          // false
    }

    public static boolean stringCompare(String s1, String s2) {
        return removeAlphabet(s1).equals(removeAlphabet(s2));
    }

    public static String removeAlphabet(String str) {
        String res = "";
        Stack <String> stack = new Stack <>();

        for (String alphabet : str.split("")) {
            if(alphabet.equals("#")){
                stack.pop();
                continue;
            }
            stack.add(alphabet);
        }
        return String.valueOf(stack);
    }
}

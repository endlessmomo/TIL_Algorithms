package Programmers.Lv1;

public class BasicStringTreat {
    public static void main(String[] args) {
        System.out.println(solution("a1234"));
    }

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

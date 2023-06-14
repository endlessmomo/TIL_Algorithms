package programmers.Lv1;

public class FindMiddleWord {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("abcd"));
    }

    public static String solution(String s) {
        return s.substring((s.length() - 1) / 2, (s.length() + 1) / 2);
    }
}

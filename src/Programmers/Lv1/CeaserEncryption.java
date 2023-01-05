package Programmers.Lv1;

public class CeaserEncryption {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append((char) ((ch - 'A' + n) % 26 + 'A'));
            } else if(Character.isLowerCase(ch))
                sb.append((char) ((ch - 'a' + n) % 26 + 'a'));
            else
                sb.append(" ");
        }
        return sb.toString();
    }
}

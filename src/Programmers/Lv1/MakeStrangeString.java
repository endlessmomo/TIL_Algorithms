package Programmers.Lv1;

import java.util.Arrays;

public class MakeStrangeString {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        String[] array = s.split("");
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (String ch : array) {
            if (ch.equals(" ")) {
                sb.append(" ");
                count = 0;
                continue;
            }
            sb.append(count++ % 2 == 0 ? ch.toUpperCase() : ch.toLowerCase());
        }

        return sb.toString();
    }
}

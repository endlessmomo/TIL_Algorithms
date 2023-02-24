package Programmers.Lv2;

import java.util.ArrayList;
import java.util.List;

public class NewsCluster {
    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "FRENCH"));
        System.out.println(solution("handshake", "shake hands"));
        System.out.println(solution("aa1+aa2", "AAAA12"));
        System.out.println(solution("E=M*C^2", "e=m*c^2"));
    }

    public static int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List <String> list1 = new ArrayList <>();
        List <String> list2 = new ArrayList <>();

        // 부분 집합
        for (int i = 0; i < str1.length() - 1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i + 1);

            if(isVariable(c1, c2)) list1.add(str1.substring(i, i+2));
        }

        // 부분 집합2
        for (int i = 0; i < str2.length() - 1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i + 1);

            if(isVariable(c1, c2)) list2.add(str2.substring(i, i+2));
        }

        // 교집합
        List <String> interaction = new ArrayList <>();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.remove(list1.get(i))) {
                interaction.add(list1.get(i));
            }
        }

        list1.addAll(list2);

        return list1.size() == 0 ? 1 * 65536 : (int) ((double) interaction.size() / (double) list1.size() * 65536);
    }

    public static boolean isVariable(char c1, char c2) {
        return Character.isLetter(c1) && Character.isLetter(c2);
    }
}

package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKim {
    public static void main(String[] args) {
        String[] names = {"Jane", "Kim"};
        System.out.println(solution(names));
        System.out.println(solution2(names));
    }

    public static String solution(String[] names) {
        int idx = 0;

        for (String name : names) {
            if (name.equals("Kim")) {
                return "김서방은 " + idx + "에 있다";
            }
            idx++;
        }
        return "";
    }

    public static String solution2(String[] names) {
        List <String> name = Arrays.asList(names);

        return "김서방은 " + name.indexOf("Kim") + "에 있다";
    }
}

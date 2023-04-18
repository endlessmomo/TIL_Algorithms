package Programmers.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    static Map <String,Integer> scoreBoard = new HashMap <>();

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] res = new int[photo.length];

        for (int i = 0; i < name.length; i++) {
            scoreBoard.put(name[i], yearning[i]);
        }

        int idx = 0;
        for (String[] members : photo) {
            res[idx++] =  Arrays.stream(members)
                    .filter(scoreBoard::containsKey)
                    .mapToInt(scoreBoard::get)
                    .reduce(Integer::sum).orElse(0);
        }

        return res;
    }
}

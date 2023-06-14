package programmers.Lv1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Marathon {
    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        Map <String,Integer> map = new HashMap <>();
        String res = "";

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (String key : completion) {
            map.put(key, map.get(key) - 1);
        }

        Iterator <Map.Entry <String,Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry <String,Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                res = entry.getKey();
                return res;
            }
        }
        return null;
    }
}

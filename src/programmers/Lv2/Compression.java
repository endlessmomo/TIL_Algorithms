package programmers.Lv2;

import java.util.*;

public class Compression {
    static Map <String,Integer> directory = new HashMap <>();
    static List <Integer> res = new ArrayList <>();

    public static void main(String[] args) {
        //대문자로만 이뤄진 문자열
        String msg = "KAKAO";
        System.out.println(Arrays.toString(solution(msg)));
    }

    public static int[] solution(String msg) {
        int baseIdx = 1;
        for (int i = 'A'; i <= 'Z'; i++) {
            directory.put(String.valueOf((char) i), baseIdx++);
        }


        for (int i = 0; i < msg.length(); i++) {
            int interiorIdx = 1;

            while (i + interiorIdx <= msg.length() && directory.containsKey(msg.substring(i, i + interiorIdx))) {
                interiorIdx++;
            }

            if (i + interiorIdx > msg.length()) {
                res.add(directory.get(msg.substring(i)));
                break;
            }

            res.add(directory.get(msg.substring(i, i + interiorIdx - 1)));
            directory.put((msg.substring(i, i + interiorIdx)), baseIdx++);
            if (interiorIdx > 1) i += interiorIdx - 2;
        }


        System.out.println(directory);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

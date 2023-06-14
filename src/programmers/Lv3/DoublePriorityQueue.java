package programmers.Lv3;

import java.util.*;

public class DoublePriorityQueue {
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(Arrays.toString(solution(operations)));

        operations = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(solution(operations)));
    }

    public static int[] solution(String[] operations) {
        List <Integer> list = new ArrayList <>();

        for (String value : operations) {
            String[] data = value.split(" ");
            String op = data[0];
            int valueInt = Integer.parseInt(data[1]);

            switch (op) {
                case "I":
                    list.add(valueInt);
                    Collections.sort(list);
                    break;

                case "D":
                    if (list.size() == 0) {
                        continue;
                    }

                    if (valueInt > 0) {
                        list.remove(list.size() - 1);
                    } else {
                        list.remove(0);
                    }
                    break;
            }
        }

        if (list.size() == 0) return new int[]{0, 0};
        return new int[]{list.get(list.size() - 1), list.get(0)};
    }
}

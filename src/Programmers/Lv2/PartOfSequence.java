package Programmers.Lv2;

import java.util.HashSet;
import java.util.Set;

public class PartOfSequence {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 9, 1, 1, 4}));
    }

    public static int solution(int[] elements) {
        Set <Integer> valueSet = new HashSet <>();

        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = i; j <= ( i - 1 + elements.length); j++) {
                sum += elements[j % elements.length];
                valueSet.add(sum);
            }
        }

        return valueSet.size();
    }
}

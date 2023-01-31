package Linear.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(intervalReverse(list, 1, 3));
    }

    public static List <Integer> intervalReverse(List <Integer> list, int start, int end) {
        int idx = 0;

        for (int i = start; i < (start + end) / 2; i++) {
            Collections.swap(list, i,  end - idx);
            idx++;
        }
        return list;
    }
}

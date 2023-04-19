package DataStructure.Linear.Deque;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        System.out.println(reOrder(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static List <Integer> reOrder(int[] nums) {
        List <Integer> res = new ArrayList <>();
        Deque <Integer> deque = new LinkedList <>();

        Arrays.stream(nums).forEach(deque::add);

        while (!deque.isEmpty()) {
            res.add(deque.removeFirst());

            if (!deque.isEmpty()) {
                res.add(deque.removeLast());
            }
        }

        return res;
    }
}

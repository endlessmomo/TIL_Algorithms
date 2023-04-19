package DataStructure.Linear.Deque;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        System.out.println(palindrome(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1)));
        System.out.println(palindrome(Arrays.asList(1,3,5,4,3,5,3,1)));
    }

    public static boolean palindrome(List <Integer> list) {
        Deque <Integer> deque = new LinkedList <>();

        list.forEach(deque::add);

        for (int i = 0; i < list.size() / 2; i++) {
            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }
        return true;
    }
}

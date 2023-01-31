package Linear.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class P2 {
    public static void main(String[] args) {
        System.out.println(getJosephusPermutation(5, 2));
    }

    public static ArrayList <Integer> getJosephusPermutation(int N, int K) {
        Queue <Integer> queue = new LinkedList <>();
        ArrayList <Integer> result = new ArrayList <>();

        IntStream.rangeClosed(1, N).forEach(queue::add);

        int cnt = 0;
        while (!queue.isEmpty()) {
            int data = queue.remove();
            cnt += 1;

            if (cnt % K == 0) {
                result.add(data);
            } else {
                queue.add(data);
            }
        }
        return result;
    }
}

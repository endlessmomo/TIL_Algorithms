package linear.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class P1 {
    public static void main(String[] args) {
        System.out.println("결과 : " +findLastCard( 4));
    }

    public static int findLastCard(int N) {
        Queue <Integer> queue = new LinkedList <>();

        IntStream.rangeClosed(1, N).forEach(x -> queue.add(x));
        System.out.println("셔플 전 : " + queue);

        while (queue.size() != 1) {
            shuffle(queue);
        }

        return queue.remove();
    }

    public static void shuffle(Queue <Integer> queue) {
        queue.remove();
        int data = queue.remove();
        queue.add(data);
        System.out.println("셔플 후 : " + queue);
    }
}

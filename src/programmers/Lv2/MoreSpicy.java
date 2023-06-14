package programmers.Lv2;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println(solution(scoville, 7));
    }

    public static long solution(int[] scoville, int k) {
        PriorityQueue <Long> heap = new PriorityQueue <>();

        int res = 0;

        for (int value : scoville) {
            heap.add((long) value);
        }

        while (heap.peek() < k) {
            if(heap.size() == 1){
                return -1;
            }
            
            heap.add(heap.poll() + (heap.poll() * 2));
            res++;
        }
        return res;
    }
}

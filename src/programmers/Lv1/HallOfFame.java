package programmers.Lv1;

import java.util.*;

public class HallOfFame {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[] {10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }

    public static int[] solution(int k, int[] score){
        PriorityQueue<Integer> heap = new PriorityQueue();
        List <Integer> res = new ArrayList <>();

        for(int value : score) {
            if(heap.size() == k){
                heap.add(value);
                heap.remove();
                res.add(heap.peek());
                continue;
            }

            heap.add(value);
            res.add(heap.peek());
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

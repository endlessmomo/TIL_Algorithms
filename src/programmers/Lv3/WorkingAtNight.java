package programmers.Lv3;

import java.util.Collections;
import java.util.PriorityQueue;

public class WorkingAtNight {
    public static void main(String[] args) {
        int[] works = {4, 3, 3};
        System.out.println(solution(4, works));

        int[] works2 = {2, 1, 2};
        System.out.println(solution(1, works2));

        int[] works3 = {1, 1};
        System.out.println(solution(3,  works3));
    }

    public static long solution(int n, int[] works) {
        PriorityQueue <Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
        long res = 0;

        for (int i = 0; i < works.length; i++) {
            pq.add(works[i]);
        }

        if (pq.stream().mapToInt(e -> e).sum() < n) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            int temp = pq.poll();
            pq.add(temp - 1);
        }

        while (!pq.isEmpty()) {
            res+= Math.pow(pq.poll(), 2);
        }

        return res;
    }
}

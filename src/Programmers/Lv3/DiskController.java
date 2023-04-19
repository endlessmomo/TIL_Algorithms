package Programmers.Lv3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(solution(jobs));
    }

    public static int solution(int[][] jobs) {
        int idx = 0;
        int count = 0;
        int end = 0;
        int total = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue <int[]> pq = new PriorityQueue <>(((o1, o2) -> o1[1] - o2[1]));

        while (count < jobs.length) {

            while (idx < jobs.length && jobs[idx][0] <= end) {
                pq.add(new int[]{jobs[idx][0], jobs[idx++][1]});
            }

            if (pq.isEmpty()) {
                end = jobs[idx][0];
            } else {
                int[] data = pq.poll();

                // 끝난 후 추가적으로 지난 타이밍
                total += data[1] - data[0] + end;
                end += data[1];
                count++;
            }
        }

        return (int) Math.floor(total / jobs.length);
    }
}

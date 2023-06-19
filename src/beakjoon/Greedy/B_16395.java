package beakjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_16395 {
    static Queue<Long> queue = new LinkedList<>();
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        queue.add(Long.parseLong(st.nextToken()));
        int target = Integer.parseInt(st.nextToken());
        boolean isFind = false;

        while (!queue.isEmpty() && !isFind) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                long val = queue.poll();

                if (val == target) {
                    isFind = true;
                    break;
                }

                if (val * 2 <= target) queue.add(val * 2);
                if ((val * 10) + 1 <= target) queue.add(val * 10 + 1);
            }
            cnt++;
        }
        System.out.println(isFind ? cnt : -1);
    }
}

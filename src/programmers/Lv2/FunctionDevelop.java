package programmers.Lv2;

import java.util.Arrays;

public class FunctionDevelop {
    public static void main(String[] args) {
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[100];

        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + speeds[i] * day < 100) {
                day++;
            }
            days[day]++;
        }
        return Arrays.stream(days).filter(i -> i != 0).toArray();
    }
}

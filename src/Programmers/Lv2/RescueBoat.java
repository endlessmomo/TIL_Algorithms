package Programmers.Lv2;

import java.util.Arrays;

public class RescueBoat {
    public static void main(String[] args) {
        int[] people = new int[]{50, 50, 70, 80};
        int limit = 100;

        System.out.println(solution(people, limit));
    }

    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int times = 0;
        int idx = 0;
        for (int i = people.length - 1; i >= idx; i--) {
            if(people[i] + people[idx] <= limit) {
                times++;
                idx++;
            } else
                times++;
        }

        return times;
    }
}

package Programmers.Lv2;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = new int[]{2, 1, 3, 2};
        int location = 2;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        PriorityQueue <Integer> priorityQueue = new PriorityQueue <>(Collections.reverseOrder());
        int answer = 0;

        for (int value : priorities) {
            priorityQueue.add(value);
        }

        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if(priorityQueue.peek() == priorities[i]){
                    if(i == location){
                        return ++answer;
                    }
                    answer++;
                    priorityQueue.poll();
                }
            }
        }
        return answer;
    }
}



package Programmers.Lv1;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class reserve {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1,2}, new int[]{2, 3}));
    }

    static boolean[] hasReserve;

    public static int solution(int n, int[] lost, int[] reserve) {
        hasReserve = new boolean[n + 2];
        hasReserve[0] = false;

        for (int value : reserve) {
            hasReserve[value] = true;
        }

        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(toList());
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(toList());

        return n - canNotAttend(lostList, reserveList);
    }

    public static int canNotAttend(List<Integer> lostList, List<Integer> reserve) {
        int lostPeople = lostList.size();

        for (int value : lostList) {
            if (reserve.contains(value) && hasReserve[value]) {
                hasReserve[value] = false;
                lostPeople--;
                reserve.remove(value);
            }
        }

        for(int value : lostList) {
            if (hasReserve[value - 1] && reserve.contains(value)) {
                hasReserve[value - 1] = false;
                lostPeople--;
            } else if (hasReserve[value + 1] && reserve.contains(value)) {
                hasReserve[value +  1] = false;
                lostPeople--;
            }
        }
        return lostPeople;
    }
}

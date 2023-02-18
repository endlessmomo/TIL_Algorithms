package Backjoon;

import java.util.*;
import java.util.stream.Collectors;

public class p1092 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int crane_c = sc.nextInt();
        String crane_s = sc.next();

        int box_c = sc.nextInt();
        String box_s = sc.next();
        System.out.println(solution(crane_c, crane_s, box_c, box_s));
    }

    public static int solution(int crane_c, String crane_s, int box_c, String box_s) {
        List <Integer> crane_L = Arrays.stream(crane_s.split("")).map(Integer::valueOf).collect(Collectors.toList());
        List <Integer> box_L = Arrays.stream(box_s.split("")).map(Integer::valueOf).collect(Collectors.toList());

        crane_L.sort(Comparator.reverseOrder());
        box_L.sort(Comparator.reverseOrder());

        int res = 0;

        while (!box_L.isEmpty()) {
            int idx = 0;

            for (int i = 0; i < crane_c; ) {
                if(idx == box_L.size()){
                    break;
                } else if (crane_L.get(i) >= box_L.get(idx)){
                    box_L.remove(idx);
                    i++;
                } else
                    idx++;
            }
            res++;
        }
        return res;
    }
}

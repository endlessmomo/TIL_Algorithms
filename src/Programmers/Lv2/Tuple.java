package Programmers.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tuple {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(solution("{{20,111},{111}}")));
    }

    public static int[] solution(String s) {
        String[] arr = s.substring(2, s.length()-2).split("},\\{");

        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        List<Integer> list = new ArrayList<>();

        for(String value : arr){
            for(String t : value.split(",")){
                list.add(Integer.parseInt(t));
            }
        }

        return list.stream().distinct().mapToInt(Integer::valueOf).toArray();
    }
}

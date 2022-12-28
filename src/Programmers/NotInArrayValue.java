package Programmers;

import java.util.Arrays;

public class NotInArrayValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,0};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr){
        return 55 - Arrays.stream(arr).sum();
    }
}

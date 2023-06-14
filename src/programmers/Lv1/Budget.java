package programmers.Lv1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4}, 9));
    }

    public static int solution(int[] d, int budget){
        Arrays.sort(d);
        int res = 0;

        for(int value : d){
            if(budget - value < 0) {
                break;
            }
            res ++;
            budget -= value;
        }

        return res;
    }
}

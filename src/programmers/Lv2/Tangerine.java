package programmers.Lv2;

import java.util.*;

public class Tangerine {
    public static void main(String[] args) {
        int[] tangerine = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(6, tangerine));

        tangerine = new int[]{1, 3, 2, 5,4,5,2,3};
        System.out.println(solution(4, tangerine));

        tangerine = new int[]{1, 1,1,1,2,2,2,3};
        System.out.println(solution(2, tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        Map <Integer,Integer> tangerineClassify = new HashMap <>();
        List <Integer> classify = new ArrayList <>();
        int sum = 0;
        int res = 0;

        for (int size : tangerine) {
            tangerineClassify.put(size, tangerineClassify.getOrDefault(size, 0) + 1);
        }

        for (int key : tangerineClassify.keySet()) {
            classify.add(tangerineClassify.get(key));
        }

        classify.sort(Collections.reverseOrder());

        for (int i = 0; i < classify.size(); i++) {
            if(sum >= k ){
                break;
            }
            res++;
            sum += classify.get(i);
        }

        return res;
    }
}

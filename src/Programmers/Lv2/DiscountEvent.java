package Programmers.Lv2;

import java.util.*;

public class DiscountEvent {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

       /* String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {2, 2, 2, 2, 1};
        String[] discount = {"cheese", "orange", "orange", "banana", "apple", "apple", "banana", "rice", "pork", "pork", "pork", "rice", "pot", "banana"};*/

        /*String[] want = {"apple"};
        int[] number = {1};
        String[] discount = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "apple"};*/

        System.out.println("number= " + Arrays.stream(number).reduce(Integer::sum).getAsInt());
        System.out.println("discount = " + discount.length);

        System.out.println(solution(want, number, discount));
    }
    static Map <String,Integer> wantMap;

    public static int solution(String[] want, int[] number, String[] discount) {
        List <String> discountList = new ArrayList <>(Arrays.asList(discount));
        wantMap = new HashMap <>();
        int res = 0;

        for (int i = 0; i < number.length; i++) {
            if (!discountList.contains(want[i])) {
                return 0;
            }
            wantMap.put(want[i], number[i]);
        }

        for (int start = 0; start <= discount.length - 10; start++) {
            if (checkDiscountDay(start, discount)) {
                res++;
            }
        }
        return res;
    }

    public static boolean checkDiscountDay(int start, String[] discount) {
        Map <String,Integer> map = new HashMap <>();
        int end = start + 9;

        for (int i = start; i < (start + 10 )/ 2; i++) {
            String item = discount[i];
            String item2 = discount[end--];
            map.put(item, map.getOrDefault(item, 0) + 1);
            map.put(item2, map.getOrDefault(item2, 0)+1);
        }

        System.out.println(wantMap);
        System.out.println(map);
        System.out.println("=============");

        for (String key : wantMap.keySet()) {
            if(!map.containsKey(key) || wantMap.get(key)> map.get(key)){
                return false;
            }
        }

        return true;
    }

    // 슬라이딩 문제 풀이
}

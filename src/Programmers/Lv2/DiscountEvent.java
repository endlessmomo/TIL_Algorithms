package Programmers.Lv2;

import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {
    static public int res;
    static boolean flag;
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}
                , new int[]{3, 2, 2, 2, 1}
                , new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        Map <String,Integer> wantMap = new HashMap <>();
        res = 0;

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 10; i++) {
            checkDiscountDay(wantMap, i, discount);
        }

        return  res;
    }

    public static void checkDiscountDay(Map <String,Integer> wantMap
            , int startIdx
            , String[] discount)
    {
        Map <String,Integer> map = new HashMap <>();

        for (int i = startIdx; i < startIdx + 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }

        for(String key : map.keySet()){
            if(wantMap.containsKey(key)){
                int sum = wantMap.get(key) - map.get(key);

                if(sum <= 0){
                    wantMap.remove(key);
                }
            }
        }

        if(!wantMap.isEmpty()){
            res++;
        }
    }
}

package Programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class cache {
    public static void main(String[] args) {
        String[] cities = new String[]{"a", "b", "c", "a", "b"};

        System.out.println(solution(2, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        Queue <String> cache = new LinkedList <>();
        int res = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }
        for (int i = 0; i < cities.length; i++) {

            String city = cities[i].toLowerCase();

            if (cache.remove(city)) {
                res += 1;
                cache.add(city);
            } else {
                res+=5;

                if(cache.size() >= cacheSize){
                    cache.remove();
                }
                cache.add(city);
            }
        }
        return res;
    }
}
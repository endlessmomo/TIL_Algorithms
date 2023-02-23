package Programmers.Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class cache {
    public static void main(String[] args) {
       String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//        String[] cities = new String[]{"Seoul","Seoul","Seoul"};

        System.out.println(solution2(3, cities));
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
                res += 5;

                if (cache.size() >= cacheSize) {
                    cache.remove();
                }
                cache.add(city);
            }
        }
        return res;
    }

    public static int solution2(int cacheSize, String[] cities) {
        Queue <String> cache = new LinkedList <>();
        int res = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            if(cache.contains(city)){
                cache.remove(city);
                cache.add(city);
                res += 1;
            } else {
                if(cache.size() >= cacheSize){
                    cache.remove();
                }
                res += 5;
                cache.add(city);
            }
        }
        return res;
    }
}
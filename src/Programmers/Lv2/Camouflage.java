package Programmers.Lv2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int res = 1;

        Map <String, Integer> clothesMap = new HashMap <>();

        for (String[] clothe : clothes) {
            clothesMap.put(clothe[1], clothesMap.getOrDefault(clothe[1], 0) + 1);
        }

        for (String key : clothesMap.keySet()){
            res *= clothesMap.get(key) + 1;
        }

        return res - 1;
    }
}

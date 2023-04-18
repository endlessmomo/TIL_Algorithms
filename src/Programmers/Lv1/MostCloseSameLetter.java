package Programmers.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostCloseSameLetter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }
    static Map <String, Integer> map = new HashMap <>();
    public static int[] solution(String word) {
        int[] res = new int[word.length()];

        int idx = 0;
        for(String alphabet : word.split("")){
           if(!map.containsKey(alphabet)){
               res[idx] = -1;
           } else {
               res[idx] = idx - map.get(alphabet);
           }

           map.put(alphabet, idx);
           idx++;
        }
        return res;
    }
}

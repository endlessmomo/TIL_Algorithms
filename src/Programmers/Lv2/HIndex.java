package Programmers.Lv2;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = new int[]{3, 0, 6, 1, 5};

        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int res = 0;

        for(int i = 0; i < citations.length; i++){
            int h = citations.length - 1;

            if(citations[i] >= h - i){
                res = h;
                break;
            }
        }
        return res;
    }
}

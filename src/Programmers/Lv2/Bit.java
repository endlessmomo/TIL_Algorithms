package Programmers.Lv2;

import java.util.Arrays;

public class Bit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(7^8));
        System.out.println(Integer.toBinaryString(((7^8)>>2 )));
        System.out.println(Arrays.toString(solution(new long[] {2,7})));
    }


    public static long[] solution(long[] numbers){
        long[] answer = numbers.clone();
        for(int i = 0; i< answer.length; i++){
            answer[i]++;
            answer[i] += (answer[i]^numbers[i])>>2;
        }
        return answer;
    }
}

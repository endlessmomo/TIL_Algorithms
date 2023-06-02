package Programmers.Lv2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(solution("1924", 2));
        System.out.println(solution("1231234", 3));
    }

    public static String solution(String number, int k){
        List <String> numbers = Arrays.stream(number.split("")).sorted().collect(Collectors.toList());

        for (int i = 0; i < k; i++){
            String tmp = "";
            boolean isDeleted = false;
            for(String value : number.split("" )){
                if(numbers.get(i).equals(value) && !isDeleted){
                    isDeleted = true;
                    continue;
                }
                tmp += value;
            }
            number = tmp;
        }
        return number;
    }
}

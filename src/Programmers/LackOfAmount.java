package Programmers;

import java.util.stream.LongStream;

public class LackOfAmount {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count){
        long reducing = LongStream.rangeClosed(1,count).map(i -> i * price).reduce((x,y) -> x + y).orElse(0);

        return money - reducing > 0 ? 0 : Math.abs(money -reducing);
    }
}

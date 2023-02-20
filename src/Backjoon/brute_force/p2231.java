package Backjoon.brute_force;

import java.util.Scanner;

public class p2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        String value_s = String.valueOf(value);
        sc.close();

        int res = 0;
        for (int i = value - (9 * value_s.length()); i < value; i++) {
            int number = i;
            int sum = 0;
            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if ((i + sum) == value) {
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
}

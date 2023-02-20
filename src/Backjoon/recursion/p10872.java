package Backjoon.recursion;

import java.util.Scanner;

public class p10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

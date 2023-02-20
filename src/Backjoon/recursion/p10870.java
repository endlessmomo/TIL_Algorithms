package Backjoon.recursion;

import java.util.Scanner;

public class p10870 {
    public static int[] fibonacci = new int[21];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();

        fibonacci();
        System.out.println(fibonacci[n]);
        System.out.println(fibonacciRecursion(n));
    }

    public static void fibonacci(){
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i -2];
        }
    }

    public static int fibonacciRecursion(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
}

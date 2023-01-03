package Programmers.Lv1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MakeStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int col = sc.nextInt();
        int row = sc.nextInt();

        IntStream.rangeClosed(1, col).forEach(s -> sb.append("*"));
        IntStream.rangeClosed(1, row).forEach(s -> System.out.println(sb.toString()));
    }
}

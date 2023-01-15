package Programmers.Lv1;

import java.util.Arrays;
import java.util.List;

public class Lcm_Gcd {
    public static void main(String[] args) {
        Arrays.stream(solution(2, 5)).forEach(i -> System.out.print(i + " " ));
    }

    public static int[] solution(int n, int m){
        int gcd = getGcd(n,m);
        return new int[]{gcd, (n*m)/gcd};
    }

    private static int getGcd(int n, int m) {
        if (m == 0) return n;
        return getGcd(m ,n%m);
    }
}

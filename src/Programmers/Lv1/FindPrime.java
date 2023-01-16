package Programmers.Lv1;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {
    public static int res = 0;
    public static boolean[] primeArr = new boolean[3000];
    public static boolean[] checked;

    public static int solution(int[] nums) {
        findPrime();
        checked = new boolean[nums.length];

        isPrime(0, 0, 0, nums);
        return res;
    }

    public static void isPrime(int start, int sum, int count, int[] nums) {
        if (count == 3) {
            if (!primeArr[sum]) res++;
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (!checked[i]) {
                checked[i] = true;
                isPrime(i + 1, sum + nums[i], count + 1, nums);
                checked[i] = false;
            }
        }
    }

    public static void findPrime() {
        primeArr[0] = primeArr[1] = true;

        for (int i = 2; i < 3000; i++) {

            for (int j = i * 2; j < 3000; j += i) {
                primeArr[j] = true;
            }
        }
    }
}

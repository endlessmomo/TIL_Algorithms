package Programmers.Lv2;

public class NPowFindPrime {
    public static boolean isPrime(long n) {
        if (n == 1) return false;
        else if (n == 2) return true;

        for (long i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getBase(int n, int k) {
        StringBuilder base = new StringBuilder();
        while (n > 0) {
            base.append(n % k);
            n /= k;
        }

        return base.reverse().toString();
    }

    public static int solution(int n, int k) {
        int res = 0;
        String s = getBase(n, k);

        String[] arr = s.split("0");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isBlank()) {
                if (isPrime(Long.parseLong(arr[i]))) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(solution(437674, 3));
        System.out.println(solution(110011, 10));
    }
}

package programmers.Lv1;

public class Cola {
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
        System.out.println(solution(3, 1, 20));
    }

    public static int solution(int a, int b, int n) {
        int res = 0;

        while(n >= a){
            int rest = 0;

            res +=  (n / a) * b;
            rest = n % a;

            n = (n/a) * b + rest;
        }

        return res;
    }
}

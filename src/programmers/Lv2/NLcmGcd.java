package programmers.Lv2;

public class NLcmGcd {
    public static void main(String[] args) {
        int[] value = new int[]{2, 6, 8, 14};

        System.out.println(solution(value));
    }

    public static int solution(int[] value){
        int gcd = getGcd(value[0], value[1]);
        int lcm = value[0] * value[1] / gcd;

        for (int i = 2; i < value.length; i++) {
            gcd = getGcd(lcm, value[i]);
            lcm = lcm * value[i] / gcd;
        }

        return lcm;
    }

    public static int getGcd(int a, int b) {
        int r = a % b;
        if (r == 0) return b;
        else return getGcd(b, r);
    }
}

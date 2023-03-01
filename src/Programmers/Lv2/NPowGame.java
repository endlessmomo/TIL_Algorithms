package Programmers.Lv2;

public class NPowGame {
    public static void main(String[] args) {
        System.out.println(solution(2,4,2,1));
        System.out.println(solution(16,16,2,1));
    }

    public static String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        String res = "";

        int num = 0;

        while (sb.length() < m * t){
            sb.append(getBase(num++, n));
        }

        for(int i = p -1; i  < m*t; i += m){
            res += sb.charAt(i);
        }

        return res;
    }

    public static String getBase(int value, int base) {
        StringBuilder sb = new StringBuilder();
        if (value == 0){
            return "0";
        }
        while (value > 0) {
            sb.append(isMoreThen(value % base));
            value /= base;
        }

        return sb.reverse().toString();
    }

    public static char isMoreThen(int value) {
        if (value >= 10)
            return (char) ('A' + value - 10);

        return (char) (value + '0');
    }
}

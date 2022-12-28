package Programmers;

public class WaterMellon {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }
        return sb.toString();
    }
}

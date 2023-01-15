package Programmers.Lv1;

public class ReverseTernary {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    public static int solution(int n){
        return Integer.parseInt(toTernaryReverse(n), 3);
    }

    public static String toTernaryReverse(int n){
        StringBuilder reverseTernary = new StringBuilder();

        while(n > 0){
            reverseTernary.append(n % 3);
            n /= 3;
        }
        return reverseTernary.toString();
    }
}

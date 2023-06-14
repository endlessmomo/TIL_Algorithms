package programmers.Lv2;

import java.util.HashSet;
import java.util.Set;

public class Prime {
    public static void main(String[] args) {
        System.out.println(solution("17"));
    }

    public static boolean[] visited;
    public static Set <Integer> set = new HashSet <>();

    public static int solution(String number) {
        visited = new boolean[number.length()];

        dfs(0, "", number);

        return (int) set.stream().filter(Prime::isPrimeNumber).count();
    }

    public static void dfs(int cnt, String sum, String number) {
        if (cnt == number.length()) {
            return;
        }

        for (int i = 0; i < number.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(cnt + 1, sum + number.charAt(i), number);
                set.add(Integer.parseInt(sum + number.charAt(i)));
                visited[i] = false;
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

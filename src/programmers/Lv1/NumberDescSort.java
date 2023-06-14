package programmers.Lv1;

public class NumberDescSort {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long  solution(long n){
        StringBuilder sb = new StringBuilder();

        String.valueOf(n).chars()
                .sorted()
                .map(ch -> (char) ch - '0')
                .forEach(sb::append);

        return Long.parseLong(sb.reverse().toString());
    }
}

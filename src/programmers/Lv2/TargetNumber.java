package programmers.Lv2;

public class TargetNumber {
        static int res = 0;

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

    public static int solution(int[] numbers, int target) {
        bfs(numbers, 0, target, 0);

        return res;
    }

    public static void bfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                res++;
            }
        } else {
            bfs(numbers, depth + 1, target, sum + numbers[depth]);
            bfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }
}

package Programmers.Lv1;

public class Collatz {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }

    public static int solution(long num) {
        int count = 0;

        while ( num != 1 && num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            count++;

            if(count == 500){
                return -1;
            }
        }
        return count;
    }
}

package programmers.Lv2;

public class Coloring {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, new int[]{2, 3, 6}));
    }

    public static int solution(int n, int m, int[] section) {
        // n -> 원소의 갯수
        // m -> 롤러의 범위
        // section -> 칠해야하는 영역
        int max = 0;
        int res = 0;
        for (int i = 0; i < section.length; i++) {
            if(section[i] < max){
                continue;
            }

            max = section[i] + m;
            res++;
        }

        return res;
    }
}


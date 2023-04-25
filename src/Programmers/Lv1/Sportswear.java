package Programmers.Lv1;

import java.util.Arrays;

public class Sportswear {
    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int n = 5;

        /*int[] lost = {2,4};
        int[] reserve = {5};
        int n = 5;*/

        System.out.println(solution(n, lost, reserve));
    }

    /*
     * 자기걸 자기가 도난당했을 경우 피해 없음
     * 도난당한 경우 주변인이 가지고 있으면 빌리면 됨
     * 주변사람이 없으면 수업 참여 불가
     * 최대로 수업을 들을 수 있는 학생의 수를 구해라
     */
    public static int solution(int n, int[] lost, int[] reserve) {
        int inClass = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    inClass++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    inClass++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return inClass;
    }
}

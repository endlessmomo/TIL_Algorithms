package Programmers.Lv1;

import java.util.Arrays;

public class Dart {
    public static void main(String[] args) {
        String str = "1S2D*3T";
        System.out.println(solution(str));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D2S3T*"));
    }

    public static int solution(String str) {
        // 점수 분할
        int[] score = new int[3];
        int res = 0;
        int idx = 0;
        String valStr = "";
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (Character.isDigit(letter)) {
                valStr += letter;
            } else if (letter == 'S' || letter == 'D' || letter == 'T') {
                score[idx] = Integer.parseInt(valStr);

                switch (letter) {
                    case 'S':
                        score[idx] = (int) Math.pow(score[idx++], 1);
                        break;
                    case 'D':
                        score[idx] = (int) Math.pow(score[idx++], 2);
                        break;
                    case 'T':
                        score[idx] = (int) Math.pow(score[idx++], 3);
                        break;
                }
                valStr = "";
            } else {
                switch (letter) {
                    case '*':
                        if(idx > 1) {
                            score[idx - 2] *= 2;
                        }

                        score[idx - 1 ] *= 2;
                        break;

                    case '#':
                        score[idx - 1] *= -1;
                        break;
                }
            }
        }

        for (int val : score) {
            res += val;
        }

        return res;
    }
}

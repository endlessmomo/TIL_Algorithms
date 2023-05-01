package Programmers.Lv1;

import java.util.Objects;

public class Card {
    public static void main(String[] args) {

        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(card1, card2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int card1_cnt = 0;
        int card2_cnt = 0;

        for (int i = 0; i < goal.length; i++) {
            if (card1_cnt < cards1.length && cards1[card1_cnt].equals(goal[i])) {
                card1_cnt++;
                continue;
            }

            if (card2_cnt < cards2.length &&  cards2[card2_cnt].equals(goal[i])) {
                card2_cnt++;
                continue;
            }

            answer = "No";
            return answer;
        }
        return "Yes";
    }
}

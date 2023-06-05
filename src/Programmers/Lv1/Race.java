package Programmers.Lv1;
package Backjoon.Devide_Conquer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Race {
    static Map<String, Integer> rankMap = new HashMap<>();
    static Map<Integer, String> nameMap = new HashMap<>();

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
            nameMap.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int calling_player_rank = rankMap.get(callings[i]);
            String calling_player_name = nameMap.get(calling_player_rank);

            String front_player_name = nameMap.get(calling_player_rank - 1);

            // 현재 이름 불린 선수 처리
            rankMap.put(calling_player_name, calling_player_rank-1);
            nameMap.put(calling_player_rank-1, calling_player_name);

            // 앞 선수 처리R
            rankMap.put(front_player_name, calling_player_rank);
            nameMap.put(calling_player_rank, front_player_name);
        }

        System.out.println(Arrays.toString(nameMap.values().toArray(String[]::new)));
    }
}


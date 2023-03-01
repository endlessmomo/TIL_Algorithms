package Programmers.Lv2;

import java.util.*;

public class OpenChattingRoom {
    public static void main(String[] args) {
        String[] records = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(records)));
    }

    public static String[] solution(String[] records) {
        Map <String,String> userMap = new HashMap <>();
        List <String[]> res = new ArrayList <>();
        int idx = 0;
        for (String record : records) {
            String[] info = record.split(" ");

            String state = info[0];
            String user = info[1];


            if (state.equals("Enter")) {
                userMap.put(user, info[2]);
                res.add(new String[]{user, "님이 입장했습니다."});
            } else if (state.equals("Change")) {
                userMap.put(user, info[2]);
            } else if (state.equals("Leave")) {
                res.add(new String[]{user, "님이 나갔습니다."});
            }
        }

        return res.stream().map(k -> userMap.get(k[0]) + k[1]).toArray(String[]::new);
    }
}

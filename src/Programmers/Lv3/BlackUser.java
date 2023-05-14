package Programmers.Lv3;

import java.util.HashSet;
import java.util.Set;

public class BlackUser {
    static String[] user_Ids;
    static String[] banned_Ids;
    static Set <Set <String>> res = new HashSet <>();


    public static void main(String[] args) {
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc", "abc184"};
        String[] banned_id = {""};

        System.out.println(solution(user_id, banned_id));
    }

    public static int solution(String[] user_id, String[] banned_id) {
        user_Ids = user_id;
        banned_Ids = banned_id;

        dfs(new HashSet <>(), 0);
        return res.size();
    }

    public static void dfs(Set <String> set, int depth) {
        if (depth == banned_Ids.length) {
                res.add(new HashSet <>(set));
            return;
        }

        for (int i = 0; i < user_Ids.length; i++) {
            if (set.contains(user_Ids[i])) {
                continue;
            }

            if (comparing(user_Ids[i], banned_Ids[depth])) {
                set.add(user_Ids[i]);
                dfs(set, depth + 1);
                set.remove(user_Ids[i]);
            }
        }
    }

    public static boolean comparing(String user, String banner) {
        if (user.length() != banner.length()) {
            return false;
        }

        for (int i = 0; i < user.length(); i++) {
            if (banner.charAt(i) != '*' && user.charAt(i) != banner.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

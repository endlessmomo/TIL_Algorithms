package programmers.Lv2;

import java.util.ArrayList;
import java.util.List;

public class VowelDictionary {
    public static String[] vowel = {"A", "E", "I", "O", "U"};
    public static List <String> res = new ArrayList <>();
    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
        System.out.println(solution("AAAE"));
        System.out.println(solution("I"));
    }

    public static int solution(String word) {
        for (int i = 0; i < 5; i++) {
            dfs(String.valueOf(vowel[i]));
        }

        System.out.println(res);
        return res.indexOf(word) + 1;
    }

    public static void dfs(String str){
        res.add(str);

        if(str.length() == 5){
            return ;
        }

        for(int i = 0; i < 5; i++){
            dfs(str + vowel[i]);
        }
    }
}

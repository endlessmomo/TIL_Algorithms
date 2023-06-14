package programmers.Lv3;

public class WordChange {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin, target, words));
    }

    static boolean[] used;
    static int res;

    public static int solution(String begin, String target, String[] words) {
        used = new boolean[words.length];

        dfs(begin, target, 0, words);
        return res;
    }

    public static void dfs(String begin, String target, int cnt, String[] words){
        if(begin.equals(target)){
            res = cnt;
            return ;
        }

        for(int i = 0; i < words.length; i++){
            if(used[i]){
                 continue;
            }

            int sameCnt = 0;
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) == begin.charAt(j)){
                    sameCnt++;
                }
            }

            if(sameCnt == begin.length() - 1){
                used[i] = true;
                dfs(words[i], target, cnt + 1, words);
                used[i] = false;
            }
         }

    }

    public static int compare(String s1, String s2){
        int cnt = 0;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
}

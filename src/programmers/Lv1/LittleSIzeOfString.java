package programmers.Lv1;

public class LittleSIzeOfString {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
    }

    public static int solution(String s, String p){
        int cnt = 0;
        int len = p.length();
        Long value = Long.parseLong(p);
        for(int i = 0; i < s.length() - len + 1; i++){
            if(Long.parseLong(s.substring(i, i+len)) <= value){
                cnt++;
            }
        }
        return cnt;
    }
}

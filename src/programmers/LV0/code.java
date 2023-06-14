package programmers.LV0;

public class code {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        System.out.println(solution(code));
    }

    public static String solution(String code) {
        String[] codes = code.split("");
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals("1")) {
                flag = !flag;
                continue;
            }

            sb.append(flag ? (i % 2 == 0 ? codes[i] : "") : (i % 2 == 0 ? "" : codes[i]));
        }
        return sb.toString().equals("") ? "EMPTY" : sb.toString();
    }
}

package Programmers;

public class HidePhoneNumber {
    public static void main(String[] args) {
        System.out.println(solution("01032374176"));
    }

    public static String solution(String ph){
        return ph.replaceAll(".(?=.{4})", "*");
    }
}

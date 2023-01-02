package Programmers;

public class BasicStringTreat {
    public static void main(String[] args) {
        System.out.println(solution("a1234"));
    }

    public static boolean solution(String s){
       for(char c : s.toCharArray()){
           if(!Character.isDigit(c)){
               return false;
           }
       }
       return true;
    }
}

package Linear.LinkedList;

import java.util.Arrays;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        List <Integer> palindrome;

        palindrome = Arrays.asList(1,3,5,3,1);
        System.out.println(isPalindrome(palindrome));

        palindrome = Arrays.asList(3,5,5,3);
        System.out.println(isPalindrome(palindrome));

        palindrome = Arrays.asList(1,3,5,3);
        System.out.println(isPalindrome(palindrome));

    }

    public static boolean isPalindrome(List<Integer> palindrome){
        int size = palindrome.size();

        for(int i = 0; i < size / 2; i++){
            if(!palindrome.get(i).equals(palindrome.get(size - 1 - i))){
                return false;
            }
        }
        return true;
    }
}

package programmers.Lv2;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumberPre {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        Map <String,Integer> phoneBook = new HashMap <>();

        for (int i = 0; i < phone_book.length; i++) {
            phoneBook.put(phone_book[i], i);
        }

        for(int i = 0; i <phoneBook.size(); i++){
            for(int j = 1; j < phone_book[i].length(); j++){
                if(phoneBook.containsKey(phone_book[i].substring(0, j))){
                    return false;
                }
            }
        }

        return true;
    }
}


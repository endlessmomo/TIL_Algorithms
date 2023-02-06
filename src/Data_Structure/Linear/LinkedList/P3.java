package Data_Structure.Linear.LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P3 {
    public static void main(String[] args) {
        String[] words = {"apple", "watermelon", "banana", "apricot", "kiwi", "blueberry", "cherry", "orange"};
        classify(words);
    }

    public static void classify(String[] words) {
        List <List <String>> list = new ArrayList <>();
        Set <Character> set = new HashSet <>();

        for (String word : words) {
            set.add(word.charAt(0));
        }

        for (Character ch : set) {
            List<String> classifyList = new ArrayList<>();
            for (String word : words) {
                if (word.charAt(0) == ch) {
                    classifyList.add(word);
                }
            }
            list.add(classifyList);
        }

        System.out.println(set);
        list.forEach(System.out::println);
    }
}

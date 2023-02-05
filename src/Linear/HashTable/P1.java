package Linear.HashTable;

import java.util.Arrays;
import java.util.Hashtable;

public class P1 {
    public static Boolean[] findValueInArray(int[] arr1, int[] arr2) {
        Hashtable <Integer,Integer> ht = new Hashtable <>();

        for (int value : arr1) {
            ht.put(value, value);
        }

        return Arrays.stream(arr2).mapToObj(ht::contains).toArray(Boolean[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findValueInArray(new int[]{1, 3, 5, 7, 9}, new int[]{1, 2, 3, 4, 5})));
    }
}

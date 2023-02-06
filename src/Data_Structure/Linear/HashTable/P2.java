package Data_Structure.Linear.HashTable;

import java.util.Arrays;
import java.util.Hashtable;

public class P2 {
    public static int[] makeTarget(int[] nums, int target) {
        Hashtable <Integer,Integer> ht = new Hashtable <>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (ht.containsKey(nums[i])) {
                res[0] = ht.get(nums[i]);
                res[1] = i;

                return res;
            }

            ht.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeTarget(new int[]{7, 11, 5, 3}, 10)));

    }
}

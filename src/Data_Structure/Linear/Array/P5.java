package Data_Structure.Linear.Array;

import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};

        System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
    }
}


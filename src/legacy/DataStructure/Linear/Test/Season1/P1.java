package legacy.DataStructure.Linear.Test.Season1;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 7, 9, 5};
        int[] modifiedArr = modification(arr);
        int[] revertArr = revert(modifiedArr);
        System.out.println("변경 전 : " + Arrays.toString(arr));
        System.out.println("변경 후 : " + Arrays.toString(modifiedArr));
        System.out.println("원복 후 : " + Arrays.toString(revertArr));

        System.out.println("=========================");

        arr = new int[]{3, 2, 6, 8};
        modifiedArr = modification(arr);
        revertArr = revert(modifiedArr);
        System.out.println("변경 전 : " + Arrays.toString(arr));
        System.out.println("변경 후 : " + Arrays.toString(modifiedArr));
        System.out.println("원복 후 : " + Arrays.toString(revertArr));
    }

    public static int[] revert(int[] arr) {
        int[] revertArr = new int[arr.length];

        int idx = 0;

        for (int k : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (revertArr[idx] == 0) {
                    break;
                }
                idx = (idx + 1) % arr.length;
            }
            revertArr[idx] = k;
            idx = (idx + k) % arr.length;
        }
        return revertArr;
    }

    public static int[] modification(int[] arr) {
        int[] arrNew = new int[arr.length];

        int idx = 0;
        int cnt = 0;
        int val = arr[idx];

        while (cnt < arr.length) {
            while (val == 0) {
                idx = (idx + 1) % arr.length;
                val = arr[idx];
            }
            arrNew[cnt++] = val;
            arr[idx] = 0;
            idx = (val + idx) % arr.length;
            val = arr[idx];
        }
        return arrNew;
    }
}

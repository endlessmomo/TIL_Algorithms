package Data_Structure.Linear.Array;

public class P2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 10, 100, 1, 1, 1, 100};
        int target = 1;
        int targetIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                targetIdx = i;
            }
        }

        System.out.println(targetIdx);
    }
}

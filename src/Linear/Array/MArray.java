package Linear.Array;

import java.util.Arrays;

class MakeArray {
    int[] arr;

    MakeArray(int size) {
        this.arr = new int[size];
    }

    public void insertData(int idx, int data) {
        if (idx < 0 || idx > this.arr.length) {
            System.out.println("Index Error");
            return;
        }

        int[] arrDup = this.arr.clone();
        this.arr = new int[this.arr.length + 1];

        this.arr[idx] = data;
        for (int i = 0; i < idx; i++) {
            this.arr[i] = arrDup[i];
        }

        for (int i = idx + 1; i < arr.length; i++) {
            this.arr[i] = arrDup[i - 1];
        }
    }

    public void removeData(int data) {
        int targetIdx = -1;

        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == data) {
                targetIdx = i;
                break;
            }
        }

        if (targetIdx != -1) {
            int[] arrDup = this.arr.clone();
            this.arr = new int[this.arr.length - 1];

            for (int i = 0; i < targetIdx; i++) {
                this.arr[i] = arrDup[i];
            }

            for (int i = targetIdx; i < this.arr.length; i++) {
                this.arr[i] = arrDup[i + 1];
            }
        }
    }
}

public class MArray {
    public static void main(String[] args) {


        int size = 5;
        MakeArray makeArr = new MakeArray(5);

        for (int i = 0; i < size; i++) {
            makeArr.arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(makeArr.arr));

        makeArr.insertData(2, 20);
        System.out.println(Arrays.toString(makeArr.arr));

        makeArr.removeData(2);
        System.out.println(Arrays.toString(makeArr.arr));
    }
}

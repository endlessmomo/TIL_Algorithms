package beakjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_20115 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        /*int[] array = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
        System.out.println((max + Arrays.stream(array).filter(i -> i != max).mapToDouble(i -> i / 2.0).sum()));*/

        double[] array = Arrays.stream(in.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double max = Arrays.stream(array).max().orElse(-1);
        System.out.println((max + Arrays.stream(array).filter(i -> i != max).map(i -> i / 2.0).sum()));
    }
}



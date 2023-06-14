package beakjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_20300 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        long[] array = Arrays.stream(in.readLine().split(" ")).mapToLong(Long::parseLong).sorted().toArray();

        System.out.println(array.length % 2 == 1 ? array[array.length-1] : array[array.length-1] + array[0]);
        List<Integer> list = new ArrayList<>(1);
    }
}
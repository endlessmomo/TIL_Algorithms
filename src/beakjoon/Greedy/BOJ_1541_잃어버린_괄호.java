package beakjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class BOJ_1541_잃어버린_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MIN_VALUE;

        for (String formula : in.readLine().split("-")) {
            int tmp = 0;
            for (String val : formula.split("\\+")) {
                tmp += Integer.parseInt(val);
            }

            if(sum == Integer.MIN_VALUE){
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }

        System.out.println(sum);
    }
}

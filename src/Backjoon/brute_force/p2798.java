package Backjoon.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int aim = Integer.parseInt(st.nextToken());

        List <Integer> list = new ArrayList <>();

        st = new StringTokenizer(in.readLine());
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(blackJack(list, aim));
    }

    static int blackJack(List <Integer> list, int aim) {
        int res = 0;
        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    int tmp = 0;
                    tmp = list.get(i) + list.get(j) + list.get(k);

                    if(tmp < aim) {
                        res = Math.max(res, tmp);
                    } else if (tmp == aim){
                        return tmp;
                    }
                }
            }
        }
        return res;
    }
}
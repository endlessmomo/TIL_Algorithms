package programmers.Lv1;

import java.util.Stack;

public class HateSameDigit {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr){
        Stack<Integer> s = new Stack <>();
        s.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(s.peek() != arr[i]){
                s.add(arr[i]);
            }
        }
        return s.stream().mapToInt(Integer::intValue).toArray();
    }
}

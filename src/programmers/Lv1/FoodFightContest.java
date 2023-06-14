package programmers.Lv1;

public class FoodFightContest {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,3,4,6}));
        System.out.println(solution(new int[] {1,7,1,2}));
    }

    public static String solution(int[] food){
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++ ){
                sb.append(i);
            }
        }

        return sb.toString() + "0" + sb.reverse().toString();
    }
}

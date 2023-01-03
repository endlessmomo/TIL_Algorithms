package Programmers.Lv1;

public class AddMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2}, {2,3}};
        int[][] matrix2 = {{3,4}, {5,6}};

        System.out.println(solution(matrix1, matrix2));
    }

    public static int[][] solution(int[][] m1, int[][] m2){
        int[][] res = m1;
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;
    }
}

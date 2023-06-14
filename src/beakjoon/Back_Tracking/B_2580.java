//package Backjoon.Back_Tracking;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class B_2580 {
//    static int[][] map = new int[9][9];
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i = 0; i < map.length; i++) {
//            String row = br.readLine();
//            int j = 0;
//            for (String value : row.split("")) {
//                map[i][j++] = Integer.parseInt(value);
//            }
//        }
//        dfs(0);
//    }
//
//    public static void dpf(){
//        break;
//    }
//    /*
//    * 전제 조건
//    * 같은 열, 행, 3x3 내에 같은 숫자가 존재하면 안됨
//    *
//    * 유망 여부를 파악하기 위해
//    * 로우, 열, 3x3 내 숫자 여부 파악
//    * */
//    public static void dfs(int row) {
//        for (int i = row; row < map.length; i++) {
//
//            for (int j = 0; j < map[i].length; j++) {
//                if(map[i][j] != 0){
//                    continue;
//                }
//
//                visited[j] = true;
//                rowBlankCnt[i]--;
//                dfs(row+1);
//            }
//        }
//    }
//}

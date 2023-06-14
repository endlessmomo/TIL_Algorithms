package programmers.Lv2;

import java.util.Deque;
import java.util.LinkedList;

public class ShortestRoutine {
    public static void main(String[] args) {
        int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(map));
    }

    private static Deque <int[]> dq = new LinkedList <>();
    private static int[][] move = {{1,0}, {-1,0}, {0, 1}, {0, -1}};
    private static int[][] cntMap;
    public static int solution(int[][] map){
        cntMap = new int[map.length][map[0].length];
        dq.add(new int[]{0,0});

        cntMap[0][0] = 1;
        dfs(map);

        int answer = cntMap[map.length-1][map[0].length - 1];
        if(answer == 0){
            return -1;
        }

        return answer;
    }

    public static void dfs(int[][] map){
        while(!dq.isEmpty()){
            int[] value = dq.poll();
            int x = value[0];
            int y = value[1];

            for(int i = 0; i < move.length; i++){
                int nX = x + move[i][0];
                int nY = y + move[i][1];

                if(nX < 0 || nX > map.length - 1 || nY < 0 || nY > map[0].length - 1){
                    continue;
                }

                if(map[nX][nY] == 1 && cntMap[nX][nY] == 0){
                    cntMap[nX][nY] = cntMap[x][y] + 1;
                    dq.add(new int[]{nX, nY});
                }
            }
        }
    }
}

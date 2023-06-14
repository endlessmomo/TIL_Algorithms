package programmers.Lv3;

public class Network {
    /*
     * 2개의 네트워크 A-B , C
     *    A  B  C
     * A  1  1  0
     * B  1  1  0
     * C  0  0  1
     *
     * 2개의 네트워크  A-D-B, C
     *    A  B  C  D
     * A  1  1  0  1
     * B  1  1  0  0
     * C  0  0  1  0
     * D  1  0  0  0
     *
     * Boolean 값을 통한 노드가 다른 노드와 연결이 됐었는지 여부를 파악한다.
     */
    public static void main(String[] args) {
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int n = 3;
        System.out.println(solution(n, computers));
    }


    static boolean[] visited;

    public static int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int res = 0;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                dfs(i, computers);
                res++;
            }
        }
        return res;
    }

    public static void dfs(int networkN, int[][] computers) {
        visited[networkN] = true;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[networkN][i] == 1) {
                dfs(i, computers);
            }
        }
    }
}

package programmers.Lv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TravelRoute {
    public static void main(String[] args) {
        /*String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(Arrays.toString(solution(tickets)));*/

        String[][] tickets = new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"},
                {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        System.out.println(Arrays.toString(solution(tickets)));

    }

    static List <String> allRoute = new ArrayList <>();
    static boolean[] visited;
    public static String[] solution(String[][] tickets) {
        Arrays.sort(tickets, new Comparator <String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });

        visited = new boolean[tickets.length];
        dfs("ICN", "ICN", 0, tickets);
        return allRoute.get(0).split(" ");
    }

    public static void dfs(String start, String route, int cnt, String[][] tickets) {
        if (cnt == tickets.length) {
            allRoute.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if(tickets[i][0].equals(start) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1],  route+ " " + tickets[i][1], cnt+1, tickets);
                visited[i] = false;
            }
        }
    }


}

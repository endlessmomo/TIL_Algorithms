package Programmers.Lv2;

import java.util.HashSet;
import java.util.Set;

public class VisitedLength {
    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));
        System.out.println(solution("LULLLLLLU"));
        System.out.println(solution("RRRRRR"));
        System.out.println(solution("RRRRRRDDDDDD"));
        System.out.println(solution("RRUUDDLL"));

    }

    public static int solution(String dirs) {
        // y축
        int row = 5;
        // x축
        int col = 5;

        Set <String> road = new HashSet <>();

        for (String direction : dirs.split("")) {
            if (direction.equals("U") && row > 0) {
                int prevRow = row;
                row = row - 1;
                road.add(prevRow + "" + col + "" + row + "" + col);
            } else if (direction.equals("D") && row < 10) {
                int prevRow = row;
                row = row + 1;
                road.add(row + "" + col + "" + prevRow + "" + col);
            } else if (direction.equals("L") && col > 0) {
                int prevCol = col;
                col = col - 1;
                road.add(row + "" + prevCol + "" + row + "" + col);
            } else if (direction.equals("R") && col < 10) {
                int prevCol = col;
                col = col + 1;
                road.add(row + "" + col + "" + row + "" + prevCol);
            } else
                continue;
        }
        System.out.println(road);
        return road.size();
    }
}

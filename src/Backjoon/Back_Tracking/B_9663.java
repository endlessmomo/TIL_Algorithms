package Backjoon.Back_Tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* n-Queen 문제
* 풀이 방법
* 같은 행과 열, 대각선의 퀸이 존재해선 안된다.
*
* 1. 배열을 활용한다. idx = row,  value = col
* 2. boolean[] put을 이용하여 이미 둔 위치 여부를 파악한다
* 3. 대각선에 놓여진 퀸이 없는지 유망해보고 없다면 해당 위치를 선점한다.
* 4. 모든 row에 퀸을 배치했다면 결과값을 증가시킨다.
*
* 주요 로직
* for (int i = 0; i < row; i++) {
*    if (row - i == Math.abs(board[row] - board[i]))
*       return false;
* }
*
* 반복문을 통해 이전 로우들을 위에서부터 대각선 검증
* 로우는 위로 1개씩 열은 대각선을 확인하기 위해 현재보다 -1, +1된 상태
* */
public class B_9663 {
    static int N;
    static int ans = 0;
    static boolean[] put;
    static int[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        put = new boolean[N];
        board = new int[N];

        nQueen(0);
        System.out.println(ans);
    }

    public static void nQueen(int row) {
        if (row == N) {
            ans++;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!put[i]) {
                put[i] = true;
                board[row] = i;
                if (promising(row)) {
                    nQueen(row + 1);
                }
                put[i] = false;
            }
        }
    }

    public static boolean promising(int row) {
        // 대각선 여부를 파악한다.
        for (int i = 0; i < row; i++) {
            if (row - i == Math.abs(board[row] - board[i])) {
                return false;
            }
        }
        return true;
    }
}

/*
. . . . x 3-4 5-4
. . . x .
. . . x .

. 2 . .
. . . 4
1 . . .
. . 3 .

. . 3 .
1 . . .
. . . 4
. 2 . .

. . . 4
*/

/*
 *   1  2  3  4  --> 3
 * 1 .  .  3  .      1
 * 2 1  .  .  .      4
 * 3 .  .  .  4      2
 * 4 .  2  .  .
 * */
/*
 * . 2 . .
 * . . . 4
 * 1 . . .
 * . . 3 .
 *
 * 1 . . .
 * . . 3 .
 * . 2 . .
 * . . . 4
 * */

/*
 * . 2 . . board[0] = 2
 * 1 . . . board[1] = 1
 * . . . 4 board[2] = 4
 * . . 3 . board[3] = 3
 * */

/*
 * 1 . . . board[0] = 1
 * . 2 . . board[1] = 2
 * . . 3 . board[2] = 3
 *
 * */

/*
* x . .
* . . x
* . x .
* */
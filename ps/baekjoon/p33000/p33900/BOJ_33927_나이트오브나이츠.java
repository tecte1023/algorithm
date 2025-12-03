/*
 * 문제: 백준 33927번 - 나이트 오브 나이츠 (https://www.acmicpc.net/problem/33927)
 * 문제 풀이
 *  백트래킹을 사용하여, 보드의 모든 칸을 순차적으로 방문하며 나이트를 배치할지 여부를 결정.
 *  모든 칸에 대한 결정이 끝났을 때, 확보한 점수의 총합을 비교하여 최댓값 갱신.
 *
 * 시간 복잡도: O(2^(n²))
 */

package ps.baekjoon.p33000.p33900;

import java.io.*;
import java.util.*;

public class BOJ_33927_나이트오브나이츠 {
    // public class Main {
    private static int n;
    private static int[][] board;
    private static boolean[][] visited;
    private static final int[] dr = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static final int[] dc = {-1, 1, -2, 2, -2, 2, -1, 1};
    private static int max = 0;

    private static void backtracking(int x, int y, int score) {
        if (x == n) {
            max = Math.max(max, score);

            return;
        }

        int nx = x;
        int ny = y + 1;
        boolean canPlace = true;

        if (ny == n) {
            nx = x + 1;
            ny = 0;
        }

        for (int i = 0; i < 8; i++) {
            int nr = x + dr[i];
            int nc = y + dc[i];

            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                if (visited[nr][nc]) {
                    canPlace = false;
                    break;
                }
            }
        }

        if (canPlace) {
            visited[x][y] = true;
            backtracking(nx, ny, score + board[x][y]);
            visited[x][y] = false;
        }

        backtracking(nx, ny, score);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        backtracking(0, 0, 0);
        bw.write(Integer.toString(max));
        br.close();
        bw.close();
    }
}

/*
 * 문제: 백준 1520번 - 내리막 길 (https://www.acmicpc.net/problem/1520)
 * 문제 풀이
 *  단순히 모든 경로를 탐색하면 지수 시간 복잡도가 발생하므로, Top-down DP를 적용.
 *  특정 지점에서 목표 지점까지 갈 수 있는 경로의 수를 기록하여, 중복되는 경로 계산을 방지함.
 *  내리막길로만 이동한다는 조건이 사이클 발생을 막아줌.
 *  방문하지 않은 칸은 -1로 초기화하여 '경로가 0개인 경우'와 '아직 탐색하지 않은 경우'를 구분.
 *
 * 시간 복잡도: O(n * m)
 *  n: 열의 개수
 *  m: 행의 개수
 */

package baekjoon.p01000.p01500;

import java.io.*;
import java.util.*;

public class BOJ_1520_내리막길 {
    // public class Main {
    private static int rowCount, colCount;
    private static int[][] map, dp;

    private static final int[] DR = {-1, 0, 1, 0};
    private static final int[] DC = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        rowCount = Integer.parseInt(st.nextToken());
        colCount = Integer.parseInt(st.nextToken());
        map = new int[rowCount][colCount];
        dp = new int[rowCount][colCount];

        for (int r = 0; r < rowCount; r++) {
            st = new StringTokenizer(br.readLine());

            for (int c = 0; c < colCount; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
                dp[r][c] = -1;
            }
        }

        dp[0][0] = 1;
        System.out.print(dfs(rowCount - 1, colCount - 1));
    }

    private static int dfs(int r, int c) {
        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        dp[r][c] = 0;

        for (int i = 0; i < 4; i++) {
            int prevR = r + DR[i];
            int prevC = c + DC[i];

            if (isValid(prevR, prevC) && map[prevR][prevC] > map[r][c]) {
                dp[r][c] += dfs(prevR, prevC);
            }
        }

        return dp[r][c];
    }

    private static boolean isValid(int r, int c) {
        return r >= 0 && r < rowCount && c >= 0 && c < colCount;
    }
}

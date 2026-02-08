/*
 * 문제: 백준 25682번 - 체스판 다시 칠하기 2 (https://www.acmicpc.net/problem/25682)
 *  체스판의 두 가지 패턴인 맨 왼쪽 위가 검은색인 경우와 흰색인 경우에 대해 각각 칠해야 하는 칸의 개수를 계산.
 *  슬라이딩 윈도우 기법을 2차원으로 확장하여 적용.
 *  각 행에 대해 길이가 `k`인 구간의 칠해야 하는 칸의 개수를 먼저 계산.
 *  한 칸씩 옆으로 이동하며 새로 들어오는 칸과 나가는 칸의 차이만 반영하여 행별 구간합을 갱신.
 *  행별로 구해진 구간합들을 다시 열 방향으로 슬라이딩 윈도우 방식을 적용하여 최종적인 `k * k` 크기의 합을 구함.
 *  두 가지 패턴에 대한 값을 동시에 관리하며, 매 윈도우 이동 시마다 최솟값을 갱신하여 결과적으로 가장 적게 칠하는 경우를 도출.
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p25000.p25600;

import java.io.*;
import java.util.*;

public class BOJ_25682_체스판다시칠하기2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[][] board = new boolean[n][m];
        int[][][] rowCnt = new int[n][m - k + 1][2];
        int[][][] cnt = new int[n - k + 1][m - k + 1][2];
        int min = n * m;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j) == 'B';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (((i + j) % 2 == 0) ^ board[i][j]) {
                    rowCnt[i][0][1]++;
                } else {
                    rowCnt[i][0][0]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - k; j++) {
                rowCnt[i][j + 1][0] = rowCnt[i][j][0];
                rowCnt[i][j + 1][1] = rowCnt[i][j][1];

                if (((i + j) % 2 == 0) ^ board[i][j]) {
                    rowCnt[i][j + 1][1]--;
                } else {
                    rowCnt[i][j + 1][0]--;
                }

                if (((i + j + k) % 2 == 0) ^ board[i][j + k]) {
                    rowCnt[i][j + 1][1]++;
                } else {
                    rowCnt[i][j + 1][0]++;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= m - k; j++) {
                cnt[0][j][0] += rowCnt[i][j][0];
                cnt[0][j][1] += rowCnt[i][j][1];
            }
        }

        for (int i = 0; i <= m - k; i++) {
            min = Math.min(min, Math.min(cnt[0][i][0], cnt[0][i][1]));
        }

        for (int i = 0; i < n - k; i++) {
            for (int j = 0; j <= m - k; j++) {
                cnt[i + 1][j][0] = cnt[i][j][0] - rowCnt[i][j][0] + rowCnt[i + k][j][0];
                cnt[i + 1][j][1] = cnt[i][j][1] - rowCnt[i][j][1] + rowCnt[i + k][j][1];
                min = Math.min(min, Math.min(cnt[i + 1][j][0], cnt[i + 1][j][1]));
            }
        }

        bw.write(Integer.toString(min));
        br.close();
        bw.close();
    }
}

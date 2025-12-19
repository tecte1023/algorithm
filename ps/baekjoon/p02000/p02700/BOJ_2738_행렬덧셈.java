/*
 * 문제: 백준 2738번 - 행렬 덧셈 (https://www.acmicpc.net/problem/2738)
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p02000.p02700;

import java.io.*;
import java.util.*;

public class BOJ_2738_행렬덧셈 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < m; j++) {
                    arr[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

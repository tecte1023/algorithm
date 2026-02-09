/*
 * 문제: 백준 2740번 - 행렬 곱셈 (https://www.acmicpc.net/problem/2740)
 *
 * 시간 복잡도: O(n * m * k)
 */

package baekjoon.p02000.p02700;

import java.io.*;
import java.util.*;

public class BOJ_2740_행렬곱셈 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int k = Integer.parseInt(br.readLine().split(" ")[1]);
        int[][] b = new int[m][k];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < k; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                int sum = 0;

                for (int l = 0; l < m; l++) {
                    sum += a[i][l] * b[l][j];
                }

                sb.append(sum).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

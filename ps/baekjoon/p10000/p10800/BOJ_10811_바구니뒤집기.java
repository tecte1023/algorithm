/*
 * 문제: 백준 10811번 - 바구니 뒤집기 (https://www.acmicpc.net/problem/10811)
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10811_바구니뒤집기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] baskets = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            baskets[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = (b - a - 1) / 2; j >= 0; j--) {
                int c = baskets[a + j];

                baskets[a + j] = baskets[b - j];
                baskets[b - j] = c;
            }
        }

        for (int i = 1; i <= n; i++) {
            sb.append(baskets[i]).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

/*
 * 문제: 백준 10813번 - 공 바꾸기 (https://www.acmicpc.net/problem/10813)
 *
 * 시간 복잡도: O(n + m)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10813_공바꾸기 {
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
            int c = baskets[a];

            baskets[a] = baskets[b];
            baskets[b] = c;
        }

        for (int i = 1; i <= n; i++) {
            sb.append(baskets[i]).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

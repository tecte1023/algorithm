/*
 * 문제: 백준 10810번 - 공 넣기 (https://www.acmicpc.net/problem/10810)
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10810_공넣기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int l = i; l <= j; l++) {
                basket[l] = k;
            }
        }

        for (int i = 1; i <= n; i++) {
            sb.append(basket[i]).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

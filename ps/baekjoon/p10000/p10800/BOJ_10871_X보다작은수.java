/*
 * 문제: 백준 10871번 - X보다 작은 수 (https://www.acmicpc.net/problem/10871)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10871_X보다작은수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num < x) {
                sb.append(num).append(" ");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

/*
 * 문제: 백준 2439번 - 별 찍기 - 2 (https://www.acmicpc.net/problem/2439)
 *
 * 시간 복잡도: O(n²)
 */

package baekjoon.p02000.p02400;

import java.io.*;

public class BOJ_2439_별찍기2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                sb.append(i < j ? ' ' : '*');
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

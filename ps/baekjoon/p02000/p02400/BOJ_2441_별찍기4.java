/*
 * 문제: 백준 2441번 - 별 찍기 - 4 (https://www.acmicpc.net/problem/2441)
 *
 * 시간 복잡도: O(n²)
 */

package baekjoon.p02000.p02400;

import java.io.*;

public class BOJ_2441_별찍기4 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(j < i ? ' ' : '*');
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

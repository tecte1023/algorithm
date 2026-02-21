/*
 * 문제: 백준 2440번 - 별 찍기 - 3 (https://www.acmicpc.net/problem/2440)
 *
 * 시간 복잡도: O(n²)
 */

package baekjoon.p02000.p02400;

import java.io.*;

public class BOJ_2440_별찍기3 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

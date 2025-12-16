/*
 * 문제: 백준 2444번 - 별 찍기 - 7 (https://www.acmicpc.net/problem/2444)
 *
 * 시간 복잡도: O(n²)
 */

package baekjoon.p02000.p02400;

import java.io.*;

public class BOJ_2444_별찍기7 {
    // public class Main {
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            appendRow(n - i - 1, i * 2 + 1);
        }

        for (int i = n - 2; i >= 0; i--) {
            appendRow(n - i - 1, i * 2 + 1);
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static void appendRow(int spaceCount, int starCount) {
        for (int j = 0; j < spaceCount; j++) {
            sb.append(" ");
        }

        for (int j = 0; j < starCount; j++) {
            sb.append("*");
        }

        sb.append("\n");
    }
}

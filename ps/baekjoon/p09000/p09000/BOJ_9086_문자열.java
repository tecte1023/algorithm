/*
 * 문제: 백준 9086번 - 문자열 (https://www.acmicpc.net/problem/9086)
 *
 * 시간 복잡도: O(t)
 */

package baekjoon.p09000.p09000;

import java.io.*;

public class BOJ_9086_문자열 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String str = br.readLine();

            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

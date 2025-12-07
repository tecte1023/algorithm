/*
 * 문제: 백준 2739번 - 구구단 (https://www.acmicpc.net/problem/2739)
 *
 * 시간 복잡도: O(l)
 *  l: 구구단의 범위
 */

package baekjoon.p02000.p02700;

import java.io.*;

public class BOJ_2739_구구단 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            sb.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

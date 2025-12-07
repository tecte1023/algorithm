/*
 * 문제: 백준 15552번 - 빠른 A+B (https://www.acmicpc.net/problem/15552)
 *
 * 시간 복잡도: O(t)
 */

package baekjoon.p15000.p15500;

import java.io.*;
import java.util.*;

public class BOJ_15552_빠른AB {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

/*
 * 문제: 백준 11021번 - A+B - 7 (https://www.acmicpc.net/problem/11021)
 *
 * 시간 복잡도: O(t)
 */

package baekjoon.p11000.p11000;

import java.io.*;
import java.util.*;

public class BOJ_11021_AB7 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(a + b).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

/*
 * 문제: 백준 10818번 - 최소, 최대 (https://www.acmicpc.net/problem/10818)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10818_최소최대 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        bw.write(min + " " + max);
        br.close();
        bw.close();
    }
}

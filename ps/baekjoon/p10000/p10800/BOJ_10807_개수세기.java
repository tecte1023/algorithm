/*
 * 문제: 백준 10807번 - 개수 세기 (https://www.acmicpc.net/problem/10807)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10807_개수세기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == v) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}

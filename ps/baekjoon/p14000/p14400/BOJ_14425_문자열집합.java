/*
 * 문제: 백준 14425번 - 문자열 집합 (https://www.acmicpc.net/problem/14425)
 *
 * 시간 복잡도: O(n + m)
 */

package baekjoon.p14000.p14400;

import java.io.*;
import java.util.*;

public class BOJ_14425_문자열집합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}

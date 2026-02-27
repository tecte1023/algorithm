/*
 * 문제: 백준 3273번 - 두 수의 합 (https://www.acmicpc.net/problem/3273)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p03000.p03200;

import java.io.*;
import java.util.*;

public class BOJ_3273_두수의합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int x = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int a : set) {
            if (set.contains(x - a)) {
                cnt++;
            }
        }

        cnt /= 2;
        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}

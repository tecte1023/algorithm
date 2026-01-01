/*
 * 문제: 백준 14215번 - 세 막대 (https://www.acmicpc.net/problem/14215)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p14000.p14200;

import java.io.*;
import java.util.*;

public class BOJ_14215_세막대 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(st.nextToken());

            if (n > max) {
                sum += max;
                max = n;
            } else {
                sum += n;
            }
        }

        bw.write(Integer.toString(sum + Math.min(max, sum - 1)));
        br.close();
        bw.close();
    }
}

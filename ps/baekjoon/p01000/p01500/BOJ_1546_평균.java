/*
 * 문제: 백준 1546번 - 평균 (https://www.acmicpc.net/problem/1546)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p01000.p01500;

import java.io.*;
import java.util.*;

public class BOJ_1546_평균 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] grade = new int[n];
        double max = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            grade[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, grade[i]);
            sum += grade[i];
        }

        bw.write(Double.toString(sum / max * 100 / n));
        br.close();
        bw.close();
    }
}

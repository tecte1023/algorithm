/*
 * 문제: 백준 25305번 - 커트라인 (https://www.acmicpc.net/problem/25305)
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p25000.p25300;

import java.io.*;
import java.util.*;

public class BOJ_25305_커트라인 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        bw.write(Integer.toString(score[n - k]));
        br.close();
        bw.close();
    }
}

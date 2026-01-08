/*
 * 문제: 백준 10989번 - 수 정렬하기 3 (https://www.acmicpc.net/problem/10989)
 *
 * 시간 복잡도: O(n + m)
 *  m: 수의 최대값
 */

package baekjoon.p10000.p10900;

import java.io.*;

public class BOJ_10989_수정렬하기3 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10_001];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

/*
 * 문제: 백준 2750번 - 수 정렬하기 (https://www.acmicpc.net/problem/2750)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p02000.p02700;

import java.io.*;
import java.util.*;

public class BOJ_2750_수정렬하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

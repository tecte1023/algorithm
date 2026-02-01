/*
 * 문제: 백준 2559번 - 수열 (https://www.acmicpc.net/problem/2559)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p02000.p02500;

import java.io.*;
import java.util.*;

public class BOJ_2559_수열 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            max = Math.max(max, sum);
        }

        bw.write(Integer.toString(max));
        br.close();
        bw.close();
    }
}

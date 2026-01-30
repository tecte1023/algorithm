/*
 * 문제: 백준 24060번 - 알고리즘 수업 - 병합 정렬 1 (https://www.acmicpc.net/problem/24060)
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p24000.p24000;

import java.io.*;
import java.util.*;

public class BOJ_24060_알고리즘수업병합정렬1 {
    // public class Main {
    private static int k;
    private static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];

        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(a, 0, n - 1);
        bw.write(Integer.toString(result));
        br.close();
        bw.close();
    }

    private static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;

            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        int[] tmp = new int[r - p + 1];

        while (i <= q && j <= r) {
            tmp[t++] = a[i] <= a[j] ? a[i++] : a[j++];
        }

        while (i <= q) {
            tmp[t++] = a[i++];
        }

        while (j <= r) {
            tmp[t++] = a[j++];
        }

        i = p;
        t = 0;

        while (i <= r) {
            if (--k == 0) {
                result = tmp[t];
            }

            a[i++] = tmp[t++];
        }
    }
}

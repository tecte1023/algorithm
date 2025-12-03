/*
 * 문제: 백준 23969번 - 알고리즘 수업 - 버블 정렬 2 (https://www.acmicpc.net/problem/23969)
 *
 * 시간 복잡도: O(n²)
 */

package baekjoon.p23000.p23900;

import java.io.*;
import java.util.*;

public class BOJ_23969_알고리즘수업버블정렬2 {
    // public class Main {
    private static int n, k, cnt = 0;
    private static int[] a;
    private static final StringBuilder sb = new StringBuilder();

    private static void bubble_sort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];

                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    cnt++;

                    if (cnt == k) {
                        for (int l = 0; l < n; l++) {
                            sb.append(a[l]).append(" ");
                        }

                        return;
                    }
                }
            }
        }

        sb.append(-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bubble_sort();
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

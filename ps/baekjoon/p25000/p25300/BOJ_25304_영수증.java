/*
 * 문제: 백준 25304번 - 영수증 (https://www.acmicpc.net/problem/25304)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p25000.p25300;

import java.io.*;
import java.util.*;

public class BOJ_25304_영수증 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum += a * b;
        }

        bw.write(x == sum ? "Yes" : "No");
        br.close();
        bw.close();
    }
}

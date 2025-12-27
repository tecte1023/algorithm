/*
 * 문제: 백준 2501번 - 약수 구하기 (https://www.acmicpc.net/problem/2501)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p02000.p02500;

import java.io.*;
import java.util.*;

public class BOJ_2501_약수구하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int divisor = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && --k == 0) {
                divisor = i;
                break;
            }
        }

        bw.write(Integer.toString(divisor));
        br.close();
        bw.close();
    }
}

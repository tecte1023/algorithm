/*
 * 문제: 백준 10872번 - 팩토리얼 (https://www.acmicpc.net/problem/10872)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p10000.p10800;

import java.io.*;

public class BOJ_10872_팩토리얼 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int f = 1;

        for (int i = 2; i <= n; i++) {
            f *= i;
        }

        bw.write(Integer.toString(f));
        br.close();
        bw.close();
    }
}

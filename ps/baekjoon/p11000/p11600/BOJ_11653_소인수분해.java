/*
 * 문제: 백준 11653번 - 소인수분해 (https://www.acmicpc.net/problem/11653)
 *
 * 시간 복잡도: O(√n)
 */

package baekjoon.p11000.p11600;

import java.io.*;

public class BOJ_11653_소인수분해 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sb.append(i).append("\n");
                n /= i;
            }
        }

        if (n > 1) {
            sb.append(n);
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

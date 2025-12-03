/*
 * 문제: 백준 2417번 - 정수 제곱근 (https://www.acmicpc.net/problem/2417)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02400;

import java.io.*;

public class BOJ_2417_정수제곱근 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long q = (long) Math.sqrt(n);

        if (q * q < n) {
            q++;
        }

        bw.write(Long.toString(q));
        br.close();
        bw.close();
    }
}

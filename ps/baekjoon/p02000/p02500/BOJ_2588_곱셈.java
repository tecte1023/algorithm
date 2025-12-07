/*
 * 문제: 백준 2588번 - 곱셈 (https://www.acmicpc.net/problem/2588)
 *
 * 시간 복잡도: O(n)
 *  n: 자릿수
 */

package baekjoon.p02000.p02500;

import java.io.*;

public class BOJ_2588_곱셈 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = b;
        StringBuilder sb = new StringBuilder();

        while (b > 0) {
            sb.append(a * (b % 10)).append("\n");
            b /= 10;
        }

        sb.append(a * c);
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}

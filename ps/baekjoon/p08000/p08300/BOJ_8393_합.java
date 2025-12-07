/*
 * 문제: 백준 8393번 - 합 (https://www.acmicpc.net/problem/8393)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p08000.p08300;

import java.io.*;

public class BOJ_8393_합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(n * (n + 1) / 2));
        br.close();
        bw.close();
    }
}

/*
 * 문제: 백준 15439번 - 베라의 패션 (https://www.acmicpc.net/problem/15439)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p15000.p15400;

import java.io.*;

public class BOJ_15439_베라의패션 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(n * n - n));
        br.close();
        bw.close();
    }
}

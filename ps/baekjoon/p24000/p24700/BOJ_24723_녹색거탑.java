/*
 * 문제: 백준 24723번 - 녹색거탑 (https://www.acmicpc.net/problem/24723)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p24000.p24700;

import java.io.*;

public class BOJ_24723_녹색거탑 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(Integer.toString((int) Math.pow(2, n)));
        br.close();
        bw.close();
    }
}

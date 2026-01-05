/*
 * 문제: 백준 24266번 - 알고리즘 수업 - 알고리즘의 수행 시간 5 (https://www.acmicpc.net/problem/24266)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p24000.p24200;

import java.io.*;

public class BOJ_24266_알고리즘수업알고리즘의수행시간5 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());

        bw.write((n * n * n) + "\n3");
        br.close();
        bw.close();
    }
}

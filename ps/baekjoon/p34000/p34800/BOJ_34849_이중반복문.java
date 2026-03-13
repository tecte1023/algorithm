/*
 * 문제: 백준 34849번 - 이중 반복문 (https://www.acmicpc.net/problem/34849)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p34000.p34800;

import java.io.*;

public class BOJ_34849_이중반복문 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(n > 10000 ? "Time limit exceeded" : "Accepted");
    }
}
